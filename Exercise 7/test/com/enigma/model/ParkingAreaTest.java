package com.enigma.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkingAreaTest {

    @Test
    public void countAvailableSpace_Should_return1_When_noCarPark() {
        Integer maximumSlot = 1;
        ParkingArea parkingAreaTest = new ParkingArea(maximumSlot);
        assertEquals(maximumSlot, parkingAreaTest.countAvailableSlot());
    }

    @Test
    public void countAvailableSpace_Should_return2_When_noCarPark() {
        Integer maximumSlot = 2;
        ParkingArea parkingAreaTest = new ParkingArea(maximumSlot);
        assertEquals(maximumSlot, parkingAreaTest.countAvailableSlot());
    }

    @Test
    public void countAvailableSpace_Should_return2_When_1CarPark() {
        Integer maximumSlot = 3;
        Integer expectedAvailableSpace = 2;
        ParkingArea parkingAreaTest = new ParkingArea(maximumSlot);
        Car mycar = new Car("B 3020 SPZ", 7);
        parkingAreaTest.entryCar(mycar);
        assertEquals(expectedAvailableSpace, parkingAreaTest.countAvailableSlot());
    }

    @Test
    public void isFull_Should_returnTrue_When_1CarEntryPark() {
        Integer maximumSlot = 2;
        ParkingArea parkingAreaTest = new ParkingArea(maximumSlot);
        Car myCar = new Car("B 1234 FFF", 7);
        parkingAreaTest.entryCar(myCar);
        assertEquals(false, parkingAreaTest.isFull());
    }

    @Test
    public void isFull_should_returnTrue_When_2CarEntryPark() {
        Integer maximumSlot = 2;
        ParkingArea parkingAreaTest = new ParkingArea(maximumSlot);
        Car myCar = new Car("B2323 KQN", 7);
        Car otherCar = new Car("B 1212 KLO", 7);
        parkingAreaTest.entryCar(myCar);
        parkingAreaTest.entryCar(otherCar);
        assertEquals(true, parkingAreaTest.isFull());
    }

    @Test
    public void isSameLisence_Should_returnTrue_when_SameCarEntryPark(){
        Integer maximumSlot = 2;
        ParkingArea parkingArea = new ParkingArea(maximumSlot);
        Car myCar = new Car("B", 7);
        Car otherCar = new Car("B", 7);
        parkingArea.entryCar(myCar);
        parkingArea.checkLisencePlate(otherCar);
        Boolean cek = parkingArea.checkLisencePlate(otherCar);
        System.out.println(cek==true?"Anda sudah parkir":"Silahkan masuk: ");
        assertEquals(true, cek);
    }

    @Test
    public void countAvailable_should_return2_when_1CarOut(){
        Integer maximumSlot = 2;
        Integer expectedValue = 2;
        ParkingArea parkingArea = new ParkingArea(maximumSlot);
        Car myCar = new Car("B 6789 KL", 7);
        parkingArea.entryCar(myCar);
        parkingArea.carOut(myCar);
        assertEquals(expectedValue, parkingArea.countAvailableSlot());
    }

    @Test
    public void inTimeParking_should_returnFalse_when_ParkingOutOfTime(){
        Integer maximumSlot = 3;
        Integer maxtime = 21;
        Integer mintime = 7;
        ParkingArea parkingArea = new ParkingArea(maximumSlot);
        Car myCar = new Car("B 1234 BB", 12);
        parkingArea.inTime(mintime, maxtime);
        Boolean cek = parkingArea.isTime(myCar);
        System.out.println(cek == true?"Anda masih bisa parkir":"Parkiran tutup");
        assertEquals(true, cek);
    }



}