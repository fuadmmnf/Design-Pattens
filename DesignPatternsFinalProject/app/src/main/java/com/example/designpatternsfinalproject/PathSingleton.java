package com.example.designpatternsfinalproject;

import android.graphics.Paint;
import android.graphics.Path;

public class PathSingleton {

    private Path path;
    private Paint paint;
    private static PathSingleton pathInstance = new PathSingleton();

    public static PathSingleton getInstance() {
        if(pathInstance == null)
            pathInstance = new PathSingleton();
        return pathInstance;
    }

    private PathSingleton()
    {
        paint = new Paint();
        path = new Path();
    }

    public Paint getPaint() {
        return paint;
    }

    public Path getPath() {
        return path;
    }
}
