package com.enigma.tugasdua;

import java.util.Arrays;

public class Mobil {

    Directions directions;//namain enum namanya directions

    private Integer postX; //atribut
    private Integer postY;
    private Integer fuel = 0;
    private char[] commands;
    private final String FORWARD = "F"; //konstanta
    private final String BACKWARD = "B";
    private final String LEFT = "L";
    private final String RIGHT = "R";

    //constructor
    public Mobil(Integer x, Integer y) {//ngeset ini ke atribut
        this.postX = x;
        this.postY = y;
    }

    public String toString() {
        return "Mobil{" +
                "postX=" + postX +
                ", postY=" + postY +
                ", fuel=" + fuel +
                ", commands=" + Arrays.toString(commands) +
                '}';
    }

    public void setFuel(Integer fuel) {
        this.fuel = this.fuel + fuel;

    }

    private void move(String  movement) {
        if (movement.equals(FORWARD)) {
            this.postX++;
        } else if (movement.equals(BACKWARD)) {
            this.postY--;
        } else if (movement.equals(LEFT)) {
            this.postX++;
        } else if (movement.equals(RIGHT)) {
            this.postY--;
        }
    }

    public String setCommands (String commands){
            this.commands = commands.toCharArray();
            return commands;
    }

    public void run(){
        for (int i = 0; i < this.commands.length; i++){
            if (fuel == 0){
                System.out.println("Mobil Mogok");
                break;
            }
            move(String.valueOf(this.commands[i]));
            System.out.println(this.commands[i]+getPosition());
            if ((i+1)%3 == 0){
                fuel--;
            }
        }
    }
    public String getPosition(){
        return "("+this.postX+","+this.postY+")";

    }
}
