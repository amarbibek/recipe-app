package com.mycodestuffs.recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/","","/index","/home"})
    public String getIndexPage(){
        return "index";
    }
}
