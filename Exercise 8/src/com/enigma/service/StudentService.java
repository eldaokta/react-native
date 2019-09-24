package com.enigma.service;

import com.enigma.connection.DBConnection;
import com.enigma.model.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//pengoperasiannya
public class StudentService {
    public static void create(Student student) {
        Connection connection = DBConnection.letsCreateConnection();
        try {
            Statement statement = connection.createStatement();
            statement.execute("insert into student(id, name, birth_place, birth_date, gender) values (" + student.getId()
                    + ",'" + student.getName()
                    + "','" + student.getBirthPlace()
                    + "','" + student.getBirthDate()
                    + "','" + student.getGender() + "')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> getAllStudent() {
        Connection connection = DBConnection.letsCreateConnection();
        List<Student> students = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from student");
            while (rs.next()) {
                students.add(new Student(rs.getInt("id"),
                rs.getString("name"),
                rs.getString("birth_place"),
                rs.getString("birth_date"),
                rs.getString("gender")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static List<Student> searchStudent(String keyword) throws SQLException{
        String katakunci = keyword;
        Connection connection = DBConnection.letsCreateConnection();
        List<Student> students = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from student where lower(name) like '%"+katakunci+"%'");
            while (rs.next()) {
                students.add(new Student(rs.getInt("id"),
                rs.getString("name"),
                rs.getString("birth_place"),
                rs.getString("birth_date"),
                rs.getString("gender")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }
}
