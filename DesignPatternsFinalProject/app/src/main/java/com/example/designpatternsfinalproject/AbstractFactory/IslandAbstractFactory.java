package com.example.designpatternsfinalproject.AbstractFactory;

public class IslandAbstractFactory {
    int islandNumber;
    IFactory islandFactory;

    public IslandAbstractFactory(int islandNumber)
    {
        this.islandNumber = islandNumber;
    }

    public IFactory createIsland()
    {
        if(islandNumber == 1)

            islandFactory = new Island1Factory();
        else
            islandFactory = new Island2Factory();

        return islandFactory;
    }


}
