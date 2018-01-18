package com.example.mroze.minerise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtLaunchActivity;
    private Button mBtLaunchActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtLaunchActivity = (Button) findViewById(R.id.mine_button);

        mBtLaunchActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchActivity();
            }
        });

        mBtLaunchActivity2 = (Button) findViewById(R.id.explore_button);

        mBtLaunchActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchActivity2();
            }
        });
    }

    private void launchActivity() {

        Intent intent = new Intent(this, MineMenu.class);
        startActivity(intent);
    }

    private void launchActivity2() {

        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
}

//Gauthier
//Marco
// MM2