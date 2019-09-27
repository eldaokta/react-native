import com.enigma.model.Room;
import com.enigma.model.Student;
import com.enigma.config.HibernateConfigs;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
//        String hasil = StringUtil.getLeftPadingZero(189,10);
//        System.out.println(hasil);
        //bikin session factory
        //create session, langssung dibikin session ke database
        //session dihasilkan oleh session factory
        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        Room classYgDidapat = session.get(Room.class, 1);
        System.out.println(classYgDidapat.toString());
        Student studentYgDidapat = session.get(Student.class, 1);
        studentYgDidapat.setName("Another Tony");

//        studentYgDidapat.setClassRoom(classYgDidapat);

        session.save(classYgDidapat);

        //bikin student
//        Student newStudent = new Student();
//        newStudent.setId(12);
//        newStudent.setName("Marwoto");
//        newStudent.setBirthPlace("Texas");
//        newStudent.setBirthDate(new Date());
//        newStudent.setGender("M");
//        newStudent.setClassRoom(turingRoom);

        //commit
        session.getTransaction().commit();
//        Student student = new Student();
//        student.setId(17);
//        student.setName("Tony Stark");
//        student.setBirthPlace("New York");
//        student.setBirthDate(new Date());
//        student.setGender("M");
//
//        session.beginTransaction();
//        session.save(student);
//        session.getTransaction().commit();

//        session.beginTransaction();
//        List<Student> students = session
//                .createQuery("from com.enigma.model.Student")
//                .getResultList();
//        session.getTransaction().commit();
//
//
//        for (Student student:students){
//            System.out.println(student.toString());
//        }

    }
}
