import com.enigma.config.HibernateConfigs;
import com.enigma.model.StudentSubject;
import com.enigma.model.Student;
import com.enigma.model.Subject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.text.ParseException;
import java.util.List;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) throws ParseException {
        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        //begin
        session.beginTransaction();
        Student studentYgDidapat = session.get(Student.class, 1);

        List<StudentSubject> studentSubjects = studentYgDidapat.getStudentSubjects();

        for (StudentSubject studentSubject : studentSubjects){
            System.out.println(studentSubject.toString());
        }

        //end
        session.getTransaction().commit();

    }
}

