package com.enigma.service;

import com.enigma.config.HibernateConfigs;
import com.enigma.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Query;
import java.util.Date;
import java.util.List;

public class StudentService {

    void createStudent(Student student){
        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

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
    public static List<Student>getStudents(){
        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        List<Student> students = session
                .createQuery("from com.enigma.model.Student")
                .getResultList();
        session.getTransaction().commit();
        return students;
    }
    public  static void update(Student student){
        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("update org.enigma.model.Student set name = :name where id = :id");
        query.setParameter("name", student.getName());
        query.setParameter("id", student.getId());
        query.executeUpdate();
        session.getTransaction().commit();
    }
   public static void delete(Student student){
        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();
        Query query = session.createQuery("update org.enigma.model.Student set nama = :nama where id = :id");
        query.setParameter("nama", student.getName());
        query.setParameter("id", student.getId());
        query.executeUpdate();

        session.getTransaction().commit();
        System.out.println("Student record of Id"+student.getId()+"is deleted successfully");

    }

    @Override
    public String toString() {
        return "StudentService{}";
    }
}
