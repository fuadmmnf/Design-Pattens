package com.company;

public abstract class ElectronicDevice {

    public  void volUp()
    {
        System.out.println("Vol Up");
    }
    public  void volDown()
    {
        System.out.println("Vol Down");
    }
    public abstract void mute();
    public abstract void freeze();

}
