import com.enigma.config.HibernateConfigs;
import com.enigma.model.StudentSubject;
import com.enigma.model.Student;
import com.enigma.model.Subject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) throws IOException {
        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        //begin
        session.beginTransaction();

        Subject subjectYgDidapat = session.get(Subject.class,1);
        System.out.println(subjectYgDidapat.toString());
        Student studentYgDidapat = session.get(Student.class, 2);
        studentYgDidapat.setSsed(subjectYgDidapat);
        session.save(studentYgDidapat);

//        for (StudentSubject studentSubject: StudentSubject){
//            System.out.println(studentSubject.toString());
//        }


        //end
        session.getTransaction().commit();

    }
}

