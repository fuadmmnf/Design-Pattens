package com.example.designpatternsfinalproject;

import android.graphics.Path;
import android.graphics.Point;

import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.widget.RelativeLayout;

import com.example.designpatternsfinalproject.Shapes.Line;

import org.apache.commons.collections4.MultiMap;

import java.util.List;
import java.util.Set;


public class DrawView extends RelativeLayout {
    private Paint paint;
    public static final String TAG="";
    private MultiMap<Integer, Path> mPaths;


    public void init() {
        mPaths = PathSingleton.getInstance().getPaths();
        paint = PathSingleton.getInstance().getPaint();
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(3);
        paint.setPathEffect(null);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);

    }

    public DrawView(Context context) {
        super(context);
        init();
    }


    public void drawPath()
    {
        invalidate();
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (mPaths == null) return;
        Set<Integer> keySets = mPaths.keySet();

        for (Integer color : keySets) {
            paint.setColor(color);
            List<Path> paths = (List<Path>) mPaths.get(color);
            for (Path path : paths) {
                canvas.drawPath(path, paint);
            }
        }

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "onTouchEvent: " + event.getX() + "  " + event.getY());
        }
        return true;
    }
}