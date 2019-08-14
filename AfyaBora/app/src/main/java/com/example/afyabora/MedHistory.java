package com.example.afyabora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MedHistory extends AppCompatActivity {
ImageView afolder;
ImageView vfolder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med_history);
    afolder=(ImageView)findViewById(R.id.add);
    vfolder=(ImageView)findViewById(R.id.see);

    afolder.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(MedHistory.this,View_Medical_Records.class));
        }
    });
    vfolder.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(MedHistory.this,Add_Records.class));
        }
    });
    }
}
