package com.enigma.model;

import java.util.HashSet;
import java.util.Set;

public class ParkingArea {
    Integer maximumSlot;
    Integer mintime = 0;
    Integer maxtime = 0;
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


    public boolean checkLisencePlate(Car car){
        return carSlot.contains(car);
    }

    public void inTime(Integer mintime, Integer maxtime){
        this.mintime = mintime;
        this.maxtime = maxtime;
    }

    public void carOut(Car car){
        carSlot.remove(car);
    }

        public boolean isTime(Car myCar){
            if (mintime > myCar.getTimeEntry() && myCar.getTimeEntry() < maxtime){
                return false;
            }else {
                return true;
            }
        }
}
