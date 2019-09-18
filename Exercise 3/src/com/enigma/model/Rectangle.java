package com.enigma.model;

public class Rectangle {
    protected Double length;
    protected Double width;

    public Rectangle(Double length, Double width){
        this.length = length;
        this.width = width;
    }

    public Double getSurface(){
        return length*width;
    }
    Double getRound (){
        return 2*(length+width);
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", round=" +getRound()+
                ", surface="+getSurface()+
                '}';
    }
}
