package com.example.anees.finaltestv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Spinner qh;

    Spinner mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Second Spinner
        qh = findViewById(R.id.spinner1);

        String[] types = new String[]{"Quiz", "History"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, types);

        qh.setAdapter(adapter);

        //First Spinner
        mode = findViewById(R.id.spinner2);

        String[] modes = new String[]{"Competitive", "Training"};

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, modes);

        mode.setAdapter(adapter1);

        //Button
        Button next = findViewById(R.id.button2);

        next.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if(qh.getSelectedItem().toString().equals("Quiz") && mode.getSelectedItem().toString().equals("Competitive")) {

            Intent intent = new Intent(MainActivity.this, Placeholder1.class);
            startActivity(intent);

        }else if(qh.getSelectedItem().toString().equals("Quiz") && mode.getSelectedItem().toString().equals("Training")){

            Intent intent = new Intent(MainActivity.this, Placeholder2.class);
            startActivity(intent);

        }else if(qh.getSelectedItem().toString().equals("History") && mode.getSelectedItem().toString().equals("Competitive")){

            Intent intent = new Intent(MainActivity.this, Placeholder3.class);
            startActivity(intent);

        }else if(qh.getSelectedItem().toString().equals("History") && mode.getSelectedItem().toString().equals("Training")){

            Intent intent = new Intent(MainActivity.this, Placeholder4.class);
            startActivity(intent);
        }
    }
}
