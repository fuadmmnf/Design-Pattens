package com.example.designpatternsfinalproject.AbstractFactory;


import android.graphics.Path;

import com.example.designpatternsfinalproject.PathSingleton;

public interface IFauna {
    public Path path = PathSingleton.getInstance().getPath();
    public void drawFauna();
}
