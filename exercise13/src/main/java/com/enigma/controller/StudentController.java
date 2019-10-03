package com.enigma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class StudentController {

    Logger logger = Logger.getLogger(StudentController.class.getName());

    @RequestMapping("/student")
    public String goToStudent(){

        logger.log(Level.INFO, "LEWAT TOStudent");
        return "student"; //return sebuah steing, tp dia di return sebagai return resolter

    }

}
