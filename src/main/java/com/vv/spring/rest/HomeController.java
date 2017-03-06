package com.vv.spring.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vasudvis on 1/17/2017.
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getHome(){
        return "index.html";
    }
}
