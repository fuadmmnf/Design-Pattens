package com.company.ChainOfResponsibility;

import com.company.Person;

public class TShirtResponsiility implements IResponsibility{
    private IResponsibility nextOpp;
    @Override
    public void execute(Person person) {
        if(person.getType().equals("tshirt"))
            System.out.println(person.getName()+" is associated with tshirt");
        else
            this.nextOpp.execute(person);
    }

    public TShirtResponsiility addNext(IResponsibility nextResponsibility)
    {
        this.nextOpp = nextResponsibility;
        return this;
    }
}
