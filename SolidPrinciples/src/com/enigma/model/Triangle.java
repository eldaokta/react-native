package com.enigma.model;

public class Triangle extends Shape{
    private Double base;
    private Double height;

    public Triangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public Double getSurface() {
        return 0.5 * base * height;
    }
}
