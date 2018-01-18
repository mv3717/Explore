package com.example.mroze.minerise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    private Button mBtLaunchActivity;
    private Button mBtLaunchActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        mBtLaunchActivity = (Button) findViewById(R.id.learn_button);

        mBtLaunchActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchActivity();
            }
        });

        mBtLaunchActivity2 = (Button) findViewById(R.id.declare_button);

        mBtLaunchActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchActivity2();
            }
        });
    }

    private void launchActivity() {

        Intent intent = new Intent(this, LearnActivity.class);
        startActivity(intent);
    }

    private void launchActivity2() {

        Intent intent = new Intent(this, DeclareActivity.class);
        startActivity(intent);
    }
}
