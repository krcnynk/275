package com.company;

public class BuiltTask {
    private String name;
    private double hours;
    private double percentage;

    BuiltTask(String name, double hours, double percentage){
        this.name = name;
        this.hours = hours;
        this.percentage = percentage;
    }

    void setName(String name){
        this.name = name;
    }
    void setHours(double hours){
        this.hours = hours;
    }
    void setPercentage(double p){
        this.percentage = p;
    }

    String getName(){
        return name;
    }
    double getHours(){
        return hours;
    }
    double getPercentage(){
        return percentage;
    }
}
