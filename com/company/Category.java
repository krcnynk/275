package com.company;

import java.util.Vector;

public class Category{
    Vector<String> tasks; //task names
    private String color;
    int number;

    Category(String color){
        this.color = color;
        tasks = new Vector<String>();
    }

    //-1 if task already exist
    //-2 if task is in different category
    //0 is successful
    int addTask(Task t){

        //if task is already in the category
        for(int i = 0; i < tasks.size(); i++){
            if(tasks.get(i) == t.getName()){
                return -1;
            }
        }

        //if task is in different category
        if(t.getCategory() != -1){
            return -2;
        }

        tasks.add(t.getName());
        return 0;
    }

    void removeTask(Task t){
        tasks.remove(t.getName());
    }

    void setColor(String color){
        this.color = color;
    }
    String getColor(){
        return color;
    }

    int getSize(){
        return tasks.size();
    }

}
