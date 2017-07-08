package com.tub.petshare.web;

import com.mongodb.client.FindIterable;
import com.tub.petshare.apputil.ObjFactory;
import com.tub.petshare.domain.Host;
import com.tub.petshare.service.HostService;
import java.util.HashMap;
import java.util.Map;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
public class HostController {

    @Autowired
    private ObjFactory objFactory;

    public Map castToMap(Host host) {
        Map<String, Object> map = new HashMap();

        map.put("age", host.getAge());
        map.put("contact", host.getContact());
        map.put("description", host.getDescription());
        map.put("gender", host.getGender());
        map.put("hostaAttributes", host.getHostaAttributes());
        map.put("id", host.getId());
        map.put("location", host.getLocation());
        map.put("name", host.getName());
        map.put("petAttributes", host.getPetAttributes());
        map.put("picture", host.getPicture());

        return map;
    }

    @RequestMapping(value = "/host", method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Void> create(@RequestBody Host host,
            UriComponentsBuilder ucBuilder) {
        HostService.getInstance().create(castToMap(host));

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/host/{id}").buildAndExpand(1L).toUri());

        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/host", method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<FindIterable<Document>> list() {
        FindIterable<Document> users = HostService.getInstance().list();

        if (users == null) {
            return new ResponseEntity<FindIterable<Document>>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<FindIterable<Document>>(users, HttpStatus.OK);
    }

    @RequestMapping(value = "/host/{id}", method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Document> getById(@PathVariable(name = "id") String id) {
        Document document = HostService.getInstance().read(id);

        if (document == null) {
            return new ResponseEntity<Document>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Document>(document, HttpStatus.OK);
    }

    @RequestMapping(value = "/host/{id}", method = RequestMethod.PUT,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Document> update(@PathVariable(name = "id") String id,
            @RequestBody Host host) {

        Document currentDocument = HostService.getInstance().read(id);

        if (currentDocument == null) {
            return new ResponseEntity<Document>(HttpStatus.NOT_FOUND);
        }

        HostService.getInstance().update(castToMap(host));

        return new ResponseEntity<Document>(currentDocument, HttpStatus.OK);

    }

    @RequestMapping(value = "/host/{id}", method = RequestMethod.DELETE,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Void> delete(@PathVariable(name = "id") String id) {
        Document currentDocument = HostService.getInstance().read(id);

        if (currentDocument == null) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }

        HostService.getInstance().delete(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}