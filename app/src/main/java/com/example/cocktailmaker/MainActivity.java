package com.example.cocktailmaker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    CardView Whiskey_Card;
    CardView Gin_Card;
    CardView Tequila_Card;
    CardView White_Rum_Card;
    CardView Dark_Rum_Card;
    CardView Vodka_Card;
    private Button TopTen;
    //User Input
    static ArrayList<String> User_Input = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Vodka_Card = (CardView)findViewById(R.id.Card1);
        Whiskey_Card = (CardView)findViewById(R.id.Card2);
        Tequila_Card = (CardView)findViewById(R.id.Card3);
        White_Rum_Card = (CardView)findViewById(R.id.Card4);
        Dark_Rum_Card = (CardView)findViewById(R.id.Card5);
        Gin_Card = (CardView)findViewById(R.id.Card6);
        TopTen = findViewById(R.id.TopTen);
        TopTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, layoutPage.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
        Vodka_Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User_Input.add("Vodka");
                Intent intent = new Intent(MainActivity.this, Activity_2.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
        Whiskey_Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User_Input.add("Whiskey");
                Intent intent = new Intent(MainActivity.this, Activity_2.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
        Tequila_Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User_Input.add("Tequila");
                Intent intent = new Intent(MainActivity.this, Activity_2.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
        White_Rum_Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User_Input.add("White_Rum");
                Intent intent = new Intent(MainActivity.this, Activity_2.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
        Dark_Rum_Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User_Input.add("Dark_Rum");
                Intent intent = new Intent(MainActivity.this, Activity_2.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
        Gin_Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User_Input.add("Gin");
                Intent intent = new Intent(MainActivity.this, Activity_2.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

    }
}