import com.enigma.model.Student;
import com.enigma.service.StudentService;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.List;

public class Main2 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan kata yang dicari : ");
        String keyword = String.valueOf(reader.readLine());
        List<Student> students = StudentService.searchStudent(keyword);
        for (Student student: students){
            System.out.println(student.toString());
        }
    }
}
