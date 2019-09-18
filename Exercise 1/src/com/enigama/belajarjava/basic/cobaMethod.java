package com.enigama.belajarjava.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cobaMethod {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer a = 7;
        System.out.println(dikaliDua(Integer.parseInt(reader.readLine())));
    }
    static Integer dikaliDua(int num){
        int result = num * 2;
        return result;
    }
}
