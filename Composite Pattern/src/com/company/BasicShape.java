package com.company;

class BasicShape implements IShape {
    private String name;

    public BasicShape(String name) {
        this.name = name;
    }

    public void draw() {
        System.out.println("Drawing Basic space: "+ name);
    }
}