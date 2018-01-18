package com.example.mroze.minerise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class DeclareActivity extends AppCompatActivity {

    ImageView sampleImage,sampleImage2;
    Button show,show2;

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    public static final String  EXTRA_MESSAGE2 ="com.example.myfirstapp.MESSAGE2";
    public static final String EXTRA_MESSAGE3 = "com.example.myfirstapp.MESSAGE3";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_declare);

        sampleImage = (ImageView)findViewById(R.id.tick1);
        show = (Button)findViewById(R.id.location_button);

        sampleImage2 = (ImageView)findViewById(R.id.tick2);
        show2 = (Button)findViewById(R.id.photo_button);

        sampleImage.setVisibility(View.INVISIBLE);
        sampleImage2.setVisibility(View.INVISIBLE);

        show.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                sampleImage.setVisibility(View.VISIBLE);
                show.setVisibility(View.INVISIBLE);

            }
        });

        show2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                sampleImage2.setVisibility(View.VISIBLE);
                show2.setVisibility(View.INVISIBLE);

            }
        });

    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplatMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        EditText editText3 = (EditText) findViewById(R.id.editText3);
        String message = editText.getText().toString();
        String message2 = editText2.getText().toString();
        String message3 = editText3.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_MESSAGE2, message2);
        intent.putExtra(EXTRA_MESSAGE3, message3);
        startActivity(intent);

        //Intent intent2 = new Intent(this, DisplayMessageActivity.class);
        //EditText editText2 = (EditText) findViewById(R.id.editText2);
        //String message2 = editText2.getText().toString();
        // intent.putExtra(EXTRA_MESSAGE2, message2);
        //startActivity(intent);
    }
}