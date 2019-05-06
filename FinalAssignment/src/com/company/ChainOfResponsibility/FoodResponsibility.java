package com.company.ChainOfResponsibility;

import com.company.Person;

public class FoodResponsibility implements IResponsibility {
    private IResponsibility nextOpp;
    @Override
    public void execute(Person person) {
        if(person.getType().equals("food"))
            System.out.println(person.getName()+" is associated with food management");
        else
            this.nextOpp.execute(person);
    }

    public FoodResponsibility addNext(IResponsibility nextResponsibility)
    {
        this.nextOpp = nextResponsibility;
        return this;
    }
}
