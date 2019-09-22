import com.enigma.model.Employee;
import com.enigma.model.Programmer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukan Jumlah Gaji Pokok : ");
        Integer gaji = Integer.parseInt(reader.readLine());
        System.out.print("Masukkan Jumlah Bonus : ");
        Integer bonus = Integer.parseInt(reader.readLine());
        Programmer programmer = new Programmer(gaji, bonus);
        System.out.print(("Jumlah Gaji yang diterima: ")+programmer.getnetSalary());

    }
}
