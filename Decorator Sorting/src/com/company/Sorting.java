package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {

    private List<Student> students;
    private int pref;
    public Sorting(List<Student> students, int pref) {
        this.students = students;
        this.pref = pref;
    }




    public List<Student> sort() {
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {

                Object type = s1.getAttributeList().get(pref);

                if(type instanceof String)
                {
                    String st1 = (String) s1.getAttributeList().get(pref);
                    String st2 = (String) s2.getAttributeList().get(pref);

                    if(st1.equals(st2)) return 0;
                    return st1.compareTo(st2);
                }else {

                    if(type instanceof Integer) {
                        Integer st1 = (Integer) (s1.getAttributeList().get(pref));
                        Integer st2 = (Integer) (s2.getAttributeList().get(pref));
                        if(st1 == st2)
                            return 0;
                        return (st1<st2) ? -1 : 1;

                    }
                    else
                    {
                        Double st1 = (Double) (s1.getAttributeList().get(pref));
                        Double st2 = (Double) (s2.getAttributeList().get(pref));

                        if(st1 == st2)
                            return 0;
                        return (st1<st2) ? -1 : 1;
                    }


                }
            }
        });
        return students;
    }

    public void printStudents()
    {
        for(Student s: students)
            System.out.println(s.toString());
    }
}