package com.enigma.model;

import java.util.Objects;

public class Circle {
    private Double radius;
    private final Double pi = 3.14;

    public Circle(Double radius){
        this.radius = radius;
    }

    public Double getSurface(){
        return pi * radius * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(radius, circle.radius);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
