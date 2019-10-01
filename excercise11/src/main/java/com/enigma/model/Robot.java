package com.enigma.model;

import java.util.Arrays;

public class Robot {
    Directions directions;//namain enum namanya directions

    private Integer postX; //atribut
    private Integer postY;
    private char[] commands;
    private final String FORWARD = "F"; //konstanta
    private final String BACKWARD = "B";
    private final String LEFT = "L";
    private final String RIGHT = "R";
    private Integer fuel=0;

    //constructor
    public Robot(Integer x, Integer y, Directions directions) {//ngeset ini ke atribut
        this.postX = x;
        this.postY = y;
        this.directions = directions;
    }

    public void comand(String commands){
        for (int i = 0; i < commands.length(); i++) {
            this.commands = commands.toUpperCase().toCharArray();
        }
    }

    public void turnRight(){
        this.directions = this.directions.getright();
    }
    public void turnLeft(){
        this.directions = this.directions.getleft();
    }

    public void forward(){
        if (directions.equals(Directions.NORTH)){
            this.postY++;
            this.directions = Directions.NORTH;
        }else if(directions.equals(Directions.WEST)){
            this.postX--;
            this.directions = Directions.WEST;
        }else if(directions.equals(Directions.SOUTH)){
            this.postY--;
            this.directions = Directions.SOUTH;
        }else if (directions.equals(Directions.EAST)){
            this.postX++;
            this.directions = Directions.EAST;
        }else {
            System.out.println("Salah arah!");
        }
    }

    public String print() {
        return "Robot{" +
                "postX=" + postX +
                ", postY=" + postY +
                ", fuel="+fuel+
                ", commands=" + Arrays.toString(commands) +
                ", direction=" + directions +
                '}';
    }

    private void move(String  movement, Directions directions) {
        switch (movement){
            case RIGHT:
                turnRight();
                break;
            case LEFT:
                turnLeft();
                break;
            case FORWARD:
                forward();
                break;
            default:
                System.out.println("Invalid move");
        }
    }

    public void run(){
        for (int i = 0; i < this.commands.length; i++){
            move(String.valueOf(this.commands[i]), this.directions);
            System.out.println(this.commands[i]+getPosition()+this.directions);
        }
    }

    public void setFuel(Integer fuel) {
        this.fuel = this.fuel + fuel;

    }

    public String getPosition(){
        return "("+this.postX+","+this.postY+")";

    }
}
