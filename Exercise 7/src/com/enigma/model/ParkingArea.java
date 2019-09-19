package com.enigma.model;

import java.util.HashSet;
import java.util.Set;

public class ParkingArea {
    Integer maximumSlot;
    Set<Car> carSlot = new HashSet<>();


    public ParkingArea(Integer maximumSlot) {
        this.maximumSlot = maximumSlot;
    }

    public Integer countAvailableSlot(){
        return maximumSlot - carSlot.size();
    }
    public void entryCar(Car car){
        carSlot.add(car);
    }

    public boolean isFull (){
        return maximumSlot.equals(carSlot.size());
    }

}
