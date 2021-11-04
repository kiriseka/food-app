package com.bsoandroid.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView googleImage = findViewById(R.id.googleImage);
        ImageView twitterImage = findViewById(R.id.twitterImage);
        ImageView facebookImage = findViewById(R.id.facebookImage);

        TextView forgotPass = findViewById(R.id.forgotpass);


        Button loginButton = findViewById(R.id.loginbtn);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });

        googleImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Maaf, belum bisa pak", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        twitterImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Maaf, belum bisa pak", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        facebookImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Maaf, belum bisa pak", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        forgotPass.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Gunakan admin sebagai username dan password", Toast.LENGTH_SHORT);
                toast.show();
            }
        });    }

    public void login() {
        TextView usernameTV = findViewById(R.id.username);
        TextView passwordTV = findViewById(R.id.password);

        String username = usernameTV.getText().toString();
        String password = passwordTV.getText().toString();

        if (username.equals("admin") && password.equals("admin")) {
            Intent intent = new Intent(getApplicationContext(), DaftarHargaActivity.class);
            startActivity(intent);
            this.finish();
        }  else {
            Toast toast = Toast.makeText(getApplicationContext(), "Username atau password salah, silahkan tekan lupa password", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}