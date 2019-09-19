package com.enigma.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkingAreaTest {

    @Test
    public void countAvailableSpace_Should_return1_When_noCarPark(){
        Integer maximumSlot = 1;
        ParkingArea parkingAreaTest = new ParkingArea(maximumSlot);
        assertEquals(maximumSlot, parkingAreaTest.countAvailableSlot());
    }

    @Test
    public void countAvailableSpace_Should_return2_When_noCarPark(){
        Integer maximumSlot = 2;
        ParkingArea parkingAreaTest = new ParkingArea(maximumSlot);
        assertEquals(maximumSlot, parkingAreaTest.countAvailableSlot());
    }

    @Test
    public void countAvailableSpace_Should_return2_When_1CarPark(){
        Integer maximumSlot = 3;
        Integer expectedAvailableSpace = 2;
        ParkingArea parkingAreaTest = new ParkingArea(maximumSlot);
        Car mycar = new Car("B 3020 SPZ");
        parkingAreaTest.entryCar(mycar);
        assertEquals(expectedAvailableSpace, parkingAreaTest.countAvailableSlot());
    }

    @Test
    public void isFull_Should_returnTrue_When_1CarEntryPark(){
        Integer maximumSlot = 2;
        ParkingArea parkingAreaTest = new ParkingArea(maximumSlot);
        Car myCar = new Car("B 1234 FFF");
        parkingAreaTest.entryCar(myCar);
        assertEquals(false, parkingAreaTest.isFull());
    }

    @Test
    public void isFull_should_returnTrue_When_2CarEntryPark(){
        Integer maximumSlot = 2;
        ParkingArea parkingAreaTest = new ParkingArea(maximumSlot);
        Car myCar = new Car("B2323 KQN");
        Car otherCar = new Car("B 1212 KLO");
        parkingAreaTest.entryCar(myCar);
        parkingAreaTest.entryCar(otherCar);
        assertEquals(true, parkingAreaTest.isFull());
    }

}