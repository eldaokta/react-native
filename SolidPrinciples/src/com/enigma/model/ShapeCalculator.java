package com.enigma.model;

import java.util.ArrayList;
import java.util.List;

public class ShapeCalculator {

    List<Shape> shapes = new ArrayList<>();

    public Double sum(){
        Double sum = 0.0;
        for (Shape shape: shapes){
            sum = sum + shape.getSurface();
        }
        return sum;
    }

    public void addShape(Shape shape){
        shapes.add(shape);
    }
}
