package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
<<<<<<< HEAD
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
=======
import android.widget.LinearLayout;
>>>>>>> 7f0a8e3fe7fcce469884c7c1309d7c7f0546bbf9
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


<<<<<<< HEAD
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One", "Lutti"));
        words.add(new Word("Two", "Otiiko"));
        words.add(new Word("Three", "Tolookosu"));
        words.add(new Word("Four", "Oyyisa"));
        words.add(new Word("Five", "Massokka"));
        words.add(new Word("Six", "Temmokka"));
        words.add(new Word("Seven", "Kenekaku"));
        words.add(new Word("Eight", "Kawinta"));
        words.add(new Word("Nine", "Wo'e"));
        words.add(new Word("Ten", "Na'aacha"));




        WordAdapter adapter =
                new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
=======
        ArrayList<String> numbers = new ArrayList<String>();
        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");
        numbers.add("Four");
        numbers.add("Five");
        numbers.add("Six");
        numbers.add("Seven");
        numbers.add("Eight");
        numbers.add("Nine");
        numbers.add("Ten");


            LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        int index = 0;
        while (index <numbers.size());
        {
            TextView wordView = new TextView(this);
            wordView.setText(numbers.get(index));
            rootView.addView(wordView);
            index ++;

        }
>>>>>>> 7f0a8e3fe7fcce469884c7c1309d7c7f0546bbf9
    }

}



