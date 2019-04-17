package com.company;

public class Screenshot extends Remote {
    ElectronicDevice electronicDevice;

    public Screenshot(ElectronicDevice electronicDevice) {
        super(electronicDevice);
    }

    @Override
    public void fifthButton() {
        System.out.println("Taking Screenshot");
    }
}
