package com.company;

import java.util.ArrayList;
import java.util.List;

public class TSCSingleton {
    private static TSCSingleton ourInstance;
    private List<String> bookedDates;


    public static TSCSingleton getInstance() {
        if(ourInstance == null)
            ourInstance = new TSCSingleton();
        return ourInstance;
    }

    private TSCSingleton() {
        bookedDates = new ArrayList<>();
    }

    public void reserve(String date)
    {
        bookedDates.add(date);
    }

    public boolean isDateAvailable(String date)
    {
        for(String bookedDate: bookedDates)
            if(bookedDate.equals(date))
                return false;
        return true;
    }
}
