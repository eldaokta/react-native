import com.enigma.service.PersonGenerator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainRead {
    public static void main(String[] args) {
        PersonGenerator personGenerator = new PersonGenerator();
        personGenerator.ReadFile();
        personGenerator.getAvarageAge();


    }
}
