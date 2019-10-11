package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Pitā","Father",R.drawable.family_father));
        words.add(new Word("Mātā","Mother",R.drawable.family_mother));
        words.add(new Word("Putraḥ","Son",R.drawable.family_son));
        words.add(new Word("Putrī","Daughter",R.drawable.family_daughter));
        words.add(new Word("Jyeṣṭhabhrātā","Elder Brother",R.drawable.family_older_brother));
        words.add(new Word("Kaniṣṭhabhrātā","Younger Brother",R.drawable.family_younger_brother));
        words.add(new Word("Jyeṣṭhabhaginī","Elder Sister",R.drawable.family_older_sister));
        words.add(new Word("Kaniṣṭhabhaginī","Younger Sister",R.drawable.family_younger_sister));
        words.add(new Word("Pitāmahī","Paternal Grandmother",R.drawable.family_grandmother));
        words.add(new Word("Pitāmahaḥ","Paternal Grandfather",R.drawable.family_grandfather));




        WordAdapter wordAdapter = new WordAdapter(this,words,R.color.category_family);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(wordAdapter);
    }
}
