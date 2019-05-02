package com.example.designpatternsfinalproject.Shapes;

import android.graphics.Path;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;

public class ComplexShape implements IShape {

    List<IShape> shapes;

    public ComplexShape() {
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

    @NonNull
    @Override
    public String toString() {
        String result = "";
        for(IShape shape: shapes)
            result+= shape.toString()+"\n";

        return result;
    }
}
