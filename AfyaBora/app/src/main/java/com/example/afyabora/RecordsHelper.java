package com.example.afyabora;

import android.provider.BaseColumns;

public class RecordsHelper {
    private RecordsHelper(){

    }

    public static final class Recordsentry implements BaseColumns{
        public static final String TABLENAME="medhistoryy";
        public static final String COLUMN_PATIENT_NAME="Patients_Name";
        public static final String COLUMN_PA_AGE_AT_FIRST_OCCURENCE="Patient Age At First Occurrence";
        public static final String COLUMN_CURRENT_AGE="Pat Current Age";
        public static final String COLUMN_AILMENT="Ailment";
        public static final String COLUMN_HEREDITARY_AILMENT="Hereditary Ailment";
        public static final String COLUMN_DATE_OF_OCCURENCE="Date of Occurrence";
        public static final String COLUMN_MEDICATION_TAKEN="Medication Taken";
    }
}
