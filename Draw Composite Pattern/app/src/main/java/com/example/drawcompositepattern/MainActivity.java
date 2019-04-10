package com.example.drawcompositepattern;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.drawcompositepattern.BasicShape.Line;
import com.example.drawcompositepattern.CompositeShape.Pentagon;
import com.example.drawcompositepattern.CompositeShape.Rectangle;
import com.example.drawcompositepattern.CompositeShape.Triangle;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private int pointNum = -1;
    private List<Point> points;

    private DrawView drawView;
    private List<IShape> shapes;
    IShape shape;
    Path path;
    SubActionButton triangleButton;
    SubActionButton rectButton;
    SubActionButton lineButton;
    SubActionButton pentagonButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        points = new ArrayList<>();

        path = new Path();
        shapes = new ArrayList<>();
        drawView = new DrawView(MainActivity.this);
        setContentView(drawView);

        ImageView icon = new ImageView(this); // Create an icon
        icon.setImageResource(R.drawable.ic_menu_black_24dp);

        FloatingActionButton actionButton = new FloatingActionButton.Builder((Activity) this)
                .setContentView(icon)
                .build();

        SubActionButton.Builder itemBuilder = new SubActionButton.Builder((Activity) this);

        // repeat many times:
        ImageView itemIcon = new ImageView(this);
        itemIcon.setImageResource(R.drawable.ic_details_black_24dp);
        triangleButton = itemBuilder.setContentView(itemIcon).build();

        itemIcon = new ImageView(this);
        itemIcon.setImageResource(R.drawable.ic_check_box_outline_blank_black_24dp);
        rectButton = itemBuilder.setContentView(itemIcon).build();

        itemIcon = new ImageView(this);
        itemIcon.setImageResource(R.drawable.ic_timeline_black_24dp);
        lineButton = itemBuilder.setContentView(itemIcon).build();

        itemIcon = new ImageView(this);
        itemIcon.setImageResource(R.drawable.ic_label_outline_black_24dp);
        pentagonButton = itemBuilder.setContentView(itemIcon).build();

        itemIcon = new ImageView(this);
        itemIcon.setImageResource(R.drawable.ic_close_black_24dp);
        SubActionButton clearButton = itemBuilder.setContentView(itemIcon).build();

        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder((Activity) this)
                .addSubActionView(triangleButton)
                .addSubActionView(rectButton)
                .addSubActionView(lineButton)
                .addSubActionView(pentagonButton)
                .addSubActionView(clearButton)
                .attachTo(actionButton)
                .build();

        triangleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resetButtonColor();
                triangleButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDark)));

                pointNum = 3;
                shape = new Triangle();
                shapes.add(shape);
            }
        });


        rectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetButtonColor();
                rectButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDark)));

                pointNum = 4;
                shape = new Rectangle();
                shapes.add(shape);
            }
        });

        pentagonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resetButtonColor();
                pentagonButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDark)));


                pointNum = 5;
                shape = new Pentagon();
                shapes.add(shape);
            }
        });


        lineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetButtonColor();
                lineButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDark)));

                pointNum = 2;
                shape = new Line();
                shapes.add(shape);
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                path.reset();
                drawView.clear();
            }
        });



    }
    public void resetButtonColor()
    {
        triangleButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(MainActivity.this, R.color.white)));

        rectButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(MainActivity.this, R.color.white)));
        pentagonButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(MainActivity.this, R.color.white)));
        lineButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(MainActivity.this, R.color.white)));
    }
    public class DrawView extends View {

        private Paint paint;
        private Singleton instance;


        public DrawView(Context context) {
            super(context);
            instance = Singleton.getInstance();
            paint = new Paint();
        }


        @Override
        protected void onDraw(Canvas canvas) {

            if(pointNum == points.size()) {
                shape.setPoints(points);

                //canvas.drawColor(Color.CYAN);
                path.moveTo(points.get(0).x, points.get(0).y);

                for (int i = 1; i < points.size(); i++) {
                    path.lineTo(points.get(i).x, points.get(i).y);
                }
                path.close();

                paint.setStrokeWidth(3);
                paint.setPathEffect(null);
                paint.setColor(Color.BLACK);
                paint.setStyle(Paint.Style.STROKE);


                points.clear();
                Toast.makeText(MainActivity.this, shape.description(),
                        Toast.LENGTH_LONG).show();
            }

            canvas.drawPath(path, paint);
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {
            int eventaction = event.getAction();

            int X = (int) event.getX();
            int Y = (int) event.getY();

            switch (eventaction) {

                case MotionEvent.ACTION_DOWN:

                    if(pointNum!=-1)
                    {
                        points.add(new Point(X, Y));

                    }
                    invalidate();
                    break;
            }

            return true;
        }

        public void clear()
        {
            path.reset();
            points.clear();
            invalidate();
        }


    }

}
