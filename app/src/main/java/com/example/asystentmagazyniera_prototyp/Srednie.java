package com.example.asystentmagazyniera_prototyp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Srednie extends AppCompatActivity implements View.OnClickListener {

    private CardView alejka_213,alejka_214,alejka_215,alejka_216,alejka_217,alejka_218,
            alejka_219,alejka_220,alejka_221,alejka_222;
    TextView TextNum,TextNum2,TextNum3,TextNum4,TextNum5,TextNum6,TextNum7,TextNum8,TextNum9,TextNum10;
    int lastScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srednie);

        TextNum = (TextView) findViewById(R.id.TextNum);
        SharedPreferences preferences11 = getSharedPreferences("PREFS11",0);
        lastScore = preferences11.getInt("lastScore11",0);
        TextNum.setText("Wolne : " + lastScore + " / 33");

        TextNum2 = (TextView) findViewById(R.id.TextNum2);
        SharedPreferences preferences12 = getSharedPreferences("PREFS12",0);
        lastScore = preferences12.getInt("lastScore12",0);
        TextNum2.setText("Wolne : " + lastScore + " / 33");

        TextNum3 = (TextView) findViewById(R.id.TextNum3);
        SharedPreferences preferences13 = getSharedPreferences("PREFS13",0);
        lastScore = preferences13.getInt("lastScore13",0);
        TextNum3.setText("Wolne : " + lastScore + " / 33");

        TextNum4 = (TextView) findViewById(R.id.TextNum4);
        SharedPreferences preferences14 = getSharedPreferences("PREFS14",0);
        lastScore = preferences14.getInt("lastScore14",0);
        TextNum4.setText("Wolne : " + lastScore + " / 33");

        TextNum5 = (TextView) findViewById(R.id.TextNum5);
        SharedPreferences preferences15 = getSharedPreferences("PREFS15",0);
        lastScore = preferences15.getInt("lastScore15",0);
        TextNum5.setText("Wolne : " + lastScore + " / 33");

        TextNum6 = (TextView) findViewById(R.id.TextNum6);
        SharedPreferences preferences16 = getSharedPreferences("PREFS16",0);
        lastScore = preferences16.getInt("lastScore16",0);
        TextNum6.setText("Wolne : " + lastScore + " / 33");

        TextNum7 = (TextView) findViewById(R.id.TextNum7);
        SharedPreferences preferences17 = getSharedPreferences("PREFS17",0);
        lastScore = preferences17.getInt("lastScore17",0);
        TextNum7.setText("Wolne : " + lastScore + " / 33");

        TextNum8 = (TextView) findViewById(R.id.TextNum8);
        SharedPreferences preferences18 = getSharedPreferences("PREFS18",0);
        lastScore = preferences18.getInt("lastScore18",0);
        TextNum8.setText("Wolne : " + lastScore + " / 33");

        TextNum9 = (TextView) findViewById(R.id.TextNum9);
        SharedPreferences preferences19 = getSharedPreferences("PREFS19",0);
        lastScore = preferences19.getInt("lastScore19",0);
        TextNum9.setText("Wolne : " + lastScore + " / 33");

        TextNum10 = (TextView) findViewById(R.id.TextNum10);
        SharedPreferences preferences20 = getSharedPreferences("PREFS20",0);
        lastScore = preferences20.getInt("lastScore20",0);
        TextNum10.setText("Wolne : " + lastScore + " / 33");

        alejka_213 = (CardView) findViewById(R.id.alejka_213);
        alejka_214 = (CardView) findViewById(R.id.alejka_214);
        alejka_215 = (CardView) findViewById(R.id.alejka_215);
        alejka_216 = (CardView) findViewById(R.id.alejka_216);
        alejka_217 = (CardView) findViewById(R.id.alejka_217);
        alejka_218 = (CardView) findViewById(R.id.alejka_218);
        alejka_219 = (CardView) findViewById(R.id.alejka_219);
        alejka_220 = (CardView) findViewById(R.id.alejka_220);
        alejka_221 = (CardView) findViewById(R.id.alejka_221);
        alejka_222 = (CardView) findViewById(R.id.alejka_222);

        alejka_213.setOnClickListener(this);
        alejka_214.setOnClickListener(this);
        alejka_215.setOnClickListener(this);
        alejka_216.setOnClickListener(this);
        alejka_217.setOnClickListener(this);
        alejka_218.setOnClickListener(this);
        alejka_219.setOnClickListener(this);
        alejka_220.setOnClickListener(this);
        alejka_221.setOnClickListener(this);
        alejka_222.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.alejka_213 : i = new Intent(this,sregal213.class);startActivity(i); break;
            case R.id.alejka_214 : i = new Intent(this,sregal214.class);startActivity(i); break;
            case R.id.alejka_215 : i = new Intent(this,sregal215.class);startActivity(i); break;
            case R.id.alejka_216 : i = new Intent(this,sregal216.class);startActivity(i); break;
            case R.id.alejka_217 : i = new Intent(this,sregal217.class);startActivity(i); break;
            case R.id.alejka_218 : i = new Intent(this,sregal218.class);startActivity(i); break;
            case R.id.alejka_219 : i = new Intent(this,sregal219.class);startActivity(i); break;
            case R.id.alejka_220 : i = new Intent(this,sregal220.class);startActivity(i); break;
            case R.id.alejka_221 : i = new Intent(this,sregal221.class);startActivity(i); break;
            case R.id.alejka_222 : i = new Intent(this,sregal222.class);startActivity(i); break;
            default:break;
        }

    }
}
