package com.company.Festival;

import com.company.MediaPartner.Media;
import com.company.Mediator.EventMediator;

public class IITFest extends Festival {


    public IITFest(Media mediaPartner, EventMediator eventMediator)
    {
        super(mediaPartner, eventMediator);
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
