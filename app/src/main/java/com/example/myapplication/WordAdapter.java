package com.example.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mResourceId;
    public WordAdapter(Activity context,ArrayList<Word> list,int mResourceId)
    {super(context,0,list);
        this.mResourceId = mResourceId;

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.word_view, parent, false);
        }

        Word currentWord = getItem(position);
        TextView sanskritText = listItemView.findViewById(R.id.sanskrit);
        sanskritText.setText(currentWord.getmSanskrit());
        TextView englishText = listItemView.findViewById(R.id.english);
        englishText.setText(currentWord.getmEnglish());
        ImageView imageView = listItemView.findViewById(R.id.images);
        if(currentWord.hasImage()){
        imageView.setImageResource(currentWord.getmResourceId());}
        else
        {
            imageView.setVisibility(View.GONE);
        }
        LinearLayout linearLayout =listItemView.findViewById(R.id.linear);
        int color = ContextCompat.getColor(getContext(),getmResourceId());
        linearLayout.setBackgroundColor(color);
        return listItemView;
    }

    public int getmResourceId() {
        return mResourceId;
    }
}
