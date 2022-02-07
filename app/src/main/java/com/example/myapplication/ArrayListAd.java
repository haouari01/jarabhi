package com.example.myapplication;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ArrayListAd  extends ArrayAdapter<type> {
    //constructor


    public ArrayListAd(Context context,ArrayList<type>  arraylist,int varr) {
        super(context,0,arraylist);
     //   MainActivity.var=5+varr;
        Log.d("TAG", "ArrayListAd: super");
    }

    //


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View cv = convertView;
        Log.d("TAG", "ArrayListAd: getView");

            cv = LayoutInflater.from(getContext()).inflate(R.layout.clayout,parent,false);
            type t = getItem(position);
            TextView t1 = cv.findViewById(R.id.textView);
            TextView t2 = cv.findViewById(R.id.textView);
            t1.setText(t.fname);
            t2.setText(t.name);

        return cv;

    }

    @Override
    public void notifyDataSetChanged() {
        MainActivity.var=MainActivity.var+100;
        Log.d("TAG", "ArrayListAd: notifyDataSetChanged");
        super.notifyDataSetChanged();
    }
}
