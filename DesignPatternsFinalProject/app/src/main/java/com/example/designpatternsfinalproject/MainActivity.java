package com.example.designpatternsfinalproject;

import android.content.Intent;
import android.os.Bundle;

import com.example.designpatternsfinalproject.Island.IslandActivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, IslandActivity.class);
        startActivity(intent);
    }
}
