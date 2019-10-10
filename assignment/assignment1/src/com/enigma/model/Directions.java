package com.enigma.model;

public enum Directions {
    NORTH,
    EAST,
    SOUTH,
    WEST;

    public Directions getright(){
        return Directions.values()[(ordinal()+1) %4];
    }

    public Directions getleft(){
        return Directions.values()[(ordinal()+3) %4];
    }

}

