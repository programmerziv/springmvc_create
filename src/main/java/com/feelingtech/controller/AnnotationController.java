package com.feelingtech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnnotationController {
    @RequestMapping("/test3")
    public String handleRequest(){
        System.out.println("AnnotationController run...");
        return "";
    }
}
