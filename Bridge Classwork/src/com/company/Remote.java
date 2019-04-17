package com.company;

public abstract class Remote  {
    ElectronicDevice electronicDevice;

    public Remote(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    public void volUp()
    {
        electronicDevice.volUp();
    }
    public void volDown()
    {
        electronicDevice.volDown();
    }
    public  void mute()
    {
        electronicDevice.mute();
    }
    public void freeze()
    {
        electronicDevice.freeze();
    }
    public abstract void fifthButton();
}
