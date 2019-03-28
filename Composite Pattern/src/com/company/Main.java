package com.company;
public class Main{

    public static StringBuffer compositeBuilder = new StringBuffer();

    public static void main(String[] args) {
        CompositeShape compositeShape = new CompositeShape("Main Complex Shape");
        CompositeShape rectangle = new CompositeShape("Rectangle");
        BasicShape shape1 = new BasicShape("Basic1");
        BasicShape shape2 = new BasicShape("Basic 2");
        BasicShape shape3 = new BasicShape("Basic 3");

        compositeShape.add(shape1);
        compositeShape.add(rectangle);
        compositeShape.add(shape2);
        rectangle.add(shape3);

        compositeShape.draw();
    }
}