package com.company;
import java.util.Vector;

public class BuiltDayList {
    private Vector<BuiltDay> builtDays;

    BuiltDayList(){
        builtDays = new Vector<BuiltDay>();
    }
    Vector<BuiltDay> getBuiltDays() {
        return builtDays;
    }
    void setBuiltDays(Vector<BuiltDay> builtDays) {
        this.builtDays = builtDays;
    }
    void addBDay(BuiltDay bd){
        builtDays.add(bd);
    }
    int getSize(){
        return builtDays.size();
    }
/*
    void print(){
        for(int i = 0; i < builtDays.size(); i++){

            double totalHours = builtDays.get(i).getTotalHours();
            System.out.println("day " + (i + 1)+ ": Total hours = " + totalHours);

            for(int j = 0; j < builtDays.get(i).getSize(); j++){
                String name  = builtDays.get(i).builtTasks.get(j).getName();
                double hours = builtDays.get(i).builtTasks.get(j).getHours();
                System.out.println("   " + name + ": " + hours);
            }
        }
    }

 */
}
