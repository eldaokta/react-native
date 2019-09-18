package com.enigma.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main4 {
    public static void main(String[] args) {
        File fileku = new File("E:\\coba.txt");
        FileReader fileReader;

        {
            try {
                fileReader = new FileReader(fileku);
                boolean eof = false;
                while (!eof) {
                    int c = fileReader.read();
                    if (c == -1) {
                        eof = true;
                        break;
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

