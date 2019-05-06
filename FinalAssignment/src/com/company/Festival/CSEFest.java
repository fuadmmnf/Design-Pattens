package com.company.Festival;

import com.company.MediaPartner.Media;
import com.company.Mediator.EventMediator;

public class CSEFest extends Festival {


    public CSEFest(Media mediaPartner, EventMediator eventMediator)
    {
        super(mediaPartner, eventMediator);
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
