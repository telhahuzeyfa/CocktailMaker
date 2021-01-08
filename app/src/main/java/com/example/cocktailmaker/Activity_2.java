package com.example.cocktailmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.Touch;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;

public class Activity_2 extends AppCompatActivity {

    CheckBox Orange_Juice, Lemon, Ginger_Beer, Honey, Sugar, Grenadine, Club_Soda, Lime, Simple_Syrup, Mint, Pineapple_Juice, Cream_of_Coconut, Apple_Juice, Cucumber, Creme, Blueberries;
    TextView final_text;
    Button submit_button;
    static Intent intent;

    static ArrayList<String> ScrewDriver = new ArrayList<String>();

    static ArrayList<String> MoscowMule = new ArrayList<String>();

    static ArrayList<String> HotToddy = new ArrayList<String>();

    static ArrayList<String> WhiskeySour = new ArrayList<String>();

    static ArrayList<String> TequilaSunrise = new ArrayList<String>();

    static ArrayList<String> TequilaHighball = new ArrayList<String>();

    static ArrayList<String> ClassicMojito = new ArrayList<String>();

    static ArrayList<String> PinaColada = new ArrayList<String>();

    static ArrayList<String> DarkStormy = new ArrayList<String>();

    static ArrayList<String> PainKiller = new ArrayList<String>();

    static ArrayList<String> EnglishGardenCocktail = new ArrayList<String>();

    static ArrayList<String> BrambleGinCocktail = new ArrayList<String>();

    public static void main(String[] args){
    }

