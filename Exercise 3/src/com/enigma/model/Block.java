package com.enigma.model;

public class Block extends Rectangle {

    private Double height;

    public Double getVolume(){
        return this.length*this.height*this.width;
    }

    public Block(Double length, Double width, Double height){
        super(length, width);
        this.height=height;
    }

    public Double getSurface(){
        return 2*(this.length*this.width)+
                2*(this.length*this.height)+
                2*(this.height*this.width);
    }
    public String toString() {
        return "Block{length"+this.length+
                ", width ="+this.width+
                ", height ="+this.height+
                ", volume ="+getSurface()+"}";
    }
}
