package com.company;

public class NullOperation implements IOperation {
    @Override
    public void calculate(String operation) {
        System.out.println("No such command found");
    }
}
