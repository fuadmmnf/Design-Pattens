package com.company;

public class Main {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Collegue collegue = new Collegue(mediator);
        mediator.addCollegue(collegue);
        Collegue collegue1 = new Collegue(mediator);
        mediator.addCollegue(collegue1);
        Collegue collegue2 = new Collegue(mediator);
        mediator.addCollegue(collegue2);
        Collegue collegue3 = new Collegue(mediator);
        mediator.addCollegue(collegue3);


//        mediator.sendMsg("Demo msg");
        collegue1.sendMsg("send to mediator");

    }

}
