package com.example.android.miwok;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class Word {
    private ArrayAdapter wordAdapter;
    private ArrayList wordList;
    private String mDefaultTranslation;
   private String mMiwokTranslation;

    public Word (String mDefaultTranslation, String mMiwokTranslation){
        mDefaultTranslation = mDefaultTranslation;
        mMiwokTranslation = mMiwokTranslation;
    }

    public String getmDefaultTranslation (){
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}
