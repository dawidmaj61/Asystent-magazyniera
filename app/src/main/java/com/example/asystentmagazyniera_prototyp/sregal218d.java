package com.example.asystentmagazyniera_prototyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

public class sregal218d extends AppCompatActivity {

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regal214);

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
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor.putString("checked67adf","yes67adf");
                    prefEditor.apply();
                }else{
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor.putString("checked67adf","false67adf");
                    prefEditor.apply();
                }
            }
        });
        switch_button2.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView2.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor2.putString("checked68adf","yes68adf");
                    prefEditor2.apply();
                }else{
                    imageView2.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor2.putString("checked68adf","false68adf");
                    prefEditor2.apply();
                }
            }
        });
        switch_button3.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView3.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor3.putString("checked86adf","yes86adf");
                    prefEditor3.apply();
                }else{
                    imageView3.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor3.putString("checked86adf","false86adf");
                    prefEditor3.apply();
                }
            }
        });
        switch_button4.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor4.putString("checked69adf","yes69adf");
                    prefEditor4.apply();
                }else{
                    imageView4.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor4.putString("checked69adf","false69adf");
                    prefEditor4.apply();
                }
            }
        });
        switch_button5.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor5.putString("checked70adf","yes70adf");
                    prefEditor5.apply();
                }else{
                    imageView5.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor5.putString("checked70adf","false70adf");
                    prefEditor5.apply();
                }
            }
        });
        switch_button6.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView6.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor6.putString("checked71adf","yes71adf");
                    prefEditor6.apply();
                }else{
                    imageView6.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor6.putString("checked71adf","false71adf");
                    prefEditor6.apply();
                }
            }
        });
        switch_button7.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView7.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor7.putString("checked72adf","yes72adf");
                    prefEditor7.apply();
                }else{
                    imageView7.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor7.putString("checked72adf","false72adf");
                    prefEditor7.apply();
                }
            }
        });
        switch_button8.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView8.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor8.putString("checked73adf","yes73adf");
                    prefEditor8.apply();
                }else{
                    imageView8.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor8.putString("checked73adf","false73adf");
                    prefEditor8.apply();
                }
            }
        });
        switch_button9.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView9.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor9.putString("checked74adf","yes74adf");
                    prefEditor9.apply();
                }else{
                    imageView9.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor9.putString("checked74adf","false74adf");
                    prefEditor9.apply();
                }
            }
        });
        switch_button10.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView10.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor10.putString("checked75adf","yes75adf");
                    prefEditor10.apply();
                }else{
                    imageView10.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor10.putString("checked75adf","false75adf");
                    prefEditor10.apply();
                }
            }
        });
        switch_button11.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView11.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor11.putString("checked76adf","yes76adf");
                    prefEditor11.apply();
                }else{
                    imageView11.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor11.putString("checked76adf","false76adf");
                    prefEditor11.apply();
                }
            }
        });
        switch_button12.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView12.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor12.putString("checked77adf","yes77adf");
                    prefEditor12.apply();
                }else{
                    imageView12.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor12.putString("checked77adf","false77adf");
                    prefEditor12.apply();
                }
            }
        });
        switch_button13.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView13.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor13.putString("checked78adf","yes78adf");
                    prefEditor13.apply();
                }else{
                    imageView13.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor13.putString("checked78adf","false78adf");
                    prefEditor13.apply();
                }
            }
        });
        switch_button14.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView14.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor14.putString("checked79adf","yes79adf");
                    prefEditor14.apply();
                }else{
                    imageView14.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor14.putString("checked79adf","false79adf");
                    prefEditor14.apply();
                }
            }
        });
        switch_button15.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView15.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor15.putString("checked80adf","yes80adf");
                    prefEditor15.apply();
                }else{
                    imageView15.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor15.putString("checked80adf","false80adf");
                    prefEditor15.apply();
                }
            }
        });
        switch_button16.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView16.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor16.putString("checked81adf","yes81adf");
                    prefEditor16.apply();
                }else{
                    imageView16.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor16.putString("checked81adf","false81adf");
                    prefEditor16.apply();
                }
            }
        });
        switch_button17.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView17.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor17.putString("checked82adf","yes82adf");
                    prefEditor17.apply();
                }else{
                    imageView17.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor17.putString("checked82adf","false82adf");
                    prefEditor17.apply();
                }
            }
        });
        switch_button18.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView18.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor18.putString("checked83adf","yes83adf");
                    prefEditor18.apply();
                }else{
                    imageView18.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor18.putString("checked83adf","false83adf");
                    prefEditor18.apply();
                }
            }
        });
        switch_button19.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView19.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor19.putString("checked84adf","yes84adf");
                    prefEditor19.apply();
                }else{
                    imageView19.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor19.putString("checked84adf","false84adf");
                    prefEditor19.apply();
                }
            }
        });
        switch_button20.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView20.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor20.putString("checked85adf","yes85adf");
                    prefEditor20.apply();
                }else{
                    imageView20.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor20.putString("checked85adf","false85adf");
                    prefEditor20.apply();
                }
            }
        });
        switch_button21.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView21.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor21.putString("checked87adf","yes87adf");
                    prefEditor21.apply();
                }else{
                    imageView21.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor21.putString("checked87adf","false87adf");
                    prefEditor21.apply();
                }
            }
        });
        switch_button22.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView22.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor22.putString("checked88adf","yes88adf");
                    prefEditor22.apply();
                }else{
                    imageView22.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor22.putString("checked88adf","false88adf");
                    prefEditor22.apply();
                }
            }
        });
        switch_button23.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView23.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor23.putString("checked89adf","yes89adf");
                    prefEditor23.apply();
                }else{
                    imageView23.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor23.putString("checked89adf","false89adf");
                    prefEditor23.apply();
                }
            }
        });
        switch_button24.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView24.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor24.putString("checked90adf","yes90adf");
                    prefEditor24.apply();
                }else{
                    imageView24.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor24.putString("checked90adf","false90adf");
                    prefEditor24.apply();
                }
            }
        });
        switch_button25.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView25.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor25.putString("checked91adf","yes91adf");
                    prefEditor25.apply();
                }else{
                    imageView25.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor25.putString("checked91adf","false91adf");
                    prefEditor25.apply();
                }
            }
        });
        switch_button26.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView26.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor26.putString("checked92adf","yes92adf");
                    prefEditor26.apply();
                }else{
                    imageView26.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor26.putString("checked92adf","false92adf");
                    prefEditor26.apply();
                }
            }
        });
        switch_button27.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView27.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor27.putString("checked93adf","yes93adf");
                    prefEditor27.apply();
                }else{
                    imageView27.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor27.putString("checked93adf","false93adf");
                    prefEditor27.apply();
                }
            }
        });
        switch_button28.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView28.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor28.putString("checked94adf","yes94adf");
                    prefEditor28.apply();
                }else{
                    imageView28.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor28.putString("checked94adf","false94adf");
                    prefEditor28.apply();
                }
            }
        });
        switch_button29.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView29.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor29.putString("checked95adf","yes95adf");
                    prefEditor29.apply();
                }else{
                    imageView29.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor29.putString("checked95adf","false95adf");
                    prefEditor29.apply();
                }
            }
        });
        switch_button30.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView30.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor30.putString("checked96adf","yes96adf");
                    prefEditor30.apply();
                }else{
                    imageView30.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor30.putString("checked96adf","false96adf");
                    prefEditor30.apply();
                }
            }
        });
        switch_button31.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView31.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor31.putString("checked97adf","yes97adf");
                    prefEditor31.apply();
                }else{
                    imageView31.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor31.putString("checked97adf","false97adf");
                    prefEditor31.apply();
                }
            }
        });
        switch_button32.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView32.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor32.putString("checked98adf","yes98adf");
                    prefEditor32.apply();
                }else{
                    imageView32.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor32.putString("checked98adf","false98adf");
                    prefEditor32.apply();
                }
            }
        });
        switch_button33.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    imageView33.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
                    Toast.makeText(sregal218d.this,"Zwolniono",Toast.LENGTH_SHORT).show();
                    prefEditor33.putString("checked99adf","yes99adf");
                    prefEditor33.apply();
                }else{
                    imageView33.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
                    Toast.makeText(sregal218d.this,"Zajęto",Toast.LENGTH_SHORT).show();
                    prefEditor32.putString("checked99adf","false99adf");
                    prefEditor33.apply();
                }
            }
        });














        if (prefs.getString("checked67adf","no67adf").equals("yes67adf")){
            switch_button.setChecked(true);
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button.setChecked(false);
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs2.getString("checked68adf","no68adf").equals("yes68adf")){
            switch_button2.setChecked(true);
            imageView2.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button2.setChecked(false);
            imageView2.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs3.getString("checked86adf","no86adf").equals("yes86adf")){
            switch_button3.setChecked(true);
            imageView3.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button3.setChecked(false);
            imageView3.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs4.getString("checked69adf","no69adf").equals("yes69adf")){
            switch_button4.setChecked(true);
            imageView4.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button4.setChecked(false);
            imageView4.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs5.getString("checked70adf","no70adf").equals("yes70adf")){
            switch_button5.setChecked(true);
            imageView5.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button5.setChecked(false);
            imageView5.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs6.getString("checked83adf","no83adf").equals("yes83adf")){
            switch_button6.setChecked(true);
            imageView6.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button6.setChecked(false);
            imageView6.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs7.getString("checked71adf","no71adf").equals("yes71adf")){
            switch_button7.setChecked(true);
            imageView7.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button7.setChecked(false);
            imageView7.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs8.getString("checked72adf","no72adf").equals("yes72adf")){
            switch_button8.setChecked(true);
            imageView8.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button8.setChecked(false);
            imageView8.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs9.getString("checked73adf","no73adf").equals("yes73adf")){
            switch_button9.setChecked(true);
            imageView9.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button9.setChecked(false);
            imageView9.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs10.getString("checked74adf","no74adf").equals("yes74adf")){
            switch_button10.setChecked(true);
            imageView10.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button10.setChecked(false);
            imageView10.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs11.getString("checked75adf","no75adf").equals("yes75adf")){
            switch_button11.setChecked(true);
            imageView11.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button11.setChecked(false);
            imageView11.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs12.getString("checked76adf","no76adf").equals("yes76adf")){
            switch_button12.setChecked(true);
            imageView12.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button12.setChecked(false);
            imageView12.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs13.getString("checked77adf","no77adf").equals("yes77adf")){
            switch_button13.setChecked(true);
            imageView13.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button13.setChecked(false);
            imageView13.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs14.getString("checked78adf","no78adf").equals("yes78adf")){
            switch_button14.setChecked(true);
            imageView14.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button14.setChecked(false);
            imageView14.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs15.getString("checked79adf","no79adf").equals("yes79adf")){
            switch_button15.setChecked(true);
            imageView15.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button15.setChecked(false);
            imageView15.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs16.getString("checked80adf","no80adf").equals("yes80adf")){
            switch_button16.setChecked(true);
            imageView16.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button16.setChecked(false);
            imageView16.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs17.getString("checked81adf","no81adf").equals("yes81adf")){
            switch_button17.setChecked(true);
            imageView17.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button17.setChecked(false);
            imageView17.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs18.getString("checked82adf","no82adf").equals("yes82adf")){
            switch_button18.setChecked(true);
            imageView18.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button18.setChecked(false);
            imageView18.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs19.getString("checked84adf","no84adf").equals("yes84adf")){
            switch_button19.setChecked(true);
            imageView19.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button19.setChecked(false);
            imageView19.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs20.getString("checked85adf","no85adf").equals("yes85adf")){
            switch_button20.setChecked(true);
            imageView20.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button20.setChecked(false);
            imageView20.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs21.getString("checked87adf","no87adf").equals("yes87adf")){
            switch_button21.setChecked(true);
            imageView21.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button21.setChecked(false);
            imageView21.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs22.getString("checked88adf","no88adf").equals("yes88adf")){
            switch_button22.setChecked(true);
            imageView22.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button22.setChecked(false);
            imageView22.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs23.getString("checked89adf","no89adf").equals("yes89adf")){
            switch_button23.setChecked(true);
            imageView23.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button23.setChecked(false);
            imageView23.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs24.getString("checked90adf","no90adf").equals("yes90adf")){
            switch_button24.setChecked(true);
            imageView24.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button24.setChecked(false);
            imageView24.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs25.getString("checked91adf","no91adf").equals("yes91adf")){
            switch_button25.setChecked(true);
            imageView25.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button25.setChecked(false);
            imageView25.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs26.getString("checked92adf","no92adf").equals("yes92adf")){
            switch_button26.setChecked(true);
            imageView26.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button26.setChecked(false);
            imageView26.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs27.getString("checked93adf","no93adf").equals("yes93adf")){
            switch_button27.setChecked(true);
            imageView27.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button27.setChecked(false);
            imageView27.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs28.getString("checked94adf","no94adf").equals("yes94adf")){
            switch_button28.setChecked(true);
            imageView28.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button28.setChecked(false);
            imageView28.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs29.getString("checked95adf","no95adf").equals("yes95adf")){
            switch_button29.setChecked(true);
            imageView29.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button29.setChecked(false);
            imageView29.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs30.getString("checked96adf","no96adf").equals("yes96adf")){
            switch_button30.setChecked(true);
            imageView30.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button30.setChecked(false);
            imageView30.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs31.getString("checked97adf","no97adf").equals("yes97adf")){
            switch_button31.setChecked(true);
            imageView31.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button31.setChecked(false);
            imageView31.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs32.getString("checked98adf","no98adf").equals("yes98adf")){
            switch_button32.setChecked(true);
            imageView32.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button32.setChecked(false);
            imageView32.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }

        if (prefs33.getString("checked99adf","no99adf").equals("yes99adf")){
            switch_button33.setChecked(true);
            imageView33.setImageDrawable(getResources().getDrawable(R.drawable.button_on));
        }else{
            switch_button33.setChecked(false);
            imageView33.setImageDrawable(getResources().getDrawable(R.drawable.button_off));
        }


    }
}
