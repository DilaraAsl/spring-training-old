package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {
    @RequestMapping("/contact")
    String contact(){
        return "contact.html";
    }
}
