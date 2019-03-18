package com.zipadee.choreapp.controllers;

import com.zipadee.choreapp.form.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("login")
public class LoginController {

    //getting login form page
    @RequestMapping(value="", method= RequestMethod.GET)
    public String getLoginForm() {
        return "login/index";
    }
    //checking that user has login credentials
    @RequestMapping(value = "", method=RequestMethod.POST)
    public String login(@ModelAttribute(name="loginForm") LoginForm loginForm, Model model) {

        String username = loginForm.getUsername();
        String password = loginForm.getPassword();

        if("admin".equals(username) && "admin".equals(password)) {
            // if the user is found, redirect to home page
            return "home/home";
        }
        // if user or password is invalid
        model.addAttribute("invalidCredentials", true);
        return "login/index";

    }

}
