package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbersView = findViewById(R.id.numbers);//referring to number text view
        //switching to numbers activity on clicking numbers text view
        numbersView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersActivity = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(numbersActivity);
            }
        });
        TextView familyView = findViewById(R.id.family);//referring to family text view
        //switching to family activity on clicking family text view
        familyView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyActivity = new Intent(MainActivity.this,FamilyMembers.class);
                startActivity(familyActivity);
            }
        });
        TextView colorsView = findViewById(R.id.colors);//referring to colors text view
        //switching to colors activity on clicking colors text view
        colorsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colorsActivity = new Intent(MainActivity.this,Colors.class);
                startActivity(colorsActivity);
            }
        });
        TextView phrasesView = findViewById(R.id.phrases);//referring to phrases text view
        //switching to phrases activity on clicking phrases text view
        phrasesView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrasesActivity = new Intent(MainActivity.this,Phrases.class);
                startActivity(phrasesActivity);

            }
        });


    }
}
