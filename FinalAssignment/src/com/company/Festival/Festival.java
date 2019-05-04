package com.company.Festival;

import com.company.MediaPartner.Media;

public abstract class Festival {

    Media mediaPartner;

    public Festival(Media mediaPartner)
    {
        this.mediaPartner = mediaPartner;
    }

    public void broadCast()
    {
        mediaPartner.broadcast();
    }

    public abstract void organize();
    public abstract void manageEvents();
}
