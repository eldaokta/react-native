package com.enigma.service;

import com.enigma.connection.DBConnection;
import com.enigma.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//pengoperasiannya
public class StudentService {
    private static Connection connection = DBConnection.getConnection();
    private static List<Student> students = new ArrayList<>();
    public static void create(Student student) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into student(id, name, birth_place, birth_date, gender) values (?,?,?,?,?)");
            preparedStatement.setInt(1, student.getId());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setString(3, student.getBirthPlace());
            preparedStatement.setDate(4, student.getBirthDate());
            preparedStatement.setString(5, student.getGender());

            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> getAllStudent() {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from student");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                students.add(new Student(rs.getInt("id"),
                rs.getString("name"),
                rs.getString("birth_place"),
                rs.getDate("birth_date"),
                rs.getString("gender")));
            }
        preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static List<Student> searchStudent(String keyword){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM student WHERE lower(name) LIKE '%"+keyword+"%'");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                students.add(new Student(rs.getInt("id"),
                rs.getString("name"),
                rs.getString("birth_place"),
                rs.getDate("birth_date"),
                rs.getString("gender")));
            }
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }
}
