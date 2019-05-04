package com.company;

public class TSCSingleton {
    private static TSCSingleton ourInstance = new TSCSingleton();

    public static TSCSingleton getInstance() {
        return ourInstance;
    }

    private TSCSingleton() {
    }
}
