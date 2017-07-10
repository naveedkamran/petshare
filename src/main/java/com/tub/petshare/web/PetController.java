package com.tub.petshare.web;

import com.mongodb.client.FindIterable;
import com.tub.petshare.apputil.ObjFactory;
import com.tub.petshare.domain.Pet;
import com.tub.petshare.domain.RiakFile;
import com.tub.petshare.nosql.RiakUtil;
import com.tub.petshare.service.Constants;
import com.tub.petshare.service.PetService;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
public class PetController {

    @Autowired
    private ObjFactory objFactory;

    public Map castToMap(Pet pet) {
        Map<String, Object> map = new HashMap();

        map.put("age", pet.getAge());
        map.put("contact", pet.getContact());
        map.put("description", pet.getDescription());
        map.put("gender", pet.getGender());
        map.put("id", pet.getId());
        map.put("location", pet.getLocation());
        map.put("name", pet.getName());

        return map;
    }

    @RequestMapping(value = "/pet", method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Void> create(@RequestBody Pet pet,
            UriComponentsBuilder ucBuilder) {
        PetService.getInstance().create(castToMap(pet));

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/pet/{id}").buildAndExpand(1L).toUri());

        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/pet", method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<FindIterable<Document>> list() {
        FindIterable<Document> users = PetService.getInstance().list();

        if (users == null) {
            return new ResponseEntity<FindIterable<Document>>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<FindIterable<Document>>(users, HttpStatus.OK);
    }

    @RequestMapping(value = "/pet/{id}", method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Document> getById(@PathVariable(name = "id") String id) {
        Document document = PetService.getInstance().read(id);

        if (document == null) {
            return new ResponseEntity<Document>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Document>(document, HttpStatus.OK);
    }

    @RequestMapping(value = "/pet/{id}", method = RequestMethod.PUT,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Document> update(@PathVariable(name = "id") String id,
            @RequestBody Pet pet) {
        Document docInDb = PetService.getInstance().read(id);
        Document docNew = new Document(castToMap(pet));

        if (docInDb == null) {
            return new ResponseEntity<Document>(HttpStatus.NOT_FOUND);
        }

        PetService.getInstance().update(docInDb, docNew);

        return new ResponseEntity<Document>(docInDb, HttpStatus.OK);
    }

    @RequestMapping(value = "/pet/{id}", method = RequestMethod.DELETE,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Void> delete(@PathVariable(name = "id") String id) {
        Document currentDocument = PetService.getInstance().read(id);

        if (currentDocument == null) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }

        PetService.getInstance().delete(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(value = "/pet/pic/{id}", method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Void> updatePic(
            @PathVariable(name = "id") String id,
            @RequestParam("file") MultipartFile file) {
        Document currentDocument = PetService.getInstance().read(id);
        Document newDocument = PetService.getInstance().read(id);

        if (currentDocument == null) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }

        try {
            new File(Constants.file_repo + "/" + id).mkdirs();

            String fileName = Constants.file_repo + "/" + id + "/" + file.getOriginalFilename();

            file.transferTo(new File(fileName));

            RiakUtil.getInstance().create(new RiakFile(id, fileName), id, "pics");

            newDocument.put("petPicture", file);

            PetService.getInstance().update(currentDocument, newDocument);
        } catch (Exception ex) {
            Logger.getLogger(PetController.class.getName()).log(Level.SEVERE, null, ex);

            return new ResponseEntity<Void>(HttpStatus.EXPECTATION_FAILED);
        }

        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
