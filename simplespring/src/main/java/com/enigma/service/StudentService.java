package com.enigma.service;

import com.enigma.constanta.Constant;
import com.enigma.dao.StudentDao;
import com.enigma.model.Student;

public class StudentService {
    StudentDao studentDao;

    public StudentService() {
    }

    //    ini di yg buat constructor injection
//    public StudentService(StudentDao studentDao){
//        this.studentDao = studentDao;
//    }

    //setter injecton, di inject kedalam bean
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public Integer countMale(){
        int count = 0;
        for (Student student: studentDao.getAll()) {
            if(student.getGender().equals(Constant.MALE)){
                count++;
            }
        }
        return count;
    }
}
