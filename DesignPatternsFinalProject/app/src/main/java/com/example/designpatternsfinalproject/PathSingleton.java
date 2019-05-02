package com.example.designpatternsfinalproject;

import android.graphics.Path;

public class PathSingleton {

    private Path path;
    private static PathSingleton pathInstance = new PathSingleton();

    public static PathSingleton getInstance() {
        if(pathInstance == null)
            pathInstance = new PathSingleton();
        return pathInstance;
    }

    private PathSingleton() {
        path = new Path();
    }

    public Path getPath() {
        return path;
    }
}
