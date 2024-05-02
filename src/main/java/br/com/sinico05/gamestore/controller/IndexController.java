package br.com.sinico05.gamestore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class IndexController {
    
    @GetMapping("/")
    public String getIndex() {
        return "index";
    }
    @GetMapping("/home")
    public String getHome() {
        return "index";
    }
    

}
