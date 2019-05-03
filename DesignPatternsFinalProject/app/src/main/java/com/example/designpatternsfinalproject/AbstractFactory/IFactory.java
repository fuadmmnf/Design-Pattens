package com.example.designpatternsfinalproject.AbstractFactory;


import android.graphics.drawable.Drawable;

public interface IFactory {
    public IFlora createFlora();
    public IFauna createFauna();
}
