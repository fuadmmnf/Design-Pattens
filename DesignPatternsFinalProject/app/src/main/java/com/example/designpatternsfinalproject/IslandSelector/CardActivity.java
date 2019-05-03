package com.example.designpatternsfinalproject.IslandSelector;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.widget.Button;

import com.example.designpatternsfinalproject.IslandActivity;
import com.example.designpatternsfinalproject.R;

import java.util.ArrayList;
import java.util.List;

public class CardActivity extends AppCompatActivity {

    private ViewPager viewPager;
    Adapter adapter = null;
    List<IslandModel> models;
    Integer[] colors = null;
    int islandNumber;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();

    private Button viewBtn;
    private String placeName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        viewBtn = (Button) findViewById(R.id.viewBtn);
        models = new ArrayList<>();
        models.add(new IslandModel(R.drawable.island8, "Bronchure1", "Very nice lol"));
        models.add(new IslandModel(R.drawable.island6, "Bronchure2", "Very nice lol"));
        models.add(new IslandModel(R.drawable.island7, "Bronchure2", "Very nice lol"));


        adapter = new Adapter(models, this);


        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130, 0, 130, 0);

        Integer [] colors_temp = {
                getResources().getColor(R.color.color_island1),
                getResources().getColor(R.color.color_island2),
                getResources().getColor(R.color.color_island6)
        };

        colors = colors_temp;

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position < (adapter.getCount()-1) && position < (colors.length -1) )
                {
                    viewPager.setBackgroundColor(
                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]
                            )
                    );
                    placeName = models.get(position).getTitle();
                    islandNumber = position;
                }
                else
                {
                    viewPager.setBackgroundColor(colors[colors.length -1]);
                }
            }

            @Override
            public void onPageSelected(int position) {



            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



        viewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CardActivity.this, IslandActivity.class);
                intent.putExtra("islandNumber", islandNumber+1);
                startActivity(intent);



            }
        });



    }
}
