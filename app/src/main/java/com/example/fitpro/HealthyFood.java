package com.example.fitpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class HealthyFood extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.healthy_food);
    }
    public void gain(View view){
        Intent i=new Intent(HealthyFood.this,GainWt.class);
        startActivity(i);
    }
    public void loss(View view){
        Intent i= new Intent(HealthyFood.this,LossWt.class);
        startActivity(i);
    }
}
