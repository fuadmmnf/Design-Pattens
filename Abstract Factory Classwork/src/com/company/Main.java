package com.company;

public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory("Occidental");

        ICountryFactory iCountryFactory = factory.createCountryFactory();
    }
}
