package com.enigma.service;

import com.enigma.connection.DBConnection;
import com.enigma.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//pengoperasiannya
public class StudentService {
//    public static void create(Student student) {
//        Connection connection = DBConnection.letsCreateConnection();
//        try {
//            Statement statement = connection.createStatement();
//            statement.execute("insert into student(id, name, birth_place, birth_date, gender) values (" + student.getId()
//                    + ",'" + student.getName()
//                    + "','" + student.getBirthPlace()
//                    + "','" + student.getBirthDate()
//                    + "','" + student.getGender() + "')");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

    public void deleteColumn(Student student){
        Connection connection = DBConnection.letsCreateConnection();
        String sql = "delete from student where id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(16,student.getId());
            preparedStatement.executeUpdate();
            System.out.println("record delete succesfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void create(Student student){
        Connection connection = DBConnection.letsCreateConnection();
        String sql = "insert into student values(?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, student.getId());
            preparedStatement.setString(2,student.getName());
            preparedStatement.setString(3, student.getBirthPlace());
            preparedStatement.setDate(4, (Date) student.getBirthDate());
            preparedStatement.setString(5, student.getGender());
            preparedStatement.executeUpdate();
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
                rs.getDate("birth_date"),
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
                rs.getDate("birth_date"),
                rs.getString("gender")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }
}
