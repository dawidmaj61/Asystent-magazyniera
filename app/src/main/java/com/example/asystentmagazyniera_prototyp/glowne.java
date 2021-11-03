package com.example.asystentmagazyniera_prototyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class glowne extends AppCompatActivity {

    ImageButton imageBtn;
    ImageButton imageBtn2;
    ImageButton imageBtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glowne);

        imageBtn = (ImageButton) findViewById(R.id.imageBtn);
        imageBtn2 = (ImageButton) findViewById(R.id.imageBtn2);
        imageBtn3 = (ImageButton) findViewById(R.id.imageBtn3);

        imageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(glowne.this, Male.class);
                startActivity(intent);
                Toast.makeText(glowne.this, "Wybrano małe gniazda paletowe", Toast.LENGTH_LONG).show();
            }
        });
        imageBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(glowne.this, Srednie.class);
                startActivity(intent);
                Toast.makeText(glowne.this, "Wybrano średnie gniazda paletowe", Toast.LENGTH_LONG).show();
            }
        });
        imageBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(glowne.this, Duze.class);
                startActivity(intent);
                Toast.makeText(glowne.this, "Wybrano duże gniazda paletowe", Toast.LENGTH_LONG).show();
            }
        });
    }
}
