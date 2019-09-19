package com.enigma.service;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonGenerator {
    private List<String> name = new ArrayList<>();
    private List<Integer> age = new ArrayList<>();
    private List<String> gender = new ArrayList<>();
    private String path;

    public PersonGenerator() {
        this.path = path;
    }

    public void ReadFile(){
        List<String> stringList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader("E:\\Academy\\Exercise 6\\dataContainer\\data.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true){
                String txt = bufferedReader.readLine();
                if (txt == null){
                    break;
                }
                stringList.add(txt);
            }
            for (String str: stringList){
                String getName = str.substring(8, 23);
                name.add(getName.trim());
                String getAge = str.substring(37, 39);
                age.add(Integer.parseInt(getAge));
                String getGender = str.substring(48, 49);
                gender.add(getGender.trim());
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public void print() {
        Iterator<String> stringIterator = name.iterator();
        Iterator<Integer> stringIteratorAge = age.iterator();
        Iterator<String> stringIteratorGender = gender.iterator();
        while (stringIterator.hasNext() && stringIteratorAge.hasNext() && stringIteratorGender.hasNext()){
            String data = stringIterator.next();
            Integer data2 =stringIteratorAge.next();
            String data3 =stringIteratorGender.next();
            System.out.print(data);
            System.out.print(data2);
            System.out.print(data3);

        }
    }

    public void getAvarageAge(){
        Integer total=0;
        for (int i=0; i <age.size() ; i++) {
            total+=age.get(i);
        }
        Integer average=total/age.size();
        System.out.println("Rata - rata Umur : "+average);
    }

}
