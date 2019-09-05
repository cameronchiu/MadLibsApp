package com.example.madlibsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FilledStory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filled_story);

        Intent intent = getIntent();
        String editText = intent.getStringExtra("box1");
        String editText2 = intent.getStringExtra("box2");
        String editText3 = intent.getStringExtra("box3");
        String editText4 = intent.getStringExtra("box4");
        String editText5 = intent.getStringExtra("box5");
        String editText6 = intent.getStringExtra("box6");
        String editText7 = intent.getStringExtra("box7");
        String editText8 = intent.getStringExtra("box8");
        String editText9 = intent.getStringExtra("box9");
        String editText10 = intent.getStringExtra("box10");
        String editText11 = intent.getStringExtra("box11");
        String editText12 = intent.getStringExtra("box12");

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
