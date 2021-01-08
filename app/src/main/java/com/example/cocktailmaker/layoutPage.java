package com.example.cocktailmaker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class layoutPage extends AppCompatActivity {
    CardView negroni;
    CardView gin_tonic;
    CardView manhattan;
    CardView margarita;
    CardView daiquiri;
    CardView gimlet;
    CardView martini;
    CardView cosmo;
    CardView sidecar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_page);
        negroni = (CardView) findViewById(R.id.one);
        gin_tonic = (CardView) findViewById(R.id.two);
        manhattan = (CardView) findViewById(R.id.three);
        margarita = (CardView) findViewById(R.id.four);
        daiquiri = (CardView) findViewById(R.id.five);
        gimlet = (CardView) findViewById(R.id.six);
        martini = (CardView) findViewById(R.id.seven);
        cosmo = (CardView) findViewById(R.id.eight);
        sidecar = (CardView) findViewById(R.id.nine);

        //drink one
        negroni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(layoutPage.this, drinkone.class);
                startActivity(intent);
            }
        });

        //drink two
        gin_tonic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(layoutPage.this, drink2.class);
                startActivity(intent);
            }
        });

        //drink three
        manhattan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(layoutPage.this, drink3.class);
                startActivity(intent);
            }
        });

        //drink four
        margarita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(layoutPage.this, drink4.class);
                startActivity(intent);
            }
        });

        //drink five
        daiquiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(layoutPage.this, drink5.class);
                startActivity(intent);
            }
        });

        //drink six
        gimlet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(layoutPage.this, drink6.class);
                startActivity(intent);
            }
        });

        //drink seven
        martini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(layoutPage.this, drink7.class);
                startActivity(intent);
            }
        });

        //drink eight
        cosmo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(layoutPage.this, drink8.class);
                startActivity(intent);
            }
        });

        //drink nine
        sidecar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(layoutPage.this, drink9.class);
                startActivity(intent);
            }
        });
    }
}