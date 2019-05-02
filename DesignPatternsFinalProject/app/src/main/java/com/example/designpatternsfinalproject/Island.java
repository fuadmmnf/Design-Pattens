package com.example.designpatternsfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;

import com.example.designpatternsfinalproject.AbstractFactory.IFactory;
import com.example.designpatternsfinalproject.AbstractFactory.IslandAbstractFactory;

public class Island extends AppCompatActivity {

    View canvasView;
    int islandNumber;
    Canvas canvas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        islandNumber = getIntent().getIntExtra("islandNumber", 0);
        canvasView = new DrawView(this);

        IFactory iFactory = new IslandAbstractFactory(islandNumber).createIsland();
        

        setContentView(canvasView);




    }
}
