package com.enigama.belajarjava.basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("--------BIODATA--------");
        System.out.print("Input Data : ");
        int data = Integer.parseInt(input.readLine());
        String [] nama = new String[data];
        Integer [] umur = new Integer[data];

        int number = 1;
            for (int a = 0; a<data; a++){
                System.out.println("Silahkan Input Data ke-"+number++);
                System.out.print("Nama : ");
                nama[a] = input.readLine();
                if (nama[a] == null || nama[a].isEmpty()) {
                    System.out.println("Inputan tidak boleh kosong!");
                    System.out.println("Nama : ");
                    nama[a] = input.readLine();
                }
                System.out.print("Umur : ");
                try {
                    umur[a] = Integer.parseInt(input.readLine());
                }catch (Exception e){
                    System.out.println("Inputan tidak boleh kosong");
                    System.out.println("Umur : ");
                    umur[a] = Integer.parseInt(input.readLine());
                }

            }

        System.out.println("--------OUTPUT--------");
        System.out.print("Nama");
        System.out.print(" ||  ");
        System.out.println("Umur");
        for (int a=0; a<data; a++){
            System.out.print(nama[a]);
            System.out.print(" ||  ");
            System.out.println(umur[a]);
        }

    }
}
