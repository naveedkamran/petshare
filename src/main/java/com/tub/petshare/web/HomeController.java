package com.tub.petshare.web;

import com.datenc.commons.ui.AppMessageUtil;
import com.tub.petshare.apputil.ObjFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Autowired
    private ObjFactory objFactory;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String helloWorld() {
        return "PetShare server 1.0";
    }

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    @ResponseBody
    public String ping() {
        return AppMessageUtil.getInstance().getResponseJSON(true, "ping successful");
    }

}
