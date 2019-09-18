package com.enigma.model;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class File {
    static File file = new File(E:\\coba.txt);
    public void writeFile(String data){
        try{
            BufferedReader input = new BufferedReader(new FileWriter(file, true));
            input.write(data);
            input.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
