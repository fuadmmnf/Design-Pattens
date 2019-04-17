package com.company;

public class DVD extends ElectronicDevice {

    @Override
    public void mute() {
        System.out.println("Muting DVD");
    }

    @Override
    public void freeze() {
        System.out.println("freezing DVD");
    }
}
