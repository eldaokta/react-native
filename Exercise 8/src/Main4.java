import com.enigma.model.Student;
import com.enigma.service.StudentService;

import java.io.IOException;
import java.util.List;

import static com.enigma.service.StudentService.*;

public class Main4 {
    public static void main(String[] args)throws IOException {
        StudentService studentService = new StudentService();
        List<Student> students= StudentService.deleteColumn();
        System.out.println();

    }
}
