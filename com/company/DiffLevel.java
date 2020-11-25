package com.company;

public class DiffLevel {
    private double hours;
    private String name;
    private String color;

    DiffLevel(double hours, String name, String color){
        this.color = color;
        this.hours = hours;
        this.name = name;
    }

    void setHours(double hours){
        this.hours = hours;
    }

    void setName(String name){
        this.name = name;
    }

    void setColor(String color){
        this.color = color;
    }

    double getHours(){
        return hours;
    }

    String getName(){
        return name;
    }

    String getColor(){
        return color;
    }
}
