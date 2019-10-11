package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);
       ArrayList<Word> words = new ArrayList<Word>();
       words.add(new Word("ekam","one",R.drawable.number_one));
       words.add(new Word("dve","two",R.drawable.number_two));
       words.add(new Word("treeni","three",R.drawable.number_three));
       words.add(new Word("chatvaari","four",R.drawable.number_four));
       words.add(new Word("pancha","five",R.drawable.number_five));
       words.add(new Word("shat","six",R.drawable.number_six));
       words.add(new Word("sapta","seven",R.drawable.number_seven));
       words.add(new Word("ashta","eight",R.drawable.number_eight));
       words.add(new Word("nava","nine",R.drawable.number_nine));
       words.add(new Word("dasha","ten",R.drawable.number_ten));

        WordAdapter wordAdapter = new WordAdapter(this,words,R.color.category_numbers);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(wordAdapter);

    }
}
