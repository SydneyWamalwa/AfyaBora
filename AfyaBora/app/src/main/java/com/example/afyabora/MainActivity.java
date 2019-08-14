package com.example.afyabora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView histo;
    ImageView dossee;
    ImageView Aidd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        histo=(ImageView)findViewById(R.id.medhis);
        dossee=(ImageView)findViewById(R.id.remind);
        Aidd=(ImageView)findViewById(R.id.aid);

        histo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MedHistory.class));
            }
        });
        dossee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Reminder_Activity.class));
            }
        });
        Aidd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,First_Aid_Activity.class));
            }
        });
    }
}
