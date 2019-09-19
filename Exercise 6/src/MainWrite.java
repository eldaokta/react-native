import com.enigma.model.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainWrite {
    public static void main(String[] args){
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Masukan Jumlah data: ");
            String jumlah = bufferedReader.readLine();
            int x = 1;
            for (int a = 0; a < Integer.parseInt(jumlah); a++) {

                System.out.println("Silahkan Input data ke : " + x++);
                System.out.print("Nama : ");
                String nama = bufferedReader.readLine();
                System.out.print("Umur : ");
                String umur = bufferedReader.readLine();
                System.out.print("Gender : ");
                String gender = bufferedReader.readLine();

                Person person = new Person(nama, Integer.parseInt(umur), gender);
                person.writeText();
             }
        }catch (IOException e){
            e.printStackTrace();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
    }

}

