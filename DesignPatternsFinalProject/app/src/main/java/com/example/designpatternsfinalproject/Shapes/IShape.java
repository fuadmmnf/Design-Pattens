package com.example.designpatternsfinalproject.Shapes;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

import com.example.designpatternsfinalproject.PathSingleton;

public interface IShape {


    PathSingleton singletonInstance = PathSingleton.getInstance();
    Paint paint = PathSingleton.getInstance().getPaint();
    public void draw();

}
