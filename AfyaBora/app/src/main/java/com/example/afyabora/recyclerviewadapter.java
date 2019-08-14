package com.example.afyabora;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recyclerviewadapter extends RecyclerView.Adapter<recyclerviewadapter.RecordsViewHolder> {
    private Context mContext;
    private Cursor mCursor;
    public recyclerviewadapter(Context context,Cursor cursor){
mContext=context;
mCursor=cursor;
    }

    @NonNull
    @Override
    public RecordsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(mContext);
        View view=inflater.inflate(R.layout.records,parent,false);
        RecordsViewHolder recordsViewHolder=new RecordsViewHolder(view);
        return recordsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecordsViewHolder holder, int position) {
        if (!mCursor.moveToPosition(position)) {
            return;
        }
        String jina=mCursor.getString(mCursor.getColumnIndex(RecordsHelper.Recordsentry.COLUMN_PATIENT_NAME));
        String rika=mCursor.getString(mCursor.getColumnIndex(RecordsHelper.Recordsentry.COLUMN_PA_AGE_AT_FIRST_OCCURENCE));
        String currentrika=mCursor.getString(mCursor.getColumnIndex(RecordsHelper.Recordsentry.COLUMN_CURRENT_AGE));
        String shida=mCursor.getString(mCursor.getColumnIndex(RecordsHelper.Recordsentry.COLUMN_AILMENT));
        String homepro=mCursor.getString(mCursor.getColumnIndex(RecordsHelper.Recordsentry.COLUMN_HEREDITARY_AILMENT));
        String dates=mCursor.getString(mCursor.getColumnIndex(RecordsHelper.Recordsentry.COLUMN_DATE_OF_OCCURENCE));
        String meds=mCursor.getString(mCursor.getColumnIndex(RecordsHelper.Recordsentry.COLUMN_MEDICATION_TAKEN));

        holder.pname.setText(jina);
        holder.pname.setText(rika);
        holder.pname.setText(currentrika);
        holder.pname.setText(shida);
        holder.pname.setText(homepro);
        holder.pname.setText(dates);
        holder.pname.setText(meds);
    }

    @Override
    public int getItemCount() {
        return mCursor.getCount();
    }
public void SwapCursor(Cursor newCursor){
        if(mCursor !=null){
            mCursor.close();
        }
        mCursor=newCursor;
        if (newCursor !=null){
            notifyDataSetChanged();
        }
}

    public class RecordsViewHolder extends RecyclerView.ViewHolder{
public TextView pname;
public TextView age;
public TextView sage;
public TextView ppro;
public TextView hpro;
public TextView dofoc;
public TextView drug;
        public RecordsViewHolder(@NonNull View itemView) {
            super(itemView);
            pname=itemView.findViewById(R.id.textView6);
            age=itemView.findViewById(R.id.textView7);
            sage=itemView.findViewById(R.id.textView8);
            ppro=itemView.findViewById(R.id.textView9);
            hpro=itemView.findViewById(R.id.textView10);
            dofoc=itemView.findViewById(R.id.textView11);
            drug=itemView.findViewById(R.id.textView12);

        }
    }
}
