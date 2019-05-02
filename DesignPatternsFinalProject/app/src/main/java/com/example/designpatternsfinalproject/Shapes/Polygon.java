package com.example.designpatternsfinalproject.Shapes;

import android.graphics.Path;

import java.util.ArrayList;
import java.util.List;

public class Polygon implements IShape {

    List<IShape> shapes;

    public Polygon() {
        shapes = new ArrayList<>();
    }

    public void addShape(IShape shape)
    {
        shapes.add(shape);
    }

    @Override
    public void draw() {
        for(IShape shape: shapes)
            shape.draw();
    }
}
