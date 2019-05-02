package com.example.designpatternsfinalproject.Shapes;

import android.graphics.Path;

import com.example.designpatternsfinalproject.PathSingleton;

public interface IShape {
    Path path = PathSingleton.getInstance().getPath();
    public void draw();
}
