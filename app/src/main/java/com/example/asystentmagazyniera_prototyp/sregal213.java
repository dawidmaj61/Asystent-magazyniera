package com.example.asystentmagazyniera_prototyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class sregal213 extends AppCompatActivity {

    Switch switch_button,switch_button2,switch_button3,switch_button4,switch_button5,switch_button6,switch_button7,
            switch_button8,switch_button9,switch_button10,switch_button11,switch_button12,switch_button13,switch_button14,
            switch_button15,switch_button16,switch_button17,switch_button18,switch_button19,switch_button20,switch_button21,
            switch_button22,switch_button23,switch_button24, switch_button25,switch_button26,switch_button27,switch_button28,
            switch_button29,switch_button30,switch_button31,switch_button32,switch_button33;
    ImageView imageView,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9,
            imageView10,imageView11,imageView12,imageView13,imageView14,imageView15,imageView16,imageView17, imageView18,
            imageView19,imageView20,imageView21,imageView22,imageView23,imageView24,imageView25,imageView26,imageView27,imageView28,
            imageView29,imageView30,imageView31,imageView32,imageView33;
    SharedPreferences.Editor prefEditor,prefEditor2,prefEditor3,prefEditor4,prefEditor5,prefEditor6,prefEditor7,prefEditor8,
            prefEditor9,prefEditor10,prefEditor11,prefEditor12,prefEditor13,prefEditor14,prefEditor15,prefEditor16,prefEditor17,
            prefEditor18,prefEditor19,prefEditor20,prefEditor21,prefEditor22,prefEditor23,prefEditor24,prefEditor25,
            prefEditor26,prefEditor27,prefEditor28,prefEditor29,prefEditor30,prefEditor31,prefEditor32,prefEditor33;
    SharedPreferences prefs,prefs2,prefs3,prefs4,prefs5,prefs6,prefs7,prefs8,prefs9,prefs10,prefs11,prefs12,prefs13,prefs14,
            prefs15,prefs16,prefs17,prefs18,prefs19,prefs20,prefs21,prefs22,prefs23,prefs24,prefs25,prefs26,prefs27,prefs28,
            prefs29,prefs30,prefs31,prefs32,prefs33;
    TextView showT;
    Button pass;
    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sregal213);

        showT = (TextView) findViewById(R.id.showT);
        showT.setText("Score :" + score);
        pass = (Button) findViewById(R.id.pass);

        switch_button = (Switch) findViewById(R.id.switch_button);
        switch_button2 = (Switch) findViewById(R.id.switch_button2);
        switch_button3 = (Switch) findViewById(R.id.switch_button3);
        switch_button4 = (Switch) findViewById(R.id.switch_button4);
        switch_button5 = (Switch) findViewById(R.id.switch_button5);
        switch_button6 = (Switch) findViewById(R.id.switch_button6);
        switch_button7 = (Switch) findViewById(R.id.switch_button7);
        switch_button8 = (Switch) findViewById(R.id.switch_button8);
        switch_button9 = (Switch) findViewById(R.id.switch_button9);
        switch_button10 = (Switch) findViewById(R.id.switch_button10);
        switch_button11 = (Switch) findViewById(R.id.switch_button11);
        switch_button12 = (Switch) findViewById(R.id.switch_button12);
        switch_button13 = (Switch) findViewById(R.id.switch_button13);
        switch_button14 = (Switch) findViewById(R.id.switch_button14);
        switch_button15 = (Switch) findViewById(R.id.switch_button15);
        switch_button16 = (Switch) findViewById(R.id.switch_button16);
        switch_button17 = (Switch) findViewById(R.id.switch_button17);
        switch_button18 = (Switch) findViewById(R.id.switch_button18);
        switch_button19 = (Switch) findViewById(R.id.switch_button19);
        switch_button20 = (Switch) findViewById(R.id.switch_button20);
        switch_button21 = (Switch) findViewById(R.id.switch_button21);
        switch_button22 = (Switch) findViewById(R.id.switch_button22);
        switch_button23 = (Switch) findViewById(R.id.switch_button23);
        switch_button24 = (Switch) findViewById(R.id.switch_button24);
        switch_button25 = (Switch) findViewById(R.id.switch_button25);
        switch_button26 = (Switch) findViewById(R.id.switch_button26);
        switch_button27 = (Switch) findViewById(R.id.switch_button27);
        switch_button28 = (Switch) findViewById(R.id.switch_button28);
        switch_button29 = (Switch) findViewById(R.id.switch_button29);
        switch_button30 = (Switch) findViewById(R.id.switch_button30);
        switch_button31 = (Switch) findViewById(R.id.switch_button31);
        switch_button32 = (Switch) findViewById(R.id.switch_button32);
        switch_button33 = (Switch) findViewById(R.id.switch_button33);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView7 = (ImageView) findViewById(R.id.imageView7);
        imageView8 = (ImageView) findViewById(R.id.imageView8);
        imageView9 = (ImageView) findViewById(R.id.imageView9);
        imageView10 = (ImageView) findViewById(R.id.imageView10);
        imageView11 = (ImageView) findViewById(R.id.imageView11);
        imageView12 = (ImageView) findViewById(R.id.imageView12);
        imageView13 = (ImageView) findViewById(R.id.imageView13);
        imageView14 = (ImageView) findViewById(R.id.imageView14);
        imageView15 = (ImageView) findViewById(R.id.imageView15);
        imageView16 = (ImageView) findViewById(R.id.imageView16);
        imageView17 = (ImageView) findViewById(R.id.imageView17);
        imageView18 = (ImageView) findViewById(R.id.imageView18);
        imageView19 = (ImageView) findViewById(R.id.imageView19);
        imageView20 = (ImageView) findViewById(R.id.imageView20);
        imageView21 = (ImageView) findViewById(R.id.imageView21);
        imageView22 = (ImageView) findViewById(R.id.imageView22);
        imageView23 = (ImageView) findViewById(R.id.imageView23);
        imageView24 = (ImageView) findViewById(R.id.imageView24);
        imageView25 = (ImageView) findViewById(R.id.imageView25);
        imageView26 = (ImageView) findViewById(R.id.imageView26);
        imageView27 = (ImageView) findViewById(R.id.imageView27);
        imageView28 = (ImageView) findViewById(R.id.imageView28);
        imageView29 = (ImageView) findViewById(R.id.imageView29);
        imageView30 = (ImageView) findViewById(R.id.imageView30);
        imageView31 = (ImageView) findViewById(R.id.imageView31);
        imageView32 = (ImageView) findViewById(R.id.imageView32);
        imageView33 = (ImageView) findViewById(R.id.imageView33);

        prefEditor = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor2 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor3 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor4 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor5 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor6 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor7 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor8 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor9 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor10 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor11 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor12 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor13 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor14 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor15 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor16 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor17 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor18 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor19 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor20 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor21 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor22 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor23 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor24 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor25 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor26 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor27 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor28 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor29 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor30 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor31 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor32 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();
        prefEditor33 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).edit();

        prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs2 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs3 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs4 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs5 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs6 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs7 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs8 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs9 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs10 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs11 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs12 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs13 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs14 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs15 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs16 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs17 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs18 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs19 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs20 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs21 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs22 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs23 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs24 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs25 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs26 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs27 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs28 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs29 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs30 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs31 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs32 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        prefs33 = PreferenceManager.getDefaultSharedPreferences(getBaseContext());

        imageView.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView2.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView3.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView4.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView5.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView6.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView7.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView8.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView9.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView10.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView11.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView12.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView13.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView14.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView15.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView16.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView17.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView18.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView19.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView20.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView21.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView22.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView23.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView24.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView25.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView26.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView27.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView28.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView29.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView30.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView31.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView32.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        imageView33.setImageDrawable(getResources().getDrawable(R.drawable.button_off));

        switch_button.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor.putString("checked34d","yes34d");
                    prefEditor.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor.putString("checked34d","false34d");
                    prefEditor.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button2.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView2.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor2.putString("checked35d","yes35d");
                    prefEditor2.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView2.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor2.putString("checked35d","false35d");
                    prefEditor2.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button3.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView3.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor3.putString("checked36d","yes36d");
                    prefEditor3.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView3.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor3.putString("checked36d","false36d");
                    prefEditor3.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button4.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor4.putString("checked37d","yes37d");
                    prefEditor4.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor4.putString("checked37d","false37d");
                    prefEditor4.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button5.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor5.putString("checked38d","yes38d");
                    prefEditor5.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor5.putString("checked38d","false38d");
                    prefEditor5.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button6.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView6.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor6.putString("checked39d","yes39d");
                    prefEditor6.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView6.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor6.putString("checked39d","false39d");
                    prefEditor6.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button7.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView7.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor7.putString("checked40d","yes40d");
                    prefEditor7.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView7.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor7.putString("checked40d","false40d");
                    prefEditor7.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button8.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView8.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor8.putString("checked41d","yes41d");
                    prefEditor8.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView8.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor8.putString("checked41d","false41d");
                    prefEditor8.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button9.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView9.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor9.putString("checked42d","yes42d");
                    prefEditor9.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView9.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor9.putString("checked42d","false42d");
                    prefEditor9.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button10.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView10.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor10.putString("checked43d","yes43d");
                    prefEditor10.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView10.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor10.putString("checked43d","false43d");
                    prefEditor10.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button11.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView11.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor11.putString("checked44d","yes44d");
                    prefEditor11.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView11.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor11.putString("checked44d","false44d");
                    prefEditor11.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button12.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView12.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor12.putString("checked45d","yes45d");
                    prefEditor12.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView12.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor12.putString("checked45d","false45d");
                    prefEditor12.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button13.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView13.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor13.putString("checked46d","yes46d");
                    prefEditor13.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView13.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor13.putString("checked46d","false46d");
                    prefEditor13.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button14.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView14.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor14.putString("checked47d","yes47d");
                    prefEditor14.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView14.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor14.putString("checked47d","false47d");
                    prefEditor14.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button15.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView15.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor15.putString("checked48d","yes48d");
                    prefEditor15.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView15.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor15.putString("checked48d","false48d");
                    prefEditor15.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button16.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView16.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor16.putString("checked49d","yes49d");
                    prefEditor16.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView16.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor16.putString("checked49d","false49d");
                    prefEditor16.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button17.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView17.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor17.putString("checked50d","yes50d");
                    prefEditor17.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView17.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor17.putString("checked50d","false50d");
                    prefEditor17.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button18.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView18.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor18.putString("checked51d","yes51d");
                    prefEditor18.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView18.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor18.putString("checked51d","false51d");
                    prefEditor18.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button19.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView19.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor19.putString("checked52d","yes52d");
                    prefEditor19.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView19.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor19.putString("checked52d","false52d");
                    prefEditor19.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button20.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView20.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor20.putString("checked53d","yes53d");
                    prefEditor20.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView20.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor20.putString("checked53d","false53d");
                    prefEditor20.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button21.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView21.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor21.putString("checked54d","yes54d");
                    prefEditor21.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView21.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor21.putString("checked54d","false54d");
                    prefEditor21.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button22.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView22.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor22.putString("checked55d","yes55d");
                    prefEditor22.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView22.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor22.putString("checked55d","false55d");
                    prefEditor22.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button23.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView23.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor23.putString("checked56d","yes56d");
                    prefEditor23.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView23.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor23.putString("checked56d","false56d");
                    prefEditor23.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button24.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView24.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor24.putString("checked57d","yes57d");
                    prefEditor24.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView24.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor24.putString("checked57d","false57d");
                    prefEditor24.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button25.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView25.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor25.putString("checked58d","yes58d");
                    prefEditor25.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView25.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor25.putString("checked58d","false58d");
                    prefEditor25.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button26.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView26.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor26.putString("checked59d","yes59d");
                    prefEditor26.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView26.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor26.putString("checked59d","false59d");
                    prefEditor26.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button27.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView27.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor27.putString("checked60d","yes60d");
                    prefEditor27.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView27.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor27.putString("checked60d","false60d");
                    prefEditor27.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button28.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView28.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor28.putString("checked61d","yes61d");
                    prefEditor28.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView28.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor28.putString("checked61d","false61d");
                    prefEditor28.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button29.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView29.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor29.putString("checked62d","yes62d");
                    prefEditor29.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView29.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor29.putString("checked62d","false62d");
                    prefEditor29.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button30.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView30.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor30.putString("checked63d","yes63d");
                    prefEditor30.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView30.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor30.putString("checked63d","false63d");
                    prefEditor30.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button31.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView31.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor31.putString("checked64d","yes64d");
                    prefEditor31.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView31.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor31.putString("checked64d","false64d");
                    prefEditor31.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button32.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView32.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor32.putString("checked65d","yes65d");
                    prefEditor32.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView32.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor32.putString("checked65d","false65d");
                    prefEditor32.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });
        switch_button33.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView33.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal213.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor33.putString("checked66d","yes66d");
                    prefEditor33.apply();
                    score += 1;
                    showT.setText("Score: " + score);
                }else{
                    imageView33.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal213.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor32.putString("checked66d","false66d");
                    prefEditor33.apply();
                    score -= 1;
                    showT.setText("Score: " + score);
                }
            }
        });














        if (prefs.getString("checked34d","no34d").equals("yes34d")){
            switch_button.setChecked(true);
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button.setChecked(false);
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs2.getString("checked35d","no35d").equals("yes35d")){
            switch_button2.setChecked(true);
            imageView2.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button2.setChecked(false);
            imageView2.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs3.getString("checked36d","no36d").equals("yes36d")){
            switch_button3.setChecked(true);
            imageView3.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button3.setChecked(false);
            imageView3.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs4.getString("checked37d","no37d").equals("yes37d")){
            switch_button4.setChecked(true);
            imageView4.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button4.setChecked(false);
            imageView4.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs5.getString("checked38d","no38d").equals("yes38d")){
            switch_button5.setChecked(true);
            imageView5.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button5.setChecked(false);
            imageView5.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs6.getString("checked39d","no39d").equals("yes39d")){
            switch_button6.setChecked(true);
            imageView6.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button6.setChecked(false);
            imageView6.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs7.getString("checked40d","no40d").equals("yes40d")){
            switch_button7.setChecked(true);
            imageView7.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button7.setChecked(false);
            imageView7.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs8.getString("checked41d","no41d").equals("yes41d")){
            switch_button8.setChecked(true);
            imageView8.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button8.setChecked(false);
            imageView8.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs9.getString("checked42d","no42d").equals("yes42d")){
            switch_button9.setChecked(true);
            imageView9.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button9.setChecked(false);
            imageView9.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs10.getString("checked43d","no43d").equals("yes43d")){
            switch_button10.setChecked(true);
            imageView10.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button10.setChecked(false);
            imageView10.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs11.getString("checked44d","no44d").equals("yes44d")){
            switch_button11.setChecked(true);
            imageView11.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button11.setChecked(false);
            imageView11.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs12.getString("checked45d","no45d").equals("yes45d")){
            switch_button12.setChecked(true);
            imageView12.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button12.setChecked(false);
            imageView12.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs13.getString("checked46d","no46d").equals("yes46d")){
            switch_button13.setChecked(true);
            imageView13.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button13.setChecked(false);
            imageView13.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs14.getString("checked47d","no47d").equals("yes47d")){
            switch_button14.setChecked(true);
            imageView14.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button14.setChecked(false);
            imageView14.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs15.getString("checked48d","no48d").equals("yes48d")){
            switch_button15.setChecked(true);
            imageView15.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button15.setChecked(false);
            imageView15.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs16.getString("checked49d","no49d").equals("yes49d")){
            switch_button16.setChecked(true);
            imageView16.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button16.setChecked(false);
            imageView16.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs17.getString("checked50d","no50d").equals("yes50d")){
            switch_button17.setChecked(true);
            imageView17.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button17.setChecked(false);
            imageView17.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs18.getString("checked51d","no51d").equals("yes51d")){
            switch_button18.setChecked(true);
            imageView18.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button18.setChecked(false);
            imageView18.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs19.getString("checked52d","no52d").equals("yes52d")){
            switch_button19.setChecked(true);
            imageView19.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button19.setChecked(false);
            imageView19.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs20.getString("checked53d","no53d").equals("yes53d")){
            switch_button20.setChecked(true);
            imageView20.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button20.setChecked(false);
            imageView20.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs21.getString("checked54d","no54d").equals("yes54d")){
            switch_button21.setChecked(true);
            imageView21.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button21.setChecked(false);
            imageView21.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs22.getString("checked55d","no55d").equals("yes55d")){
            switch_button22.setChecked(true);
            imageView22.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button22.setChecked(false);
            imageView22.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs23.getString("checked56d","no56d").equals("yes56d")){
            switch_button23.setChecked(true);
            imageView23.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button23.setChecked(false);
            imageView23.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs24.getString("checked57d","no57d").equals("yes57d")){
            switch_button24.setChecked(true);
            imageView24.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button24.setChecked(false);
            imageView24.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs25.getString("checked58d","no58d").equals("yes58d")){
            switch_button25.setChecked(true);
            imageView25.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button25.setChecked(false);
            imageView25.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs26.getString("checked59d","no59d").equals("yes59d")){
            switch_button26.setChecked(true);
            imageView26.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button26.setChecked(false);
            imageView26.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs27.getString("checked60d","no60d").equals("yes60d")){
            switch_button27.setChecked(true);
            imageView27.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button27.setChecked(false);
            imageView27.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs28.getString("checked61d","no61d").equals("yes61d")){
            switch_button28.setChecked(true);
            imageView28.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button28.setChecked(false);
            imageView28.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs29.getString("checked62d","no62d").equals("yes62d")){
            switch_button29.setChecked(true);
            imageView29.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button29.setChecked(false);
            imageView29.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs30.getString("checked63d","no63d").equals("yes63d")){
            switch_button30.setChecked(true);
            imageView30.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button30.setChecked(false);
            imageView30.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs31.getString("checked64d","no64d").equals("yes64d")){
            switch_button31.setChecked(true);
            imageView31.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button31.setChecked(false);
            imageView31.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs32.getString("checked65d","no65d").equals("yes65d")){
            switch_button32.setChecked(true);
            imageView32.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button32.setChecked(false);
            imageView32.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs33.getString("checked66d","no66d").equals("yes66d")){
            switch_button33.setChecked(true);
            imageView33.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button33.setChecked(false);
            imageView33.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences11 = getSharedPreferences("PREFS11",0);
                SharedPreferences.Editor editor11 = preferences11.edit();
                editor11.putInt("lastScore11",score);
                editor11.apply();

                Intent intent = new Intent(getApplicationContext(),glowne.class);
                startActivity(intent);
                finish();

            }
        });



    }
}
