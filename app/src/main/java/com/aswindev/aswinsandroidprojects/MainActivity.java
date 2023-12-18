package com.aswindev.aswinsandroidprojects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    RecyclerView projectList = findViewById(R.id.recycler_view_projects);

    Project[] projects = {
            new Project("Getting Started App", "Our very first project", R.drawable.getting_started),
            new Project("Motivational Quotes", "Making a simple change to the layout, with my own personal motivational quote for everyone.", R.drawable.quote),
            new Project("BMI Calculator", "A working BMI calculator with variables, methods and conditional logic.", R.drawable.calculator),
            new Project("Inches Converter", "A basic converter to convert inches to meters", R.drawable.tape),
            new Project("Hungry Hippo Restaurant Menu", "A menu app for a fictional restaurant, learning about activities, classes, arrays and objects", R.drawable.hungry_developer)
    };


}

