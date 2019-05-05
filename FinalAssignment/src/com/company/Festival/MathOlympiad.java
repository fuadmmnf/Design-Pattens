package com.company.Festival;

import com.company.MediaPartner.Media;

public class MathOlympiad extends Festival {

    public MathOlympiad(Media mediaPartner)
    {
        super(mediaPartner);
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
