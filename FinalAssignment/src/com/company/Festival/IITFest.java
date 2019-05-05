package com.company.Festival;

import com.company.MediaPartner.Media;

public class IITFest extends Festival {


    public IITFest(Media mediaPartner)
    {
        super(mediaPartner);
    }


    @Override
    public void organize() {
        System.out.println("IITFEST is organized");
    }

    @Override
    public void manageEvents() {
        System.out.println("The Events in IITFEST is managed");
    }
}
