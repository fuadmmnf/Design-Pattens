package com.company;

public class TV extends ElectronicDevice {

    @Override
    public void mute() {
        System.out.println("Muting TV");
    }

    @Override
    public void freeze() {
        System.out.println("freezing TV");
    }
}
