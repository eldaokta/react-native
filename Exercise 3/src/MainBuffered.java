import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainBuffered {
    public static void main(String[] args) {
        File fileku = new File("E:\\testout.txt");
        List<String> texts = new ArrayList<>();
        try {
                FileReader fileReader = new FileReader(fileku);
                BufferedReader br = new BufferedReader(fileReader);
                while (true) {
                    String txt = br.readLine();
                    texts.add(txt);
                    if (txt== null) {
                        break;
                    }
                }
                for (String str: texts) {
                    System.out.println(str);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

