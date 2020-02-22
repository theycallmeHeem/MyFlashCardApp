package com.example.heemflashcardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.flashCardQuestion).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashCardQuestion).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashCardAnswer).setVisibility(View.VISIBLE);
            }
        });

        findViewById(R.id.flashCardAnswer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashCardAnswer).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashCardQuestion).setVisibility(View.VISIBLE);
            }
        });
    }
}
