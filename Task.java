package com.company;
import java.util.Date;

public class Task {
    private String name;
    private Date start;
    private Date deadline;
    private int duration;
    private double hours;
    private double hrsPerDay;
    private int levelOfDifficulty;
    private String color;
    private int category;
    private boolean priority;

    Task(String name, Date start, Date deadline, double hours, boolean prioritized){
        this.name = name;
        this.start = start;
        this.deadline = deadline;
        this.hours = hours;
        this.priority = prioritized;
        this.category = -1;
        setDuration();
        hrsPerDay = hours/duration;
    }

    void setName(String name){
        this.name = name;

    }
    void setStart(Date start){
        this.start = start;
        setDuration();
    }
    void setDeadline(Date deadline){
        this.deadline = deadline;
        setDuration();
    }
    void setHours(Double hours){
        this.hours = hours;
        hrsPerDay = hours/duration;
    }
    void setLevelOfDifficulty(int level){
        this.levelOfDifficulty = level;
    }
    void setColor(String color){
        this.color = color;
    }
    void setCategory(int category){
        this.category = category;
    }
    void setPriority(boolean priority){
        this.priority = priority;
    }

    String getName(){
        return name;
    }
    Date getStart(){
       return start;
    }
    Date getDeadline(){
        return deadline;
    }
    double getHours(){
        return hours;
    }
    int getLevelOfDifficulty(){
        return levelOfDifficulty;
    }
    String getColor(){
        return color;
    }
    int getCategory(){
        return category;
    }
    boolean getPriority(){
        return priority;
    }
    int getDuration(){return duration;}
    double getHrsPerDay(){return hrsPerDay;}

    private void setDuration(){
        long startTime = start.getTime();
        long dueTime = deadline.getTime();
        long diffTime = dueTime - startTime;
        long diffDays = diffTime / (1000 * 60 * 60 * 24) + 1;
        duration = (int) diffDays;
    }
}
