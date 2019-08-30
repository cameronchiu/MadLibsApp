package com.example.madlibsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FilledStory extends AppCompatActivity {

    public static final String EDIT_TEXT = "edit_text";
    public static final String EDIT_TEXT2 = "edit_text2";
    public static final String EDIT_TEXT3 = "edit_text3";
    public static final String EDIT_TEXT4 = "edit_text4";
    public static final String EDIT_TEXT5 = "edit_text5";
    public static final String EDIT_TEXT6 = "edit_text6";
    public static final String EDIT_TEXT7 = "edit_text7";
    public static final String EDIT_TEXT8 = "edit_text8";
    public static final String EDIT_TEXT9 = "edit_text9";
    public static final String EDIT_TEXT10 = "edit_text10";
    public static final String EDIT_TEXT11 = "edit_text11";
    public static final String EDIT_TEXT12 = "edit_text12";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filled_story);

        Intent intent = getIntent();
        String editText = intent.getStringExtra("edit_text");
        String editText2 = intent.getStringExtra(EDIT_TEXT2);
        String editText3 = intent.getStringExtra(EDIT_TEXT3);
        String editText4 = intent.getStringExtra(EDIT_TEXT4);
        String editText5 = intent.getStringExtra(EDIT_TEXT5);
        String editText6 = intent.getStringExtra(EDIT_TEXT6);
        String editText7 = intent.getStringExtra(EDIT_TEXT7);
        String editText8 = intent.getStringExtra(EDIT_TEXT8);
        String editText9 = intent.getStringExtra(EDIT_TEXT9);
        String editText10 = intent.getStringExtra(EDIT_TEXT10);
        String editText11 = intent.getStringExtra(EDIT_TEXT11);
        String editText12 = intent.getStringExtra(EDIT_TEXT12);

        String story = "The Mobile App Development class is a(n) "+ editText + " place" +
                " to say the least. The classmates in period 5 like "+editText2+" and "+editText3
                +" are always "+editText4+" around in class instead of working on their code."
                +" But what makes M448 really "+editText+" is the "+editText5+" teacher, Mrs. Denna."
                +"I mean one time during a lecture, she "+editText6+" and then proceeded to "+editText7+" for the remainder"
                + "of the period. Everyone in the room sat there quietly until the bell rang. But the next day," +
                "something "+editText8+" happened. Mrs. Denna was just, different! She pulled up the notes for our unit, "+editText9
                +", and started going over it with a completely "+editText10+" voice. Are you "+editText11+"? "+editText12+" asked." ;

        TextView str = (TextView) findViewById(R.id.story);
        str.setText(story);
    }
}
