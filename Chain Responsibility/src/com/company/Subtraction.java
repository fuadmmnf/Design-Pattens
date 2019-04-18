package com.company;

public class Subtraction implements  IOperation {
    private IOperation nextOpp;
    @Override
    public void calculate(String operation) {
        if(operation.equals("subtract"))
            System.out.println("subtracting");
        else
            this.nextOpp.calculate(operation);
    }

    public Subtraction addNext(IOperation nextOpp)
    {
        this.nextOpp = nextOpp;
        return this;
    }
}
