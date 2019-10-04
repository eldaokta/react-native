package com.enigma.model;

public class Block extends Rectangle{
    private Double height;

    public Block(Double length, Double width, Double height) {
        super(length, width);
        this.height = height;
    }

    public Double getVolume(){
        return this.height*getSurface();
    }
    public Double getSurface(){
        return 2 * (getWidth()*getLength())+
                2*(getLength()*height)+
                2*(getWidth()*height);
    }


}
