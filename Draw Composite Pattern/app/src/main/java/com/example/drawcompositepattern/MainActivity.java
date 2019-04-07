package com.example.drawcompositepattern;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;


public class MainActivity extends AppCompatActivity {

    private int pointNum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView icon = new ImageView(this); // Create an icon
        icon.setImageResource(R.drawable.ic_menu_black_24dp);

        FloatingActionButton actionButton = new FloatingActionButton.Builder(this)
                .setContentView(icon)
                .build();

        SubActionButton.Builder itemBuilder = new SubActionButton.Builder(this);

        // repeat many times:
        ImageView itemIcon = new ImageView(this);
        itemIcon.setImageResource(R.drawable.ic_details_black_24dp);
        SubActionButton triangleButton = itemBuilder.setContentView(itemIcon).build();

        itemIcon = new ImageView(this);
        itemIcon.setImageResource(R.drawable.ic_check_box_outline_blank_black_24dp);
        SubActionButton rectButton = itemBuilder.setContentView(itemIcon).build();

        itemIcon = new ImageView(this);
        itemIcon.setImageResource(R.drawable.ic_timeline_black_24dp);
        SubActionButton lineButton = itemBuilder.setContentView(itemIcon).build();



        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder(this)
                .addSubActionView(triangleButton)
                .addSubActionView(rectButton)
                .addSubActionView(lineButton)
                .attachTo(actionButton)
                .build();

        triangleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointNum = 3;
            }
        });


        rectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointNum = 4;
            }
        });


        lineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointNum = 2;
            }
        });
    }



}
