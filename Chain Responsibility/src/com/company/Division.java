package com.company;

public class Division implements IOperation{
    private IOperation nextOpp;
    @Override
    public void calculate(String operation) {
        if(operation.equals("divide"))
            System.out.println("dividing");
        else
            this.nextOpp.calculate(operation);
    }

    public Division addNext(IOperation nextOpp)
    {
        this.nextOpp = nextOpp;
        return this;
    }
}
