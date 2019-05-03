package com.example.designpatternsfinalproject.Shapes;

import android.graphics.Point;
import android.util.Log;
import android.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class ShapeFlyweight {
    public static final String TAG = "ShapeFlyweight";
    private int maxWidth, maxHeight, maxRadius;
    private Map<Pair<Integer,Integer>, Rectangle > rectangles;
    private Map<Integer, Circle> circles;

    public ShapeFlyweight(int maxWidth, int maxHeight, int maxRadius) {
        this.maxWidth = maxWidth;
        this.maxHeight = maxHeight;
        this.maxRadius = maxRadius;

        rectangles = new HashMap<>();
        circles = new HashMap<>();
    }


    public Rectangle getRectangle(Point origin, int height, int width, int color)
    {
        Rectangle rect = rectangles.get(new Pair<Integer, Integer>(width,height));
        if(rect == null)
        {
            Log.d("Flyweight", "getRectangle: paini vai rect");
            rect = new Rectangle(origin, width, height);
            rectangles.put(new Pair<Integer, Integer>(width, height), rect);
        }
        rect.setCoordinates(origin);
        rect.setColor(color);
        Log.d(TAG, "getRectangle: "+rect.toString());
        return  rect;
    }

    public Circle getCircle(Point center, int radius, int color)
    {
        Circle circle = circles.get(radius);
        if(circle== null)
        {
            circle = new Circle(center, radius);
            circles.put(radius, circle);
        }
        circle.setCenter(center);
        circle.setColor(color);

        return  circle;
    }






}
