package com.example.mroze.minerise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplatMessageActivity extends AppCompatActivity {
    //public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displat_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        // Intent intent2 = getIntent();
        String message = intent.getStringExtra(DeclareActivity.EXTRA_MESSAGE);
        String message2 = intent.getStringExtra(DeclareActivity.EXTRA_MESSAGE2);
        // Capture the layout's TextView and set the string as its text
        String message3 = intent.getStringExtra(DeclareActivity.EXTRA_MESSAGE3);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);
        TextView textView4 = findViewById(R.id.textView4);
        textView2.setText(message);
        textView3.setText(message2);
        textView4.setText(message3);
    }
}