package com.KunaSainath.amazingfacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text_fact);

        String[] facts = Fact.getFacts();

        for(String fact : facts){
            text.append(fact + "\n\n");
        }
    }
}