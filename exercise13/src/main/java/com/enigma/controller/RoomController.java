package com.enigma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class RoomController {
    Logger logger = Logger.getLogger(StudentController.class.getName());

    @GetMapping("/room")
    public String goToRoom(){
        logger.log(Level.INFO, "LEWAT TORoom");
        return "room";
    }

}
