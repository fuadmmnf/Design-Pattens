package com.example.designpatternsfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;

import android.graphics.Color;

import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;

import com.example.designpatternsfinalproject.AbstractFactory.IFactory;
import com.example.designpatternsfinalproject.AbstractFactory.IslandAbstractFactory;
import com.google.android.material.snackbar.Snackbar;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IslandActivity extends AppCompatActivity {

    DrawView canvasView;
    int islandNumber;
    List<Inhabitant> inhabitants;
    WaterReservoir waterReserver;

    SubActionButton waterButton;
    SubActionButton disasterButton;
    SubActionButton cybercafeButton;
    SubActionButton pentagonButton;

    Snackbar snackbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        islandNumber = getIntent().getIntExtra("islandNumber", 0);
        PathSingleton.getInstance().getPaths().clear();

        waterReserver = new WaterReservoir(100, 40);
        inhabitants = new ArrayList<>();
        populateIsland();

        canvasView = new DrawView(this);
        setContentView(canvasView);
        canvasView.setBackground((islandNumber == 1)? getDrawable(R.drawable.island3backgroun) : getDrawable(R.drawable.island2background));
        IFactory iFactory = new IslandAbstractFactory(islandNumber).createIsland();
        canvasView.drawPath();



        setMenu();





    }

    private void populateIsland() {

        inhabitants.add(new Inhabitant("Faud"));
        inhabitants.add(new Inhabitant("Nafis"));
        inhabitants.add(new Inhabitant("Fahmid"));
        inhabitants.add(new Inhabitant("Saif"));
        inhabitants.add(new Inhabitant("Rabbi"));
        inhabitants.add(new Inhabitant("Saikat"));
        inhabitants.add(new Inhabitant("Akib"));
        inhabitants.add(new Inhabitant("Aminul"));
    }


    private void setMenu() {
        ImageView icon = new ImageView(this); // Create an icon
        icon.setImageResource(R.drawable.ic_menu_black_24dp);

        FloatingActionButton actionButton = new FloatingActionButton.Builder((Activity) this)
                .setContentView(icon)
                .build();

        SubActionButton.Builder itemBuilder = new SubActionButton.Builder((Activity) this);

        // repeat many times:
        ImageView itemIcon = new ImageView(this);
        itemIcon.setImageResource(R.drawable.ic_water_reservoir);
        waterButton = itemBuilder.setContentView(itemIcon).build();
        waterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                snackbar = Snackbar.make(canvasView, inhabitants.get(rand.nextInt(inhabitants.size())).takeWaterFromWaterReservoir(waterReserver, 25), Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });





        itemIcon = new ImageView(this);
//        itemIcon.setImageResource(R.drawable.);
        disasterButton = itemBuilder.setContentView(itemIcon).build();

        itemIcon = new ImageView(this);
//        itemIcon.setImageResource(R.drawable.);
        cybercafeButton = itemBuilder.setContentView(itemIcon).build();

        itemIcon = new ImageView(this);
//        itemIcon.setImageResource(R.drawable.);
        pentagonButton = itemBuilder.setContentView(itemIcon).build();

        itemIcon = new ImageView(this);
        itemIcon.setImageResource(R.drawable.ic_close_black_24dp);

        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder((Activity) this)
                .addSubActionView(waterButton)
                .addSubActionView(disasterButton)
                .addSubActionView(cybercafeButton)
                .addSubActionView(pentagonButton)
                .attachTo(actionButton)
                .build();









    }
    public void resetButtonColor()
    {
        waterButton.setBackgroundColor(Color.WHITE);
        disasterButton.setBackgroundColor(Color.WHITE);
        pentagonButton.setBackgroundColor(Color.WHITE);
        cybercafeButton.setBackgroundColor(Color.WHITE);
//        waterButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(IslandActivity.this, Color.WHITE)));
//        disasterButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(IslandActivity.this, R.color.white)));
//        pentagonButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(IslandActivity.this, R.color.white)));
//        cybercafeButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(IslandActivity.this, R.color.white)));
    }

}
