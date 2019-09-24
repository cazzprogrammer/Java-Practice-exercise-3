package com.stackroute.PE_exercise3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FirstAndLastDate {

    public void getFirstAndLastDate()
    {
        DateFormat df =  new SimpleDateFormat("EEE dd/mm/yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.set(Calendar.DAY_OF_WEEK,calendar.getFirstDayOfWeek());
        System.out.println(df.format(calendar.getTime()));
        calendar.set(Calendar.DAY_OF_WEEK,calendar.SUNDAY);
        System.out.println(df.format(calendar.getTime()));

    }


}
