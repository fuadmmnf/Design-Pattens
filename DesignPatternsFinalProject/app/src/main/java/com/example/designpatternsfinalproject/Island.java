package com.example.designpatternsfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.designpatternsfinalproject.AbstractFactory.IFactory;
import com.example.designpatternsfinalproject.AbstractFactory.IslandAbstractFactory;
import com.example.designpatternsfinalproject.Shapes.Line;

public class Island extends AppCompatActivity {

    DrawView canvasView;
    int islandNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        islandNumber = getIntent().getIntExtra("islandNumber", 0);
        PathSingleton.getInstance().getPaths().clear();
        canvasView = new DrawView(this);
        setContentView(canvasView);
        canvasView.setBackground((islandNumber == 1)? getDrawable(R.drawable.island3backgroun) : getDrawable(R.drawable.island2background));
        IFactory iFactory = new IslandAbstractFactory(islandNumber).createIsland();

        canvasView.drawPath();




    }
}
