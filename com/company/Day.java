package com.company;
import java.util.Date;

public class Day {
    private Date date;
    private double limit;

    Day(Date d, int l){
        this.date = d;
        this.limit = l;
    }

    void setLimit(double limit){
        this.limit = limit;
    }

    void setDate(Date d){
        this.date = d;
    }

    double getLimit(){
        return limit;
    }

    Date getDate(){
        return date;
    }
}
