package com.example.madlibsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText editText = (EditText) findViewById(R.id.editText);
    EditText editText2 = (EditText) findViewById(R.id.editText2);
    EditText editText3 = (EditText) findViewById(R.id.editText3);
    EditText editText4 = (EditText) findViewById(R.id.editText4);
    EditText editText5 = (EditText) findViewById(R.id.editText5);
    EditText editText6 = (EditText) findViewById(R.id.editText6);
    EditText editText7 = (EditText) findViewById(R.id.editText7);
    EditText editText8 = (EditText) findViewById(R.id.editText8);
    EditText editText9 = (EditText) findViewById(R.id.editText9);
    EditText editText10 = (EditText) findViewById(R.id.editText10);
    EditText editText11 = (EditText) findViewById(R.id.editText11);
    EditText editText12 = (EditText) findViewById(R.id.editText12);


    String editTextStr = editText.getText().toString();
    String editTextStr2 = editText2.getText().toString();
    String editTextStr3 = editText3.getText().toString();
    String editTextStr4 = editText4.getText().toString();
    String editTextStr5 = editText5.getText().toString();
    String editTextStr6 = editText6.getText().toString();
    String editTextStr7 = editText7.getText().toString();
    String editTextStr8 = editText8.getText().toString();
    String editTextStr9 = editText9.getText().toString();
    String editTextStr10 = editText10.getText().toString();
    String editTextStr11 = editText11.getText().toString();
    String editTextStr12 = editText12.getText().toString();

    public void fillInStory(View v){


        //Creating the intent object so I can send data
        Intent intent = new Intent(this, FilledStory.class);

        //putting data from the edit text fields into intent to send to other activity
        intent.putExtra("edit_text", editTextStr);
        intent.putExtra(FilledStory.EDIT_TEXT2, editTextStr2);
        intent.putExtra(FilledStory.EDIT_TEXT3, editTextStr3);
        intent.putExtra(FilledStory.EDIT_TEXT4, editTextStr4);
        intent.putExtra(FilledStory.EDIT_TEXT5, editTextStr5);
        intent.putExtra(FilledStory.EDIT_TEXT6, editTextStr6);
        intent.putExtra(FilledStory.EDIT_TEXT7, editTextStr7);
        intent.putExtra(FilledStory.EDIT_TEXT8, editTextStr8);
        intent.putExtra(FilledStory.EDIT_TEXT9, editTextStr9);
        intent.putExtra(FilledStory.EDIT_TEXT10, editTextStr10);
        intent.putExtra(FilledStory.EDIT_TEXT11, editTextStr11);
        intent.putExtra(FilledStory.EDIT_TEXT12, editTextStr12);

        //loads the next activity
        startActivity(intent);
    }

    public void autoFill(View v){

    }
}
