package com.company;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedByAgeList implements IList {
    IList list;

    public SortedByAgeList(IList list) {
        this.list = list;
    }

    @Override
    public List<Student> getList() {

        List<Student> temp = list.getList();
        Collections.sort(temp, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {

                return s1.getAge() - s2.getAge(); // Ascending
            }
        });
        return temp;
    }
}
