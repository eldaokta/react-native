import com.enigma.dao.StudentDao;
import com.enigma.model.Student;
import com.enigma.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Main2 {
    public static void main(String[] args) {
        //pemanggilan context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student tony = new Student(1, "Tony Blank", "California", new Date(), "M");
        Student elon = new Student(2, "Elon Musk", "South Africa", new Date(), "M");
        Student cassandra = new Student(3, "Cassandra", "Jakarta", new Date(), "F");
        Student arthur = new Student(4, "Arthur", "Jakarta", new Date(), "M");

        StudentDao studentDao = (StudentDao) context.getBean("studentDao");

        studentDao.save(tony);
        studentDao.save(elon);
        studentDao.save(cassandra);
        studentDao.save(arthur);

        StudentService studentService = (StudentService) context.getBean("studentService");
        System.out.println(studentService.countMale());

    }
}
