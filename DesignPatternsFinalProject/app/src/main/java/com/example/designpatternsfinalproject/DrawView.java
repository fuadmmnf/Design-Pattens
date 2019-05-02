package com.example.designpatternsfinalproject;

import android.graphics.Path;
import android.graphics.Point;

import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import com.example.designpatternsfinalproject.Shapes.Line;

import org.apache.commons.collections4.MultiMap;

import java.util.List;
import java.util.Set;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class DrawView extends View {
    private Paint paint;
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
            Log.d(TAG, "onDraw: "+paths.size());
            for (Path path : paths) {
                canvas.drawPath(path, paint);
            }
        }

    }

}