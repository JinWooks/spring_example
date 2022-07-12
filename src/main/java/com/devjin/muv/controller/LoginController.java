package com.devjin.muv.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value = "/access/access_denied_page")
    public String accessDeniedPage() throws Exception {
        return "/access/access_denied_page";
    }

    @RequestMapping(value= "/accounts/logout" ,method= RequestMethod.POST)
    public String Logout() throws Exception {
        return null;
    }
}
