package com.enigma.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    @Test
    public void assertTest_When_LicensePlate_equals_B3950SPZ(){
        String licensePlate = "B 3950 SPZ";
        Car carTest = new Car(licensePlate, 7);
        assertEquals(licensePlate,carTest.getLicensePlate());
    }

    @Test
    public void getLicencePlate_should_reutrnFalse_when_compareWithB1234RRR(){
        String licensePlate = "B 3950 SPZ";
        String wrongLicensePlate = "B 1234 RRR";
        Car carTest = new Car(licensePlate, 7);
        assertFalse(carTest.getLicensePlate().equals(wrongLicensePlate));
    }

}