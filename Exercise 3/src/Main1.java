import com.enigma.model.Circle;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Set<Circle> circleSet = new HashSet<>();

        circleSet.add(new Circle(10));
        circleSet.add(new Circle(5));
        circleSet.add(new Circle(1));
        circleSet.add(new Circle(1));
        circleSet.add(new Circle(1));
        circleSet.add(new Circle(3));
        circleSet.add(new Circle(3));

        for (Circle nilai: circleSet) {
            System.out.println(nilai.getR());
        }
        System.out.println("size:"+circleSet.size());
    }
}
