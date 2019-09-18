import com.enigma.model.Circle;

import java.io.File;
import java.io.FileWriter;

public class MainWriter {
    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("E:\\testout.txt");
            Circle circle = new Circle(2);
            fw.write(circle.print());
            fw.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("Success...");
    }
}
