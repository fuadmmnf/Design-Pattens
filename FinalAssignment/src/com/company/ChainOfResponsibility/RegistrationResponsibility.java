package com.company.ChainOfResponsibility;

import com.company.Person;

public class RegistrationResponsibility implements IResponsibility {
    private IResponsibility nextOpp;
    @Override
    public void execute(Person person) {
        if(person.getType().equals("registration"))
            System.out.println(person.getName()+" is associated with registration");
        else
            this.nextOpp.execute(person);
    }

    public RegistrationResponsibility addNext(IResponsibility nextResponsibility)
    {
        this.nextOpp = nextResponsibility;
        return this;
    }
}
