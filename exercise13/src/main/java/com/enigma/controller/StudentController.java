package com.enigma.controller;

import com.enigma.model.Student;
import com.enigma.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class StudentController {

    //siapa butuh siapa

    @Autowired
    StudentService studentService;

    Logger logger = Logger.getLogger(StudentController.class.getName());

    @GetMapping("/student")
    public String goToStudentForm(){
        logger.log(Level.INFO, "LEWAT TOStudent");
        return "student";
    }

    @GetMapping("/student-form")
    public String gotWhatEver(){
        logger.log(Level.INFO, "LEWAT WHATEVER");
        return "student";
    }
    @PostMapping("/student-submit")
    public String doWhatEver(@RequestParam String id, @RequestParam String name, ModelMap model){

        logger.log(Level.INFO, id);
        logger.log(Level.INFO, name);

        Student student = new Student();
        student.setId(Integer.parseInt(id));
        student.setName(name);

        studentService.save(student);

        model.addAttribute("id", "id");
        model.addAttribute("name", "name");

        model.addAttribute("tambah", studentService.getStudents());

        return "student";
    }


}
