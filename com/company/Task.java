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

    public Task(String name, Date start, Date deadline, double hours, boolean prioritized){
        this.name = name;
        this.start = start;
        this.deadline = deadline;
        this.hours = hours;
        this.priority = prioritized;
        this.category = -1;
        setDuration();
        hrsPerDay = hours/duration;
    }
    public void setName(String name){
        this.name = name;

    }
    public void setStart(Date start){
        this.start = start;
        setDuration();
    }
    public void setDeadline(Date deadline){
        this.deadline = deadline;
        setDuration();
    }
    public void setHours(Double hours){
        this.hours = hours;
        hrsPerDay = hours/duration;
    }
    public void setLevelOfDifficulty(int level){
        this.levelOfDifficulty = level;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setCategory(int category){
        this.category = category;
    }
    public void setPriority(boolean priority){
        this.priority = priority;
    }
    private void setDuration(){
        long startTime = start.getTime();
        long dueTime = deadline.getTime();
        long diffTime = dueTime - startTime;
        long diffDays = diffTime / (1000 * 60 * 60 * 24) + 1;
        duration = (int) diffDays;
    }
    public String getName(){
        return name;
    }
    public Date getStart(){
       return start;
    }
    public Date getDeadline(){
        return deadline;
    }
    public double getHours(){
        return hours;
    }
    public int getLevelOfDifficulty(){
        return levelOfDifficulty;
    }
    public String getColor(){
        return color;
    }
    public int getCategory(){
        return category;
    }
    public boolean getPriority(){
        return priority;
    }
    public int getDuration(){return duration;}
    public double getHrsPerDay(){return hrsPerDay;}
}
