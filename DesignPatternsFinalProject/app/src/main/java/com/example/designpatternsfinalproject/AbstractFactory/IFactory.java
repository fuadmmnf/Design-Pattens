package com.example.designpatternsfinalproject.AbstractFactory;

import android.graphics.Path;

import com.example.designpatternsfinalproject.PathSingleton;

public interface IFactory {
    public IFlora createFlora();
    public IFauna createFauna();
}
