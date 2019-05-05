package com.example.designpatternsfinalproject.Island;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;

import android.graphics.Color;

import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.designpatternsfinalproject.AbstractFactory.IFactory;
import com.example.designpatternsfinalproject.AbstractFactory.IslandAbstractFactory;
import com.example.designpatternsfinalproject.MarriageCommand.MarriageCommand;
import com.example.designpatternsfinalproject.MarriageCommand.PerformMarriage;
import com.example.designpatternsfinalproject.MarriageCommand.PriestAction;
import com.example.designpatternsfinalproject.MediatorCyberCafe.CafeMediator;
import com.example.designpatternsfinalproject.MediatorCyberCafe.City;
import com.example.designpatternsfinalproject.PathSingleton;
import com.example.designpatternsfinalproject.R;
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
    List<City> cities;
    WaterReservoir waterReserver;
    DisasterMonitoringSystem disasterMonitoringSystem;
    CafeMediator cafeMediator;
    PriestAction priestAction;
    MarriageCommand marriageCommand;

    SubActionButton waterButton;
    SubActionButton disasterButton;
    SubActionButton cybercafeButton;
    SubActionButton marriageButton;
    SubActionButton undoButton;

    Snackbar snackbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        islandNumber = getIntent().getIntExtra("islandNumber", 0);
        PathSingleton.getInstance().getPaths().clear();

        waterReserver = new WaterReservoir(100, 40);
        inhabitants = new ArrayList<>();
        cities = new ArrayList<>();
        disasterMonitoringSystem = new DisasterMonitoringSystem();
        cafeMediator = new CafeMediator(this);
        marriageCommand = new MarriageCommand();
        populateIsland();
        populateCities(cafeMediator);

        canvasView = new DrawView(this);
        setContentView(canvasView);
        canvasView.setBackground((islandNumber == 1) ? getDrawable(R.drawable.island3backgroun) : getDrawable(R.drawable.island2background));
        IFactory iFactory = new IslandAbstractFactory(islandNumber).createIsland();
        canvasView.drawPath();


        setMenu();


    }

    private void populateCities(CafeMediator cafeMediator) {
        cities.add(new City("Rajshahi", cafeMediator ));
        cities.add(new City("Dhaka", cafeMediator ));

        for(City city: cities)
            cafeMediator.addCollegue(city);

        for (int i = 0; i < inhabitants.size(); i++) {
            if (i % 2 == 0)
                cities.get(0).addInhabitant(inhabitants.get(i));
            else
                cities.get(1).addInhabitant(inhabitants.get(i));
        }
    }

    private void populateIsland() {

        inhabitants.add(new Inhabitant("Fuad", "soft"));
        inhabitants.add(new Inhabitant("Nafis", "soft"));
        inhabitants.add(new Inhabitant("Fahmid"));
        inhabitants.add(new Inhabitant("Saif"));
        inhabitants.add(new Inhabitant("Rabbi"));
        inhabitants.add(new Inhabitant("Saikat"));
        inhabitants.add(new Inhabitant("Akib"));
        inhabitants.add(new Inhabitant("Aminul"));
        inhabitants.add(new Inhabitant("Rezowan"));

        for (int i = 0; i < inhabitants.size(); i++)
            disasterMonitoringSystem.addInhabitant(inhabitants.get(i));

    }


    private void setMenu() {

        final Random rand = new Random();
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
                snackbar = Snackbar.make(canvasView, inhabitants.get(rand.nextInt(inhabitants.size())).takeWaterFromWaterReservoir(waterReserver, 25), Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });


        itemIcon = new ImageView(this);
        itemIcon.setImageResource(R.drawable.ic_disaster);
        disasterButton = itemBuilder.setContentView(itemIcon).build();
        disasterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(IslandActivity.this, disasterMonitoringSystem.sendAlert(),
                        Toast.LENGTH_LONG).show();
            }
        });


        itemIcon = new ImageView(this);
        itemIcon.setImageResource(R.drawable.ic_cybercafe);
        cybercafeButton = itemBuilder.setContentView(itemIcon).build();
        cybercafeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar = Snackbar.make(canvasView, cities.get(0).sendMsg("Foni cyclone attacked Rajshahi"), Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });


        itemIcon = new ImageView(this);
        itemIcon.setImageResource(R.drawable.ic_marriage);
        marriageButton = itemBuilder.setContentView(itemIcon).build();
        marriageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstId = rand.nextInt(inhabitants.size());
                int secondId;
                while (firstId == (secondId = rand.nextInt(inhabitants.size())));

                priestAction = new PriestAction(inhabitants.get(firstId), inhabitants.get(secondId), IslandActivity.this);
                priestAction.performMarriage();
                marriageCommand.addCommand(new PerformMarriage(priestAction));
            }
        });



        itemIcon = new ImageView(this);
        itemIcon.setImageResource(R.drawable.ic_undo);
        undoButton = itemBuilder.setContentView(itemIcon).build();
        undoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marriageCommand.undo();
            }
        });






        itemIcon = new ImageView(this);
        itemIcon.setImageResource(R.drawable.ic_close_black_24dp);

        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder((Activity) this)
                .addSubActionView(waterButton)
                .addSubActionView(disasterButton)
                .addSubActionView(cybercafeButton)
                .addSubActionView(marriageButton)
                .addSubActionView(undoButton)
                .attachTo(actionButton)
                .build();


    }

    public void resetButtonColor() {
        waterButton.setBackgroundColor(Color.WHITE);
        disasterButton.setBackgroundColor(Color.WHITE);
        marriageButton.setBackgroundColor(Color.WHITE);
        cybercafeButton.setBackgroundColor(Color.WHITE);
    }

}
