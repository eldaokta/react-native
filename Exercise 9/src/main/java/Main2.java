import com.enigma.config.HibernateConfigs;
import com.enigma.model.Room;
import com.enigma.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class Main2 {
    public static void main(String[] args) throws ParseException {
        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        //begin
        session.beginTransaction();

        Room classYgDidapat = session.get(Room.class,2);

        List<Student> students = classYgDidapat.getStudents();

        for (Student student: students){
            System.out.println(student.toString());
        }

        //commit
        session.getTransaction().commit();

    }
}
