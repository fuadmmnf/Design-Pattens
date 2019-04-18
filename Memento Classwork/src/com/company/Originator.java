package com.company;

public class Originator {
    String str;



    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Memento saveMemento()
    {
        return new Memento(this.str);
    }

    public void restoreMemento(Memento memento)
    {

        this.str = memento.getStr();

    }
}
