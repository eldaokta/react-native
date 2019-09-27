import com.enigma.model.Student;
import com.enigma.service.StudentService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan jumlah student baru : ");
        Integer jmlStudent = Integer.parseInt(reader.readLine());


        for (int i = 0; i <jmlStudent ; i++) {
            System.out.print("Input Id :");
            Integer id = Integer.parseInt(reader.readLine());
            System.out.print("Input Nama :");
            String name = reader.readLine();
            System.out.print("Input Tempat Lahir :");
            String birthPlace = reader.readLine();
            System.out.print("Input Tanggal Lahir :");

            Date birthDate = java.sql.Date.valueOf(reader.readLine());
//            DateFormat format = new SimpleDateFormat("yyyy-mm-dd");
//            Date datadate = format.parse(birthDate);
//            java.sql.Date tgl = new java.sql.Date(datadate.getTime());
            System.out.print("Input Jenis Kelamin : ");
            String gender = reader.readLine();

            Student stu = new Student(id, name, birthPlace, birthDate,gender);
            StudentService.create(stu);

        }
        List<Student>students = StudentService.getAllStudent();
        for (Student student:students){
            System.out.println(student.toString());
        }
    }
}
