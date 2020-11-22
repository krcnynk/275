package com.company;
import java.util.Date;
import java.util.Vector;

public class BuiltDay {
    private Date date;
    private double limit = 0;
    private double totalHours = 0;
    Vector<BuiltTask> builtTasks;


    BuiltDay(Date d){
        builtTasks = new Vector<BuiltTask>();
        this.date = d;
    }

    void addBTask(BuiltTask bt){
        builtTasks.add(bt);
        totalHours += bt.getHours();
    }

    void setDate(Date d){
        this.date = d;
    }

    void setLimit(double limit){
        this.limit = limit;
    }

    void setTotalHours(double tot){
        this.totalHours = tot;
    }

    Date getDate(){
        return date;
    }

    double getLimit(){
        return limit;
    }

    double getTotalHours(){
        return totalHours;
    }

    int getSize(){
        return builtTasks.size();
    }
}
