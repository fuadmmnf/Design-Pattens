package com.company;

import com.company.Festival.Festival;
import com.company.Festival.IITFest;
import com.company.MediaPartner.Media;
import com.company.MediaPartner.TV;
import com.company.Mediator.Department;
import com.company.Mediator.EventMediator;

import java.util.Scanner;


public class Main {

//    Design a project to arrange different festivals (IITFest, CSEFest, MathOlympiad).
//    Each of the  festivals is organized with corroboration of a media partner (Radio, TV, Newspaper).
//    Reserve TSC for the festivals according to the availability of dates.
//    Use Bridge pattern on the two hierarchies. Use mediator pattern for commutation between the departments about the festivals.
//    Use Observer pattern for broadcasting festival events through media to registered users.// proxy

//    Use Singleton to maintain single instance of TSC.


    public static void main(String[] args) {
        EventMediator eventMediator = new EventMediator();

        Media media = new TV();
        media.addUser(new Person("fuad"));
        media.addUser(new Person("saif"));
        media.addUser(new Person("rezowan"));
        media.addUser(new Person("rakib"));
        Festival festival1 = new IITFest(media, eventMediator);


        festival1.addPersonInvolved(new Person("fuad", "food"));
        festival1.addPersonInvolved(new Person("saif", "tshirt"));
        festival1.addPersonInvolved(new Person("rezowan", "anchor"));
        festival1.addPersonInvolved(new Person("rakib"));
        festival1.addPersonInvolved(new Person("aminul", "registration"));

        Scanner input = new Scanner(System.in);
        String date;
        while(!festival1.reserveTSC(date = input.next()))
        {
            System.out.println("TSC not available on "+date);
        };

        festival1.addDepartment(new Department("IIT", eventMediator));
        festival1.addDepartment(new Department("CSE", eventMediator));
        festival1.addDepartment(new Department("ISRT", eventMediator));
        festival1.addDepartment(new Department("INFS", eventMediator));


        festival1.communicateBetweenDepartments();
        festival1.execute();
        festival1.broadCast();
        festival1.organize();
        festival1.manageEvents();




    }
}
