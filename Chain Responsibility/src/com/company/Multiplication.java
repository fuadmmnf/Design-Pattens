package com.company;

public class Multiplication implements IOperation {
    private IOperation nextOpp;
    @Override
    public void calculate(String operation) {
        if(operation.equals("multiply"))
            System.out.println("multiplying");
        else
            this.nextOpp.calculate(operation);
    }

    public Multiplication addNext(IOperation nextOpp)
    {
        this.nextOpp = nextOpp;
        return this;
    }
}
