package com.example.madlibsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FilledStory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filled_story);

        Intent intent = getIntent();
        String editText = intent.getStringExtra("box");
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


        String special = "";
        String vowels = "aeiou";
        if (vowels.indexOf(Character.toLowerCase(editText.charAt(0))) != -1) {
            special = "an";
        }
        else
            special = "a";

        SpannableStringBuilder builder = new SpannableStringBuilder();


        String black = "The Mobile App Development class is "+special+" ";
        SpannableString blackSpannable= new SpannableString(black);
        blackSpannable.setSpan(new ForegroundColorSpan(Color.BLACK), 0, black.length(), 0);
        builder.append(blackSpannable);

        String blue = editText;
        SpannableString blueSpannable = new SpannableString(blue);
        blueSpannable.setSpan(new ForegroundColorSpan(Color.BLUE), 0, blue.length(), 0);
        builder.append(blueSpannable);

        String black2 = " place, to say the least. The classmates in period 5, like ";
        SpannableString blackSpannable2= new SpannableString(black2);
        blackSpannable2.setSpan(new ForegroundColorSpan(Color.BLACK), 0, black2.length(), 0);
        builder.append(blackSpannable2);

        String blue2 = editText2;
        SpannableString blueSpannable2 = new SpannableString(blue2);
        blueSpannable2.setSpan(new ForegroundColorSpan(Color.BLUE), 0, blue2.length(), 0);
        builder.append(blueSpannable2);

        String black3 = " and ";
        SpannableString blackSpannable3= new SpannableString(black3);
        blackSpannable3.setSpan(new ForegroundColorSpan(Color.BLACK), 0, black3.length(), 0);
        builder.append(blackSpannable3);

        String blue3 = editText3;
        SpannableString blueSpannable3 = new SpannableString(blue3);
        blueSpannable3.setSpan(new ForegroundColorSpan(Color.BLUE), 0, blue3.length(), 0);
        builder.append(blueSpannable3);

        String black4 = " most of the time ";
        SpannableString blackSpannable4= new SpannableString(black4);
        blackSpannable4.setSpan(new ForegroundColorSpan(Color.BLACK), 0, black4.length(), 0);
        builder.append(blackSpannable4);

        String blue4 = editText4;
        SpannableString blueSpannable4 = new SpannableString(blue4);
        blueSpannable4.setSpan(new ForegroundColorSpan(Color.BLUE), 0, blue4.length(), 0);
        builder.append(blueSpannable4);

        String black5 = " in class instead of working on their code. But what makes M448 really ";
        SpannableString blackSpannable5= new SpannableString(black5);
        blackSpannable5.setSpan(new ForegroundColorSpan(Color.BLACK), 0, black5.length(), 0);
        builder.append(blackSpannable5);

        String blue5 = editText;
        SpannableString blueSpannable5 = new SpannableString(blue5);
        blueSpannable5.setSpan(new ForegroundColorSpan(Color.BLUE), 0, blue5.length(), 0);
        builder.append(blueSpannable5);

        String black6 = " is the ";
        SpannableString blackSpannable6= new SpannableString(black6);
        blackSpannable6.setSpan(new ForegroundColorSpan(Color.BLACK), 0, black6.length(), 0);
        builder.append(blackSpannable6);

        String blue6 = editText5;
        SpannableString blueSpannable6 = new SpannableString(blue6);
        blueSpannable6.setSpan(new ForegroundColorSpan(Color.BLUE), 0, blue6.length(), 0);
        builder.append(blueSpannable6);

        String black7 = " teacher, Mrs. Denna. One time during a lecture, Mrs. Denna shouted, ";
        SpannableString blackSpannable7= new SpannableString(black7);
        blackSpannable7.setSpan(new ForegroundColorSpan(Color.BLACK), 0, black7.length(), 0);
        builder.append(blackSpannable7);

        String blue7 = editText6.toUpperCase();
        SpannableString blueSpannable7 = new SpannableString(blue7);
        blueSpannable7.setSpan(new ForegroundColorSpan(Color.BLUE), 0, blue7.length(), 0);
        builder.append(blueSpannable7);

        String black8 = "! And then proceeded to  ";
        SpannableString blackSpannable8= new SpannableString(black8);
        blackSpannable8.setSpan(new ForegroundColorSpan(Color.BLACK), 0, black8.length(), 0);
        builder.append(blackSpannable8);

        String blue8 = editText7;
        SpannableString blueSpannable8 = new SpannableString(blue8);
        blueSpannable8.setSpan(new ForegroundColorSpan(Color.BLUE), 0, blue8.length(), 0);
        builder.append(blueSpannable8);

        String black9 = " for the remainder of the period. Everyone in the room sat there quietly until the bell rang. But the next day, something ";
        SpannableString blackSpannable9= new SpannableString(black9);
        blackSpannable9.setSpan(new ForegroundColorSpan(Color.BLACK), 0, black9.length(), 0);
        builder.append(blackSpannable9);

        String blue9 = editText8;
        SpannableString blueSpannable9 = new SpannableString(blue9);
        blueSpannable9.setSpan(new ForegroundColorSpan(Color.BLUE), 0, blue9.length(), 0);
        builder.append(blueSpannable9);

        String black10 = " happened. Mrs. Denna was just, different! She pulled up the notes for our unit,  ";
        SpannableString blackSpannable10= new SpannableString(black10);
        blackSpannable10.setSpan(new ForegroundColorSpan(Color.BLACK), 0, black10.length(), 0);
        builder.append(blackSpannable10);

        String blue10 = editText9;
        SpannableString blueSpannable10 = new SpannableString(blue10);
        blueSpannable10.setSpan(new ForegroundColorSpan(Color.BLUE), 0, blue10.length(), 0);
        builder.append(blueSpannable10);

        String black11 = ", and started going over it with a completely ";
        SpannableString blackSpannable11= new SpannableString(black11);
        blackSpannable11.setSpan(new ForegroundColorSpan(Color.BLACK), 0, black11.length(), 0);
        builder.append(blackSpannable11);

        String blue11 = editText10;
        SpannableString blueSpannable11 = new SpannableString(blue11);
        blueSpannable11.setSpan(new ForegroundColorSpan(Color.BLUE), 0, blue11.length(), 0);
        builder.append(blueSpannable11);

        String black12 = " voice. Are you ";
        SpannableString blackSpannable12= new SpannableString(black12);
        blackSpannable12.setSpan(new ForegroundColorSpan(Color.BLACK), 0, black12.length(), 0);
        builder.append(blackSpannable12);

        String blue12 = editText11;
        SpannableString blueSpannable12 = new SpannableString(blue12);
        blueSpannable12.setSpan(new ForegroundColorSpan(Color.BLUE), 0, blue12.length(), 0);
        builder.append(blueSpannable12);

        String black13 = "? ";
        SpannableString blackSpannable13= new SpannableString(black13);
        blackSpannable13.setSpan(new ForegroundColorSpan(Color.BLACK), 0, black13.length(), 0);
        builder.append(blackSpannable13);

        String blue13 = editText12;
        SpannableString blueSpannable13 = new SpannableString(blue13);
        blueSpannable13.setSpan(new ForegroundColorSpan(Color.BLUE), 0, blue13.length(), 0);
        builder.append(blueSpannable13);

        String black14 = " asked.";
        SpannableString blackSpannable14= new SpannableString(black14);
        blackSpannable14.setSpan(new ForegroundColorSpan(Color.BLACK), 0, black14.length(), 0);
        builder.append(blackSpannable14);


        TextView str = (TextView) findViewById(R.id.story);
        str.setText(builder, TextView.BufferType.SPANNABLE);
    }

    public void shareInfo(View v){
        //getting a reference to my edit text fields
        TextView story = (TextView) findViewById(R.id.story);

        //extracting the text from those edit text fields
        String strStory = story.getText().toString();


        //These three lines can send the image to any app that sends messages
        Intent intent2 = new Intent(Intent.ACTION_SEND);
        intent2.setType("text/plain");
        intent2.putExtra(Intent.EXTRA_TEXT, strStory);
        String chooserTitle = getString(R.string.chooser);
        Intent chosenIntent = Intent.createChooser(intent2, chooserTitle);
        startActivity(chosenIntent);



    }
}
