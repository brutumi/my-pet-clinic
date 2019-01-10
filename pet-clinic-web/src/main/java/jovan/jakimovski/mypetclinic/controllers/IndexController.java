package jovan.jakimovski.mypetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","/","index","index.html"})
    public String index(){

        return "index"; //view
    }

    @RequestMapping({"/oups","/oups/"})
    public String oups(){

        return "notimplemented";

    }
}
