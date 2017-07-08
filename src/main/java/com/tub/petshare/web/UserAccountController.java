package com.tub.petshare.web;

import com.datenc.commons.ui.AppMessage;
import com.tub.petshare.apputil.ObjFactory;
import com.tub.petshare.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserAccountController {

    @Autowired
    private ObjFactory objFactory;

    @RequestMapping(value = "/{signup}", method = RequestMethod.POST)
    @ResponseBody
    public AppMessage signup() {
        UserAccountService.getInstance();
        return new AppMessage(true, "--fixme--Profile created");
    }

    @RequestMapping(value = "/{login}", method = RequestMethod.POST)
    @ResponseBody
    public AppMessage login() {
        UserAccountService.getInstance();
        return new AppMessage(true, "--fixme--User private key comes here");
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    @ResponseBody
    public AppMessage logout() {
        UserAccountService.getInstance();
        return new AppMessage(true, "--fixme--User logged out.");
    }
}
