package com.example.designpatternsfinalproject;

import android.graphics.Paint;
import android.graphics.Path;

import org.apache.commons.collections4.MultiMap;

import org.apache.commons.collections4.map.MultiValueMap;

public class PathSingleton {

    private Path path;
    private Paint paint;
    MultiMap<Integer, Path> paths;
    private static PathSingleton pathInstance = new PathSingleton();

    public static PathSingleton getInstance() {
        if(pathInstance == null)
            pathInstance = new PathSingleton();
        return pathInstance;
    }

    private PathSingleton()
    {
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        path = new Path();
        paths = new MultiValueMap<>();

    }

    public MultiMap<Integer, Path> getPaths() {
        return paths;
    }

    public void addPath(int color, Path path)
    {
        paths.put(color, path);
    }

    public Paint getPaint() {
        return paint;
    }

    public Path getPath() {
        return path;
    }
}
