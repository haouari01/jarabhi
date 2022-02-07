package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public  static int var=0;
    ArrayList<type> s;
    ArrayListAd ar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        s = new ArrayList<>();
        setContentView(R.layout.activity_main);
        s.add(new type("yassin","hhhhhh"));
     //   s.add(new type("yassin1","hhhhhh"));
       // s.add(new type("yassin2","hhhhhh"));
ar = new ArrayListAd(getApplicationContext(),s,var);
        s.add(new type("yassin4","hhhhhh"));
        s.add(new type("yassin6","hhhhhh"));
     //   ar = new ArrayListAd(getApplicationContext(),s,var);
      //  ar = new ArrayListAd(getApplicationContext(),s,var);
     //   ar = new ArrayListAd(getApplicationContext(),s,var);
        ListView l = findViewById(R.id.ListView);
        l.setAdapter(ar);
        int ss =var;
     Log.d("vari", String.valueOf(ss));
    }

    public void clickme(View view) {

        ar.notifyDataSetChanged();
    }
}