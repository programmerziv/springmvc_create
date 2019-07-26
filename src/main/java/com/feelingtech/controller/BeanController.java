package com.feelingtech.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class BeanController implements Controller {
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("BeanController run...");
        System.out.println("Just adding a letter ");
        System.out.println("Just adding a letter too！");
        return null;
    }
}
