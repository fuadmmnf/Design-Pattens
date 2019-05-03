package com.example.designpatternsfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;

import android.graphics.Color;

import android.os.Bundle;

import android.widget.ImageView;

import com.example.designpatternsfinalproject.AbstractFactory.IFactory;
import com.example.designpatternsfinalproject.AbstractFactory.IslandAbstractFactory;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

public class IslandActivity extends AppCompatActivity {

    DrawView canvasView;
    int islandNumber;


    SubActionButton waterButton;
    SubActionButton disasterButton;
    SubActionButton cybercafeButton;
    SubActionButton pentagonButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        islandNumber = getIntent().getIntExtra("islandNumber", 0);
        PathSingleton.getInstance().getPaths().clear();


        canvasView = new DrawView(this);
        setContentView(canvasView);
        
        
//        setMenu();
        
        canvasView.setBackground((islandNumber == 1)? getDrawable(R.drawable.island3backgroun) : getDrawable(R.drawable.island2background));
        IFactory iFactory = new IslandAbstractFactory(islandNumber).createIsland();

        canvasView.drawPath();




    }



//    private void setMenu() {
//        ImageView icon = new ImageView(this); // Create an icon
//        icon.setImageResource(R.drawable.ic_menu_black_24dp);
//
//        FloatingActionButton actionButton = new FloatingActionButton.Builder((Activity) this)
//                .setContentView(icon)
//                .build();
//
//        SubActionButton.Builder itemBuilder = new SubActionButton.Builder((Activity) this);
//
//        // repeat many times:
//        ImageView itemIcon = new ImageView(this);
//        itemIcon.setImageResource(R.drawable.);
//        waterButton = itemBuilder.setContentView(itemIcon).build();
//
//        itemIcon = new ImageView(this);
//        itemIcon.setImageResource(R.drawable.);
//        disasterButton = itemBuilder.setContentView(itemIcon).build();
//
//        itemIcon = new ImageView(this);
//        itemIcon.setImageResource(R.drawable.);
//        cybercafeButton = itemBuilder.setContentView(itemIcon).build();
//
//        itemIcon = new ImageView(this);
//        itemIcon.setImageResource(R.drawable.);
//        pentagonButton = itemBuilder.setContentView(itemIcon).build();
//
//        itemIcon = new ImageView(this);
//        itemIcon.setImageResource(R.drawable.ic_close_black_24dp);
//        SubActionButton clearButton = itemBuilder.setContentView(itemIcon).build();
//
//        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder((Activity) this)
//                .addSubActionView(waterButton)
//                .addSubActionView(disasterButton)
//                .addSubActionView(cybercafeButton)
//                .addSubActionView(pentagonButton)
//                .addSubActionView(clearButton)
//                .attachTo(actionButton)
//                .build();
//
//
//
//
//
//
//
//    }
//    public void resetButtonColor()
//    {
//        waterButton.setBackgroundColor(Color.WHITE);
//        disasterButton.setBackgroundColor(Color.WHITE);
//        pentagonButton.setBackgroundColor(Color.WHITE);
//        cybercafeButton.setBackgroundColor(Color.WHITE);
////        waterButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(IslandActivity.this, Color.WHITE)));
////        disasterButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(IslandActivity.this, R.color.white)));
////        pentagonButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(IslandActivity.this, R.color.white)));
////        cybercafeButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(IslandActivity.this, R.color.white)));
//    }

}
