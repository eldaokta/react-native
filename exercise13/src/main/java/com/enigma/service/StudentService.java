package com.enigma.service;

import com.enigma.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class StudentService {
    Logger logger = Logger.getLogger(StudentService.class.getName());
    List<Student> students = new ArrayList<Student>();

    public void save(Student student){
        logger.log(Level.INFO, "lagi di save");
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}
