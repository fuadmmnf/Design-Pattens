package com.company;

public class Main {

    public static void main(String[] args) {

    	Caretaker caretaker = new Caretaker();
	    Originator originator = new Originator();
	    originator.setStr("Nafis Fuad");
        System.out.println(originator.getStr());
        caretaker.addMemento(originator.saveMemento());
	    originator.setStr("bsse0920");
	    originator.restoreMemento(caretaker.getMemento(0));
        System.out.println(originator.getStr());
    }
}
