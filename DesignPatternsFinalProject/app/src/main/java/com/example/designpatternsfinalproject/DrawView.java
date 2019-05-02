package com.example.designpatternsfinalproject;

import android.util.AttributeSet;
import android.view.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class DrawView extends View {
    private Paint paint = new Paint();
    int startX, startY, stopX, stopY;

    public  Canvas canvasInstance = null;

    public  Canvas getInstance()
    {
        if(canvasInstance == null)
            canvasInstance = new Canvas();
        return canvasInstance;
    }


    public void init() {
        paint.setColor(Color.BLACK);
    }

    public DrawView(Context context) {
        super(context);
        init();
    }

    private DrawView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private DrawView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }


    public  void drawLineTo(int startX, int startY, int stopX, int stopY)
    {
        this.startX = startX;
        this.startY = startY;
        this.stopX = stopX;
        this.stopY = stopY;
        invalidate();
    }

    @Override
    public void onDraw(Canvas canvas) {
        drawLineTo(100,100,200, 200);
        canvas.drawLine(startX, startY, stopX, stopY, paint);

    }

}