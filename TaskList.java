package com.company;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class TaskList {

    private Vector<Task> tasks;
    private Vector<Date> criticalDays;
    private Date earliest;
    private Date latest;
    long duration = 0;

    TaskList(){
        tasks = new Vector<Task>();
        criticalDays = new Vector<Date>();
    }
    public long getDuration() {
        return duration;
    }
    public Vector<Task> getTasks() {
        return tasks;
    }
    public Vector<Date> getCriticalDays() {
        return criticalDays;
    }
    public Date getEarliest() {
        return earliest;
    }
    public Date getLatest() {
        return latest;
    }

    //add task
    //sorted by start date
    //-1 for repeated name
    //-2 for mixed start and deadline
    //-3 for going beyond schedule limit
    // 0 for successful result
    int addTask(Task t){
        //if name already exists
        for(int i = 0; i < tasks.size(); i++){
            if(tasks.get(i).getName() == t.getName()){
                return -1;
            }
        }

        //if deadline is before start
        if(t.getStart().compareTo(t.getDeadline()) > 0){
            return -2;
        }

        //if duration goes beyond the schedule limit (1 year)
        Date first = earliest;
        Date last = latest;
        if(earliest == null || t.getStart().compareTo(earliest) < 0){
           first = t.getStart();
        }
        if(latest == null || t.getDeadline().compareTo(latest) > 0){
            last = t.getDeadline();
        }
        int difference = Data.difference(first, last);
        if(difference > 365){                                 //schedule limit is 1 year
            return -3;
        }else{
            earliest = first;
            latest = last;
            duration = difference;
        }

        if(tasks.size() == 0){
            tasks.add(t);
        }else{
            boolean inserted = false;
            for(int i = 0; i < tasks.size(); i++){
                if(tasks.get(i).getStart().compareTo(t.getStart()) > -1){
                    tasks.insertElementAt(t, i);
                    inserted = true;
                    break;
                }
            }

            if(!inserted){
                tasks.add(t);
            }
        }
        addCriticalDate(t.getStart());
        addCriticalDate(new Date(t.getDeadline().getTime() + TimeUnit.DAYS.toMillis(1))); //add day after deadline
        return 0;
    }
    void addCriticalDate(Date d){
        if(criticalDays.size() == 0){
            criticalDays.add(d);
        }else{
            if(!criticalDays.contains(d)){
                if(criticalDays.get(criticalDays.size() -1).compareTo(d) <= 0){
                    criticalDays.add(d);
                }else {
                    for (int i = 0; i < criticalDays.size(); i++) {
                        if (d.compareTo(criticalDays.get(i)) < 0) {
                            criticalDays.insertElementAt(d, i);
                            break;
                        }
                    }
                }
            }
        }
    }
    void removeTask(Task t){
        tasks.remove(t);
        //update critical dates
        //update earliest
        //update latest
    }
    int getSize(){
        return tasks.size();
    }
    void printCriticalDays(){
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        for(int i = 0; i < criticalDays.size(); i++){
            System.out.println(simpleDateFormat.format(criticalDays.get(i)));
        }
    }
}

