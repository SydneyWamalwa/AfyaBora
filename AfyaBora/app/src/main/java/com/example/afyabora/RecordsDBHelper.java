package com.example.afyabora;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.afyabora.RecordsHelper.*;
public class RecordsDBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="Medicalhistory.db";
    public static final int DATABASE_VERSION=1;
    public RecordsDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
    final String SQL_CREATE_medhistoryy_TABLE="CREATE TABLE " +
            Recordsentry.TABLENAME +"(" +
            Recordsentry.COLUMN_PATIENT_NAME +"TEXT NOT NULL,"+
            Recordsentry.COLUMN_DATE_OF_OCCURENCE +"TEXT NOT NULL,"+
            Recordsentry.COLUMN_PA_AGE_AT_FIRST_OCCURENCE +"TEXT NOT NULL,"+
            Recordsentry.COLUMN_CURRENT_AGE  +"TEXT NOT NULL,"+
            Recordsentry.COLUMN_AILMENT +"TEXT NOT NULL,"+
            Recordsentry.COLUMN_HEREDITARY_AILMENT+"TEXT ,"+
            Recordsentry.COLUMN_MEDICATION_TAKEN+"TEXT NOT NULL"+
            ")";
    sqLiteDatabase.execSQL(SQL_CREATE_medhistoryy_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(" DROP TABLE IF EXISTS "+Recordsentry.TABLENAME);
        onCreate(sqLiteDatabase);
    }
}
