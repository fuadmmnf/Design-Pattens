package com.company.Festival;

import com.company.MediaPartner.Media;
import com.company.TSCSingleton;

public abstract class Festival {

    Media mediaPartner;
    String eventDate;
    TSCSingleton tsc = TSCSingleton.getInstance();


    public Festival(Media mediaPartner)
    {
        this.mediaPartner = mediaPartner;
    }

    public void broadCast()
    {
        mediaPartner.broadcast();
    }

    public boolean reserveTSC(String date)
    {
        if(tsc.isDateAvailable(date)) {
            this.eventDate = date;
            return true;
        }
        return false;
    }


    public abstract void organize();
    public abstract void manageEvents();
}
