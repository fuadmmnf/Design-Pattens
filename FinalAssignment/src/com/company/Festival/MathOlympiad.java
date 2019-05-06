package com.company.Festival;

import com.company.MediaPartner.Media;
import com.company.Mediator.EventMediator;

public class MathOlympiad extends Festival {

    public MathOlympiad(Media mediaPartner, EventMediator eventMediator)
    {
        super(mediaPartner, eventMediator);
    }

    @Override
    public void organize() {
        System.out.println("MathOlympiad is organized");
    }

    @Override
    public void manageEvents() {
        System.out.println("The Events in MathOlympiad is managed");
    }
}
