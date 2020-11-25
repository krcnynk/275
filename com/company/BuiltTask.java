package com.company;

public class BuiltTask {
    private String name;
    private double hours;
    private double percentage;

    public BuiltTask(String name, double hours, double percentage){
        this.name = name;
        this.hours = hours;
        this.percentage = percentage;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setHours(double hours){
        this.hours = hours;
    }
    public void setPercentage(double p){
        this.percentage = p;
    }
    public String getName(){
        return name;
    }
    public double getHours(){
        return hours;
    }
    public double getPercentage(){
        return percentage;
    }
}
