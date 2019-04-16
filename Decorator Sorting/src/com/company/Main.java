package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Sorting db = new Sorting();
        List<Student> sortedStudents = new ArrayList<>();
        List<Integer> sortSerial = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        int studentNum = 4;

//        for(int i=0; i<studentNum; i++) {
//            String name = input.next();
//            int age = input.nextInt();
//            double cg = input.nextDouble();
//            String session = input.next();
//
//            System.out.println(""+name+" "+ age+" "+ cg+" "+ session);
//            db.addStudent(new Student(name, age, cg, session));
//        }

        db.addStudent(new Student("fuad", 23, 2.3, "2016-2017"));
        db.addStudent(new Student("nafis", 23, 2.6, "2016-2017"));
        db.addStudent(new Student("mridha", 20, 2.3, "2016-2017"));
        db.addStudent(new Student("sidat", 19, 3.5, "2016-2017"));

        int sortCount = 4;
//        for(int i=0; i<sortCount; i++)
//        {
//            sortSerial.add(input.nextInt());
//        }

        sortSerial.add(0);
        sortSerial.add(1);



        for(int i: sortSerial)
        {
            db.sort(sortSerial.get(sortSerial.size()-1-i));
        }

        db.printStudents();
    }
}