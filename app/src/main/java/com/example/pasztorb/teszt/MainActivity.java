package com.example.pasztorb.teszt;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static Button buttonsbm1;
    private static Button buttonsbm2;
    private static Button buttonsbm3;
    private static ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonclick();
    }
       public void buttonclick() {
           buttonsbm1 = (Button) findViewById(R.id.button1);
           buttonsbm2 = (Button) findViewById(R.id.button2);
           buttonsbm3 = (Button) findViewById(R.id.button3);
           iv = (ImageView) findViewById(R.id.imageView);
           buttonsbm1.setOnClickListener(new View.OnClickListener() {
               public void onClick(View v) {
                   iv.setImageResource(R.drawable.nev_alap);
               }
           });
           buttonsbm2.setOnClickListener(new View.OnClickListener() {
               public void onClick(View v) {
                   iv.setImageResource(R.drawable.nev_hatvany);
               }
           });
           buttonsbm3.setOnClickListener(new View.OnClickListener() {
               public void onClick(View v) {
                   iv.setImageResource(R.drawable.nev_geom);
               }
           });
        }
    }

