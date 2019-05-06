package com.company.ChainOfResponsibility;

import com.company.Person;

public class AnchoringResponsibility implements IResponsibility{
    private IResponsibility nextOpp;
    @Override
    public void execute(Person person) {
        if(person.getType().equals("anchor"))
            System.out.println(person.getName()+" is associated with anchoring");
        else
            this.nextOpp.execute(person);
    }

    public AnchoringResponsibility addNext(IResponsibility nextResponsibility)
    {
        this.nextOpp = nextResponsibility;
        return this;
    }
}
