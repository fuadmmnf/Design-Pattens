package com.example.designpatternsfinalproject;

import android.graphics.Path;
import android.graphics.Point;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import com.example.designpatternsfinalproject.Shapes.Line;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class DrawView extends View {
    private Paint paint = new Paint();
    private Path mPath;



    public void init() {
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(3);
        paint.setPathEffect(null);
        paint.setStyle(Paint.Style.STROKE);
    }

    public DrawView(Context context) {
        super(context);
        init();
    }


    public void drawPath(Path mpath)
    {
        this.mPath = mpath;
        invalidate();
    }

    @Override
    public void onDraw(Canvas canvas) {
        if(mPath == null) return;
        canvas.drawPath(mPath, paint);

        Log.d(TAG, "onDraw: "+mPath.toString());
    }

}