package com.company.Festival;

import com.company.MediaPartner.Media;

public class CSEFest extends Festival {


    public CSEFest(Media mediaPartner)
    {
        super(mediaPartner);
    }

    @Override
    public void organize() {
        System.out.println("CSEFEST is organized");
    }

    @Override
    public void manageEvents() {
        System.out.println("The Events in CSEFEST is managed");
    }
}
