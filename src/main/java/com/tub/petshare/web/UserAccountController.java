package com.tub.petshare.web;

import com.datenc.commons.ui.AppMessage;
import com.mongodb.client.FindIterable;
import com.tub.petshare.apputil.ObjFactory;
import com.tub.petshare.domain.UserAccount;
import com.tub.petshare.service.UserAccountService;
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
public class UserAccountController {

    @Autowired
    private ObjFactory objFactory;

    public Map castToMap(UserAccount userAccount) {
        Map<String, Object> map = new HashMap();

        map.put("username", userAccount.getUsername());
        map.put("password", userAccount.getPassword());

        return map;
    }

    @RequestMapping(value = "/userAccount", method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Void> create(@RequestBody UserAccount userAccount,
            UriComponentsBuilder ucBuilder) {
        HttpHeaders headers = new HttpHeaders();

        if (UserAccountService.getInstance().readByUsername(userAccount.getUsername()) != null) {
            return new ResponseEntity<Void>(headers, HttpStatus.BAD_REQUEST);
        }

        UserAccountService.getInstance().create(castToMap(userAccount));

        headers.setLocation(ucBuilder.path("/userAccount/{id}").buildAndExpand(1L).toUri());

        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/userAccount", method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<FindIterable<Document>> list() {
        FindIterable<Document> users = UserAccountService.getInstance().list();

        if (users == null) {
            return new ResponseEntity<FindIterable<Document>>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<FindIterable<Document>>(users, HttpStatus.OK);
    }

    @RequestMapping(value = "/userAccount/{id}", method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Document> getById(@PathVariable(name = "id") String id) {
        Document document = UserAccountService.getInstance().read(id);

        if (document == null) {
            return new ResponseEntity<Document>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Document>(document, HttpStatus.OK);
    }

    @RequestMapping(value = "/userAccount/{id}", method = RequestMethod.PUT,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Document> update(@PathVariable(name = "id") String id,
            @RequestBody UserAccount userAccount) {

        Document docInDb = UserAccountService.getInstance().read(id);
        Document docNew = new Document(castToMap(userAccount));

        if (docInDb == null) {
            return new ResponseEntity<Document>(HttpStatus.NOT_FOUND);
        }

        UserAccountService.getInstance().update(docInDb, docNew);

        return new ResponseEntity<Document>(docInDb, HttpStatus.OK);
    }

    @RequestMapping(value = "/userAccount/{id}", method = RequestMethod.DELETE,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<Void> delete(@PathVariable(name = "id") String id) {
        Document currentDocument = UserAccountService.getInstance().read(id);

        if (currentDocument == null) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }

        UserAccountService.getInstance().delete(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Void> login(@RequestBody UserAccount userAccount) {
        Document doc = UserAccountService.getInstance().readByUsernameAndPass(
                userAccount.getUsername(), userAccount.getPassword());

        HttpHeaders headers = new HttpHeaders();

        if (doc == null) {
            return new ResponseEntity<Void>(headers, HttpStatus.FORBIDDEN);
        }

        return new ResponseEntity<Void>(headers, HttpStatus.OK);
    }

    @RequestMapping(value = "logout", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Void> logout() {
        HttpHeaders headers = new HttpHeaders();

        UserAccountService.getInstance();

        return new ResponseEntity<Void>(headers, HttpStatus.OK);
    }

}
