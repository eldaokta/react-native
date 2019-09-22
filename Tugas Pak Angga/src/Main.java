import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input Jumlah Data : " );
        Integer jumlahData = Integer.parseInt(reader.readLine());
        String [] nama = new String[jumlahData];
        for (int i = 0; i <jumlahData ; i++) {
            System.out.print("Nama : ");
            nama[i] = reader.readLine();
        }
        for (int i = 0; i <jumlahData ; i++) {
            System.out.println(nama[i]);
        }



    }
}
