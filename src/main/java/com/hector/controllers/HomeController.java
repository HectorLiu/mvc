package com.hector.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

   final static Logger logger = LoggerFactory.getLogger(HomeController.class);
   @GetMapping("/")
   public String index()  {
       logger.info("this is message from logback");
      return "index";
   }

   @GetMapping("/admin/dashboard")
   public String dashboard(){
     return "admin/dashboard";
   }


}
