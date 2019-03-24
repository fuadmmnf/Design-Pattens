package com.company.Animals;

import com.company.Behaviour.CanFly;

public class Bird extends Animal
{
    public Bird()
    {
        flyable = new CanFly();
    }

    @Override
    public void eat() {

    }
}

