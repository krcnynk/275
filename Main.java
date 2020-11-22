package com.company;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Date date1 = new Date(120, Calendar.NOVEMBER, 23);
        Date date2 = new Date(120, Calendar.NOVEMBER, 27);

        Date date3 = new Date(120, Calendar.NOVEMBER, 23);
        Date date4 = new Date(120, Calendar.NOVEMBER, 25);

        Date date5 = new Date(120, Calendar.NOVEMBER, 29);
        Date date6 = new Date(120, Calendar.NOVEMBER, 30);


	    Task t1 = new Task("T1", date1, date2, 12, false);
        Task t2 = new Task("T2", date3, date4, 4, false);
        Task t3 = new Task("T3", date5, date6, 2, false);


        Data.getTaskList().addTask(t1);
        Data.getTaskList().addTask(t2);
        Data.getTaskList().addTask(t3);
        ScheduleBuilder sb = new ScheduleBuilder();
        Data.printBDList();

        //Data.getBuiltDayList().print();
        //System.out.println("");
        //Data.getTaskList().printCriticalDays();
        //System.out.println('\n');
        //System.out.println("Zones after balancing:");
        //sb.printZones();
    }
}
