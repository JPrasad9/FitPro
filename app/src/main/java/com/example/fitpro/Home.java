package com.example.fitpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

    }
    public void food(View view){
        Intent i= new Intent(Home.this,HealthyFood.class);
        startActivity(i);
    }
    public void bmi(View view){
        Intent i=new Intent(Home.this, BmiCal.class);
        startActivity(i);
    }
    public void recipes(View view){
        Intent i=new Intent(Home.this,Recipes.class);
        startActivity(i);
    }
}
