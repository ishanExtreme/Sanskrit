package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("raktaḥ","Red",R.drawable.color_red));
        words.add(new Word("haritaḥ","Green",R.drawable.color_green));
        words.add(new Word("Kapiśaḥ","Brown",R.drawable.color_brown));
        words.add(new Word("dhūmravarṇaḥ","Gray",R.drawable.color_gray));
        words.add(new Word("kṛṣṇaḥ","Black",R.drawable.color_black));
        words.add(new Word("śvetaḥ","White",R.drawable.color_white));
        words.add(new Word("pītaḥ","Yellow",R.drawable.color_mustard_yellow));



        WordAdapter wordAdapter = new WordAdapter(this,words,R.color.category_colors);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(wordAdapter);
    }
}
