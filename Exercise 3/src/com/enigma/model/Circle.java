package com.enigma.model;

import java.util.Objects;

public class Circle {
    public Integer r;
    public final Double phi = 3.14;

    public Circle(Integer r){
        this.r = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(r, circle.r);
    }

    @Override
    public int hashCode() {
        return Objects.hash(r);
    }

    public Double getSurface(){
        Double Surface = phi * r * r;
        return Surface;
    }

    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }

    public Double getRound(){
        Double round = phi * r * 2;
        return round;
    }



    public Double getHalfSurface(){
        return getSurface()/2;
    }
    public Double getHalfRound(){
        return getRound()/2;
    }
    public String print(){
        return "Circle{" + "r=" + r +
                ", phi=" + phi+
                ", surface="+getSurface()+
                ", round="+getRound()+"}";

    }

}
