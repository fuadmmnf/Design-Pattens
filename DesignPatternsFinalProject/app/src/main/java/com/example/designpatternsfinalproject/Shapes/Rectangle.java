package com.example.designpatternsfinalproject.Shapes;

import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Point;

import androidx.annotation.NonNull;

public class Rectangle implements IShape {

    private int left, top, right, bottom, width, height;
    private int color = Color.BLACK;
    public Rectangle(Point origin, int width, int height) {
        setIntrinsics(width, height);
        setCoordinates(origin);
    }

    public Rectangle(int width, int height) {
        setIntrinsics(width, height);
    }

    public void setCoordinates(Point origin)
    {
        this.left = origin.x;
        this.top = origin.y;
        this.right = left+width;
        this.bottom = top+height;
    }

    public void setColor(int color)
    {
        this.color = color;
    }
    public void setIntrinsics(int width, int height)
    {
        this.width = width;
        this.height =height;
    }

    @Override
    public void draw() {
        Path path = new Path();
        path.addRect(left, top, right, bottom, Path.Direction.CW);
        singletonInstance.addPath(color, path);
    }

    @NonNull
    @Override
    public String toString() {
        return "Rectangle: top:"+top+", left:"+left+", width:"+width+", height:"+height;
    }
}
