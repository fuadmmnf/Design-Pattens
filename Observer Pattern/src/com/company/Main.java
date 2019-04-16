package com.company;

public class Main {

    public static void main(String[] args) {
        Subject youtube = new Subject();
        User user = new User("Fuad");
        youtube.subscribe(user);

        user = new User("Fahmid");
        youtube.subscribe(user);

        user = new User("Saif");
        youtube.subscribe(user);


        youtube.sendNotification();
        System.out.println("\n\n\n");
        youtube.unsubscribe(user);
        youtube.sendNotification();
    }
}
