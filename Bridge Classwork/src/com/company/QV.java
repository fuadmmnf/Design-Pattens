package com.company;

public class QV extends Remote {
    ElectronicDevice electronicDevice;

    public QV(ElectronicDevice electronicDevice, ElectronicDevice electronicDevice1) {
        super(electronicDevice);
        this.electronicDevice = electronicDevice1;
    }

    @Override
    public void fifthButton() {
        System.out.println("QV");
    }
}
