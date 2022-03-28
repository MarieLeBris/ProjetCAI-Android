package com.example.tomf_marielb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LoadingScreenActivity extends AppCompatActivity {

    private final int LOAD_SCREEN_TIMEOUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);

        //rediriger vers l'activité principale après 3s
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                //demarrer une page
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();//destruction de l'activité écran de chargement

            }
        };

        //handler post delay: réaliser l'action runnable après 3s
        new Handler().postDelayed(runnable,LOAD_SCREEN_TIMEOUT);
    }
}