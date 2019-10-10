import com.enigma.model.Directions;
import com.enigma.model.Robot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader( System.in) );
        System.out.print("Input coordinate (x,y,Coordinate):  ");
        String coordinate = reader.readLine();
        String [] posts = coordinate.split(",");
        Robot robot = new Robot(Integer.parseInt(posts[0]), Integer.parseInt(posts[1]), Directions.valueOf(posts[2]));
        System.out.print("Input Perintah : ");
        String comands = reader.readLine();
        robot.comand(comands);
        robot.run();
        System.out.println(robot.print());

    }
}
