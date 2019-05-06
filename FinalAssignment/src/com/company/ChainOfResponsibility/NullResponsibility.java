package com.company.ChainOfResponsibility;

import com.company.Person;

public class NullResponsibility implements IResponsibility{

    @Override
    public void execute(Person person) {
        System.out.println(person.getName()+" has no associated task");
    }
}