    public void onCheckboxClicked(View view) {

        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.checkbox_OJ:
                if (checked)
                    MainActivity.User_Input.add("Orange_Juice");
                else
                    MainActivity.User_Input.remove("Orange_Juice");
                break;
            case R.id.checkbox_lemons:
                if (checked)
                    MainActivity.User_Input.add("Lemon");
                else
                    MainActivity.User_Input.remove("Lemon");
                break;
            case R.id.checkbox_GingerBeer:
                if (checked)
                    MainActivity.User_Input.add("Ginger_Beer");
                else
                    MainActivity.User_Input.remove("Ginger_Beer");
                break;
            case R.id.checkbox_honey:
                if (checked)
                    MainActivity.User_Input.add("Honey");
                else
                    MainActivity.User_Input.remove("Honey");
                break;
            case R.id.checkbox_sugar:
                if (checked)
                    MainActivity.User_Input.add("Sugar");
                else
                    MainActivity.User_Input.remove("Sugar");
                break;
            case R.id.checkbox_Grenadine:
                if (checked)
                    MainActivity.User_Input.add("Grenadine");
                else
                    MainActivity.User_Input.remove("Grenadine");
                break;
            case R.id.checkbox_soda:
                if (checked)
                    MainActivity.User_Input.add("Club_Soda");
                else
                    MainActivity.User_Input.remove("Club_Soda");
                break;
            case R.id.checkbox_lime:
                if (checked)
                    MainActivity.User_Input.add("Lime");
                else
                    MainActivity.User_Input.remove("Lime");
                break;
            case R.id.checkbox_Syrup:
                if (checked)
                    MainActivity.User_Input.add("Simple_Syrup");
                else
                    MainActivity.User_Input.remove("Simple_Syrup");
                break;
            case R.id.checkbox_Pineapple:
                if (checked)
                    MainActivity.User_Input.add("Pineapple");
                else
                    MainActivity.User_Input.remove("Pineapple");
                break;
            case R.id.checkbox_Coconut:
                if (checked)
                    MainActivity.User_Input.add("Cream_of_Coconut");
                else
                    MainActivity.User_Input.remove("Cream_of_Coconut");
                break;
            case R.id.checkbox_Apple:
                if (checked)
                    MainActivity.User_Input.add("Apple_Juice");
                else
                    MainActivity.User_Input.remove("Apple_Juice");
                break;
            case R.id.checkbox_Mint:
                if (checked)
                    MainActivity.User_Input.add("Mint");
                else
                    MainActivity.User_Input.remove("Mint");
                break;
            case R.id.checkbox_Creme:
                if (checked)
                    MainActivity.User_Input.add("Creme");
                else
                    MainActivity.User_Input.remove("Creme");
                break;
            case R.id.checkbox_Blackberries:
                if (checked)
                    MainActivity.User_Input.add("Blackberries");
                else
                    MainActivity.User_Input.remove("Blackberries");
                break;
            case R.id.checkbox_Cucumber:
                if (checked)
                    MainActivity.User_Input.add("Cucumber");
                else
                    MainActivity.User_Input.remove("Cucumber");
                break;
        }
    }
    public void finalSelection(View view){
        //add the ingredients into preview before searching
        String final_cocktail_selection = "";
        for (String Selections : MainActivity.User_Input){
            final_cocktail_selection = final_cocktail_selection + Selections + "\n";
        }
        final_text.setText(final_cocktail_selection);
            final_text.setEnabled(true);
            //Store values to Logcat and preview
        TextView t = findViewById(R.id.final_result);
        String input = t.getText().toString();
        Log.d("info", input);

        //Vodka
        ScrewDriver.add("Vodka");
        ScrewDriver.add("Orange_Juice");


        MoscowMule.add("Vodka");
        MoscowMule.add("Lemon");
        MoscowMule.add("Ginger_Beer");

        //Whiskey
        HotToddy.add("Whiskey");
        HotToddy.add("Lemon");
        HotToddy.add("Honey");


        WhiskeySour.add("Whiskey");
        WhiskeySour.add("Lemon");
        WhiskeySour.add("Orange_Juice");
        WhiskeySour.add("Sugar");

        //Tequila
        TequilaSunrise.add("Tequila");
        TequilaSunrise.add("Orange_Juice");
        TequilaSunrise.add("Grenadine");


        TequilaHighball.add("Tequila");
        TequilaHighball.add("Club_Soda");
        TequilaHighball.add("Lime");

        //White Rum
        ClassicMojito.add("White_Rum");
        ClassicMojito.add("Simple_Syrup");
        ClassicMojito.add("Lime");
        ClassicMojito.add("Mint");
        ClassicMojito.add("Club_Soda");


        PinaColada.add("White_Rum");
        PinaColada.add("Pineapple_Juice");
        PinaColada.add("Lime_Juice");
        PinaColada.add("Cream_of_Coconut");

        //Dark Rum
        DarkStormy.add("Dark_Rum");
        DarkStormy.add("Lime");
        DarkStormy.add("Ginger_Beer");

        //Works
        PainKiller.add("Dark_Rum");
        PainKiller.add("Cream_of_Coconut");
        PainKiller.add("Orange_Juice");
        PainKiller.add("Pineapple_Juice");

        //Gin
        EnglishGardenCocktail.add("Gin");
        EnglishGardenCocktail.add("Apple_Juice");
        EnglishGardenCocktail.add("Lime");
        EnglishGardenCocktail.add("Cucumber");


        BrambleGinCocktail.add("Gin");
        BrambleGinCocktail.add("Lemon");
        BrambleGinCocktail.add("Simple_Syrup");
        BrambleGinCocktail.add("Creme");
        BrambleGinCocktail.add("Blackberries");

        System.out.println(MainActivity.User_Input);
        System.out.println(WhiskeySour);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        final_text = (TextView) findViewById(R.id.final_result);
        final_text.setEnabled(false);
        submit_button = findViewById(R.id.SearchButton);
        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.User_Input.containsAll( ScrewDriver)){
                    intent = new Intent(Activity_2.this,  Screw_Driver.class);
                }
                //If the user input contains all the items under the array list of WhiskeySour go to the wiskeySour layout
                if (MainActivity.User_Input.containsAll(WhiskeySour)) {
                    intent = new Intent(Activity_2.this, Whiskey_Sour_Activity.class);
                }
                //If the user input contains all the items under the array list of BrambleGinCocktail go to the Brmple_Gin layout
                if (MainActivity.User_Input.containsAll(BrambleGinCocktail)) {
                    intent = new Intent(Activity_2.this, Brample_Gin.class);
                }
                if (MainActivity.User_Input.containsAll(ClassicMojito)) {
                    intent = new Intent(Activity_2.this, Mojito_Activity.class);
                }
                if (MainActivity.User_Input.containsAll(DarkStormy)) {
                    intent = new Intent(Activity_2.this, Dark_Stormy_Activity.class);
                }
                if (MainActivity.User_Input.containsAll(EnglishGardenCocktail)){
                    intent = new Intent(Activity_2.this, English_Garden.class);
                }
                if (MainActivity.User_Input.containsAll(PainKiller)){
                    intent = new Intent(Activity_2.this, Pain_Killer.class);
                }
                if (MainActivity.User_Input.containsAll(PinaColada)){
                    intent = new Intent(Activity_2.this, Pina_Colada.class);
                }
                if (MainActivity.User_Input.containsAll(TequilaHighball)){
                    intent = new Intent(Activity_2.this, Pina_Colada.class);
                }
                if (MainActivity.User_Input.containsAll(TequilaSunrise)){
                    intent = new Intent(Activity_2.this, Tequila_Sunrise.class);
                }
                if (MainActivity.User_Input.containsAll(HotToddy)){
                    intent = new Intent(Activity_2.this, Hot_Toddy.class);
                }
                if (MainActivity.User_Input.containsAll( MoscowMule)){
                    intent = new Intent(Activity_2.this,  Moscow_Mule.class);
                }
                if (!MainActivity.User_Input.containsAll(MoscowMule) && !MainActivity.User_Input.containsAll(HotToddy) && !MainActivity.User_Input.containsAll(TequilaSunrise) && !MainActivity.User_Input.containsAll(TequilaHighball) && !MainActivity.User_Input.containsAll(PinaColada) && !MainActivity.User_Input.containsAll(PainKiller) && !MainActivity.User_Input.containsAll(EnglishGardenCocktail) && !MainActivity.User_Input.containsAll(DarkStormy) && !MainActivity.User_Input.containsAll(ClassicMojito) && !MainActivity.User_Input.containsAll(BrambleGinCocktail) && !MainActivity.User_Input.containsAll(WhiskeySour) && !MainActivity.User_Input.containsAll(WhiskeySour) && !MainActivity.User_Input.containsAll(ScrewDriver)){
                    intent = new Intent(Activity_2.this, MapsActivity.class);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Enjoy", Toast.LENGTH_LONG). show();
                }
                startActivity(intent);
            }
        });

    }
}