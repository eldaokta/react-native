package com.enigma.controller;

import com.enigma.entity.Student;
import com.enigma.repositories.StudentReporsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentReporsitory studentReporsitory;

    @GetMapping("/student")
    public ModelAndView toStudentView(){
         return new ModelAndView("student-form", "student", new Student());
    }

    @PostMapping("/student")
    public String toStudentForm(@ModelAttribute("student") Student student, Model model){

        studentReporsitory.save(student);
        List<Student> students = studentReporsitory.findAll();
        model.addAttribute("x", student);
        model.addAttribute("studentList", students);

        return "student-view";
    }



}
