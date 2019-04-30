package com.company;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    List<Memento> mementos;

    public Caretaker() {
        this.mementos = new ArrayList<>();
    }

    public void addMemento(Memento memento)
    {
        mementos.add(memento);
    }

    public Memento getMemento(int index)
    {
        if(index < mementos.size())
            return mementos.get(index);
        return null;
    }

    public List<Memento> getMementos() {
        return mementos;
    }
}
