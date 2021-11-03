package com.example.asystentmagazyniera_prototyp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Duze extends AppCompatActivity implements View.OnClickListener {

    private CardView alejka_213,alejka_214,alejka_215,alejka_216,alejka_217,alejka_218,
            alejka_219,alejka_220,alejka_221,alejka_222;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duze);

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
            case R.id.alejka_213 : i = new Intent(this,sregal213d.class);startActivity(i); break;
            case R.id.alejka_214 : i = new Intent(this,sregal214d.class);startActivity(i); break;
            case R.id.alejka_215 : i = new Intent(this,sregal215d.class);startActivity(i); break;
            case R.id.alejka_216 : i = new Intent(this,sregal216d.class);startActivity(i); break;
            case R.id.alejka_217 : i = new Intent(this,sregal217d.class);startActivity(i); break;
            case R.id.alejka_218 : i = new Intent(this,sregal218d.class);startActivity(i); break;
            case R.id.alejka_219 : i = new Intent(this,sregal219d.class);startActivity(i); break;
            case R.id.alejka_220 : i = new Intent(this,sregal220d.class);startActivity(i); break;
            case R.id.alejka_221 : i = new Intent(this,sregal221d.class);startActivity(i); break;
            case R.id.alejka_222 : i = new Intent(this,sregal222d.class);startActivity(i); break;
            default:break;
        }

    }
}
