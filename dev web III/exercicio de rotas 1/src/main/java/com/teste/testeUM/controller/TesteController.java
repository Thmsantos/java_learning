package com.teste.testeUM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TesteController {

    @GetMapping("/rota1/{var1}/{var2}")
    public String rota1(@PathVariable float var1, @PathVariable float var2, ModelMap model){
        model.addAttribute("var1", var1);
        model.addAttribute("var2", var2);
        return "rota1";
    }

    @GetMapping("/rota2/{var1}/{var2}")
    public String rota2(@PathVariable float var1, @PathVariable float var2, ModelMap model){
        model.addAttribute("var1", var1);
        model.addAttribute("var2", var2);
        return "rota2";
    }

    @GetMapping("/rota3/{var1}/{var2}")
    public String rota3(@PathVariable float var1, @PathVariable float var2, ModelMap model){
        model.addAttribute("var1", var1);
        model.addAttribute("var2", var2);
        return "rota3";
    }

    @GetMapping("/oi")
    public String OII(){
        return "oi";
    }

}