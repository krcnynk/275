package com.company;

import java.util.Date;

public class Data {
    static TaskList tList = new TaskList();
    static DayList dList = new DayList();
    static LevelsOfDifficultyList lList = new LevelsOfDifficultyList();
    static CategoriesList cList = new CategoriesList();
    static BuiltDayList bdList = new BuiltDayList();

    Data(){}

    static void setTaskList(TaskList tl){
        tList = tl;
    }

    static void setDayList(DayList dl){
        dList = dl;
    }

    static void setLevelsList(LevelsOfDifficultyList ll){
        lList = ll;
    }

    static void setCategoriesList(CategoriesList cl){
        cList = cl;
    }

    static void setBuiltDaysList(BuiltDayList bdl){
        bdList = bdl;
    }

    static TaskList getTaskList(){
        return tList;
    }

    static DayList getDayList(){
        return dList;
    }

    static LevelsOfDifficultyList getLevels(){
        return lList;
    }

    static CategoriesList getCategories(){
        return cList;
    }

    static BuiltDayList getBuiltDayList(){
        return bdList;
    }

    //support function for TaskList and ScheduleBuilder
    //finds difference between 2 dates in days (start and end dates included)
    static int difference(Date smallest, Date biggest){
        long s = smallest.getTime();
        long b = biggest.getTime();
        long diffTime = b - s;
        return (int) (diffTime / (1000 * 60 * 60 * 24)) + 1;
    }

    static void printBDList(){
        for(int i = 0; i < bdList.getSize(); i++){
            System.out.println("Day " + (i + 1) + ": ");
            for(int j = 0; j < bdList.builtDays.get(i).builtTasks.size(); j++){
                //System.out.println(" Task " + (j + 1));
                System.out.println(bdList.builtDays.get(i).builtTasks.get(j).getName());
                System.out.println("   hours: " + String.format("%.2f", bdList.builtDays.get(i).builtTasks.get(j).getHours()));
                System.out.println("   percentage: " + String.format("%.2f", bdList.builtDays.get(i).builtTasks.get(j).getPercentage()));

            }
            System.out.println("total hours: " + String.format("%.2f", bdList.builtDays.get(i).getTotalHours()));
            System.out.println("\n");
        }
    }
}
