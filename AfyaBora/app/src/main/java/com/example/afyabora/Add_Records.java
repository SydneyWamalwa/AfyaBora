package com.example.afyabora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class Add_Records extends AppCompatActivity {
private RecyclerView recyclerView;
private recyclerviewadapter recyclerviewadapter;
RecyclerView.LayoutManager layoutManager;
    public SQLiteDatabase database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__records);
        RecordsDBHelper dbHelper=new RecordsDBHelper(this);
        database=dbHelper.getWritableDatabase();

        recyclerView=(RecyclerView)findViewById(R.id.data);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerviewadapter=new recyclerviewadapter(this,getallitems());
        recyclerView.setAdapter(recyclerviewadapter);

    }
    private Cursor getallitems(){

        return database.query(
                RecordsHelper.Recordsentry.TABLENAME,
                null,
                null,
                null,
                null,
                null,
                RecordsHelper.Recordsentry.COLUMN_PATIENT_NAME+"DESC"

        );
    }

    }

