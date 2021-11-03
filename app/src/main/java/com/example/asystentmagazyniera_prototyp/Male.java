package com.example.asystentmagazyniera_prototyp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Male extends AppCompatActivity implements View.OnClickListener {

    private CardView alejka_213,alejka_214,alejka_215,alejka_216,alejka_217,alejka_218,
            alejka_219,alejka_220,alejka_221,alejka_222;
    TextView TextNum,TextNum2,TextNum3,TextNum4,TextNum5,TextNum6,TextNum7,TextNum8,TextNum9,TextNum10;
    int lastScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male);

        TextNum = (TextView) findViewById(R.id.TextNum);
        SharedPreferences preferences = getSharedPreferences("PREFS",0);
        lastScore = preferences.getInt("lastScore",0);
        TextNum.setText("Wolne : " + lastScore + " / 33");

        TextNum2 = (TextView) findViewById(R.id.TextNum2);
        SharedPreferences preferences2 = getSharedPreferences("PREFS2",0);
        lastScore = preferences2.getInt("lastScore2",0);
        TextNum2.setText("Wolne : " + lastScore + " / 33");

        TextNum3 = (TextView) findViewById(R.id.TextNum3);
        SharedPreferences preferences3 = getSharedPreferences("PREFS3",0);
        lastScore = preferences3.getInt("lastScore3",0);
        TextNum3.setText("Wolne : " + lastScore + " / 33");

        TextNum4 = (TextView) findViewById(R.id.TextNum4);
        SharedPreferences preferences4 = getSharedPreferences("PREFS4",0);
        lastScore = preferences4.getInt("lastScore4",0);
        TextNum4.setText("Wolne : " + lastScore + " / 33");

        TextNum5 = (TextView) findViewById(R.id.TextNum5);
        SharedPreferences preferences5 = getSharedPreferences("PREFS5",0);
        lastScore = preferences5.getInt("lastScore5",0);
        TextNum5.setText("Wolne : " + lastScore + " / 33");

        TextNum6 = (TextView) findViewById(R.id.TextNum6);
        SharedPreferences preferences6 = getSharedPreferences("PREFS6",0);
        lastScore = preferences6.getInt("lastScore6",0);
        TextNum6.setText("Wolne : " + lastScore + " / 33");

        TextNum7 = (TextView) findViewById(R.id.TextNum7);
        SharedPreferences preferences7 = getSharedPreferences("PREFS7",0);
        lastScore = preferences7.getInt("lastScore7",0);
        TextNum7.setText("Wolne : " + lastScore + " / 33");

        TextNum8 = (TextView) findViewById(R.id.TextNum8);
        SharedPreferences preferences8 = getSharedPreferences("PREFS8",0);
        lastScore = preferences8.getInt("lastScore8",0);
        TextNum8.setText("Wolne : " + lastScore + " / 33");

        TextNum9 = (TextView) findViewById(R.id.TextNum9);
        SharedPreferences preferences9 = getSharedPreferences("PREFS9",0);
        lastScore = preferences9.getInt("lastScore9",0);
        TextNum9.setText("Wolne : " + lastScore + " / 33");

        TextNum10 = (TextView) findViewById(R.id.TextNum10);
        SharedPreferences preferences10 = getSharedPreferences("PREFS10",0);
        lastScore = preferences10.getInt("lastScore10",0);
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
            case R.id.alejka_213 : i = new Intent(this,regal213.class);startActivity(i); break;
            case R.id.alejka_214 : i = new Intent(this,regal214.class);startActivity(i); break;
            case R.id.alejka_215 : i = new Intent(this,regal215.class);startActivity(i); break;
            case R.id.alejka_216 : i = new Intent(this,regal216.class);startActivity(i); break;
            case R.id.alejka_217 : i = new Intent(this,regal217.class);startActivity(i); break;
            case R.id.alejka_218 : i = new Intent(this,regal218.class);startActivity(i); break;
            case R.id.alejka_219 : i = new Intent(this,regal219.class);startActivity(i); break;
            case R.id.alejka_220 : i = new Intent(this,regal220.class);startActivity(i); break;
            case R.id.alejka_221 : i = new Intent(this,regal221.class);startActivity(i); break;
            case R.id.alejka_222 : i = new Intent(this,regal222.class);startActivity(i); break;
            default:break;
        }
    }
}

