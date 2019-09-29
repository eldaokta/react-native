package com.enigma.service;

import com.enigma.config.HibernateConfigs;
import com.enigma.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

import javax.persistence.Query;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class StudentServiceTest {

    @Test
    public void getStudent_should_returnStudentName_when_IdIs1() {
       String getName= "Another Tony";
       Student getStudent = StudentService.getStudent(1);
       assertEquals(getName, getStudent.getName());
    }

    @Test
    public void getStudent_should_returnFalse_when_IdIs1() {
        String getName = "Elda";
        Student getStudent = StudentService.getStudent(1);
        assertNotEquals(getName, getStudent.getName());
    }

//    @Test
//    public void getAllStudent_should_returnAllStudent_when_IdFound() {
//        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
//        Session session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        List<Student> students = session
//                .createQuery("from com.enigma.model.Student")
//                .getResultList();
//        session.getTransaction().commit();
//        assertEquals(students.toString(), StudentService.getStudents());
//    }

//    @Test
//    public void getStudents() {
//    }

//    @Test
//    public void updateStudent() {
//        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
//        Session session = sessionFactory.getCurrentSession();
//
//        session.beginTransaction();
//        Student student = new Student();
//        student.setId(15);
//        student.setName("muh rifqi");
//        student.setBirthPlace("Yogyakarta");
//        student.setBirthDate(new Date());
//        student.setGender("M");
//        StudentService.update(student);
//        assertEquals(StudentService.getStudents().toString(), StudentService.getStudents().toString());
//
//    }

//    @Test
//    public void deleteStudent_should_deleteById_When_IdFound() {
//        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
//        Session session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        Integer roll = 15;
//        Student student = session.get(Student.class, roll);
//        session.delete(student);
//        session.getTransaction().commit();
//        assertEquals(student.toString(), StudentService.delete(roll));
//    }
}