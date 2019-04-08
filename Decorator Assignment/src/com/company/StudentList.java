package com.company;

import java.util.List;

public class StudentList implements IList {

    private List<Student> students;

    public StudentList(List<Student> students) {
        this.students = students;
    }

    @Override
    public List<Student> getList() {
        return students;
    }
}
