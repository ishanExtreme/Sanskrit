package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("kaha likhati?","Who is writing?"));
        words.add(new Word("tvam likhasi.","You are writing"));
        words.add(new Word("aham likhaami.","I am writing"));
        words.add(new Word("eshaha pathati.","He is reading"));
        words.add(new Word("tvam pathasi.","You are reading"));
        words.add(new Word("aham pathaami.","I am reading"));
        words.add(new Word("saha gachchati.","He is going"));
        words.add(new Word("tvam gachchasi.","You are going"));
        words.add(new Word("aham gachchaami.","I am going"));





        WordAdapter wordAdapter = new WordAdapter(this,words,R.color.category_phrases);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(wordAdapter);
    }
}
