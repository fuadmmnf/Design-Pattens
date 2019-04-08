package com.example.drawcompositepattern.CompositeShape;

import android.graphics.Point;

import com.example.drawcompositepattern.BasicShape.Line;
import com.example.drawcompositepattern.IShape;

import java.util.ArrayList;
import java.util.List;

public class Rectangle implements IShape {
    private List<IShape> lines;



    public Rectangle()
    {
        lines = new ArrayList<>();
    }


    @Override
    public void setPoints(List<Point> points) {
        ArrayList<Point> temp = new ArrayList<>();
        lines.clear();
        temp.add(new Point(0,0));
        temp.add(new Point(0,0));
        Line line = new Line();

        for(int i=1; i<points.size(); i++)
        {
            Point p1 = points.get(i-1);
            Point p2 = points.get(i);


            temp.set(0, p1);
            temp.set(1, p2);
            line.setPoints(temp);
            lines.add(line);
        }
        temp.set(0, points.get(points.size()-1) );
        temp.set(1, points.get(0));
        line.setPoints(temp);
        lines.add(line);
    }


    @Override
    public String description() {
        String des = "";
        for(IShape line: lines)
            des += line.description();

        return des;
    }
}
