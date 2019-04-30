package com.company;

public class Addition implements IOperation {
    private IOperation nextOpp;
    @Override
    public void calculate(String operation) {
        if(operation.equals("add"))
            System.out.println("adding");
        else
            this.nextOpp.calculate(operation);
    }

    public Addition addNext(IOperation nextOpp)
    {
        this.nextOpp = nextOpp;
        return this;
    }
}
