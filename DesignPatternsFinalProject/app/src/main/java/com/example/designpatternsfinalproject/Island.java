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
    Path mPath;
    Canvas canvas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        islandNumber = getIntent().getIntExtra("islandNumber", 0);
        canvasView = new DrawView(this);
        mPath = new Path();
        setContentView(canvasView);

        IFactory iFactory = new IslandAbstractFactory(islandNumber).createIsland();
        Line line = new Line(new Point(200, 200), new Point(1000, 1000));
        Log.d("Island", "onCreate: "+line.getOrigin()+"    "+line.getDestination());
        mPath = line.draw(mPath);
        canvasView.drawPath(mPath);




    }
}
