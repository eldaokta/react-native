package com.enigma.dao;

import com.enigma.config.HibernateConfigs;
import com.enigma.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class StudentDao {
    public static List<Student> getStudentAll(){
        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();

        List<Student> students = session.createQuery("from com.enigma.model.Student").getResultList();

        session.getTransaction().commit();
        return students;
    }
    public static Student getStudent(Integer id){
        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();

        Student student = session.get(Student.class, id);
        System.out.println(student.toString());
        session.getTransaction().commit();
        return student;
    }

    public static void create(Student student) {
        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
    }



}
