package com.company.Animals;

import com.company.Behaviour.CannotFly;

public class Dog extends Animal
{
    public Dog()
    {
        flyable = new CannotFly();
    }

    @Override
    public void eat() {

    }
}
