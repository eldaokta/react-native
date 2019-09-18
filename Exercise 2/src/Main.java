import com.enigma.tugasdua.Directions;
import com.enigma.tugasdua.Mobil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader( System.in) );
        System.out.print("Input coordinate x,y :  ");
        String coordinate = reader.readLine();
        String [] posts = coordinate.split(",");
        Mobil rush = new Mobil(Integer.parseInt(posts[0]), Integer.parseInt(posts[1]));

        //input bensin
        System.out.print("Input Bensin : ");
        String bensin = reader.readLine();
        rush.setFuel(Integer.parseInt(bensin));

        //input perintah
        System.out.print("Input Perintah : ");
        String commands = reader.readLine();
        rush.setCommands(commands);
        rush.run();
        rush.getPosition();
        System.out.println(rush.toString());
    }
}
