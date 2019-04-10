package com.company;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {

    private List<Student> students;

    public Sorting() {

    }


    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> sort(int pref) {
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {

                Object type = s1.getAttributeList().get(pref).getClass();

                if (s1.getAttributeList().get(pref) == s2.getAttributeList().get(pref))
                    return 0;
                return s1.getAttributeList().get(pref) < s2.getAttributeList().get(pref)? -1 : 1;
            }
        });
        return students;
    }
}