package com.devjin.muv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
    //게스트 페이지 접근
    @GetMapping("/guest/guestPage")
    public String guestPage() {
        return "/guest/guestPage";
    }

    //멤버 페이지 접근
    @GetMapping("/member/memberPage")
    public String memberPage() {
        return "/member/memberPage";
    }

    //어드민 페이지 접근
    @GetMapping("/admin/adminPage")
    public String adminPage() {
        return "/admin/adminPage";
    }

    //로그인 페이지 접근
    @GetMapping("/login/loginPage")
    public String loginPage() {
        return "/login/loginPage";
    }
}
