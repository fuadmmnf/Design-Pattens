package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Sorting db = new Sorting();
        List<Student> sortedStudents = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        int studentNum = 4;

        for(int i=0; i<studentNum; i++)
            db.addStudent(new Student(input.next(), input.nextInt(), input.nextDouble(), input.next()));


        int sortCount = 4;
        for(int i=0; i<sortCount; i++)
        {
            sortedStudents = db.sort(input.nextInt());
        }

    }
}
