package com.zipadee.choreapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("login")
public class LoginController {

    @RequestMapping(value = "")
    public String index() {
        return "login/index";

    }

}
