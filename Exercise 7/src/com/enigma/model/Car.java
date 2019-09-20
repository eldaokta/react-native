package com.enigma.model;

public class Car {
    public String licensePlate;
    public Integer timeEntry;


    Car(String licensePlate, Integer timeEntry){
        this.licensePlate = licensePlate;
        this.timeEntry = timeEntry;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public Integer getTimeEntry(){
        return this.timeEntry;
    }

}
