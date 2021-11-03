package com.example.asystentmagazyniera_prototyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button_login;
    TextView login,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_login = (Button) findViewById(R.id.button_login);
        login = (TextView) findViewById(R.id.login);
        password = (TextView) findViewById(R.id.password);
    }

    public void dane_logowania(View view) {
        if (login.getText().toString().equals("Maj")&&
                password.getText().toString().equals("123")){
            Toast.makeText(getApplicationContext(),
                    "Zalogowno się na dział chemii gospodarczej",
                    Toast.LENGTH_LONG).show();
            Intent login = new Intent(MainActivity.this, glowne.class);
            startActivity(login);
        }else {
            Toast.makeText(getApplicationContext(),
                    "Niepoprawny login lub hasło",
                    Toast.LENGTH_LONG).show();
        }
    }
}
