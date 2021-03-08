package com.example.fitpro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.nio.channels.NonReadableChannelException;

public class BmiCal extends AppCompatActivity {
    double h,w,bmi;
    EditText h1,w1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi_cal);
    }
    public void calculate(View view) {
        h1 = findViewById(R.id.height);
        w1 = findViewById(R.id.weight);
        try {
            if (h1.getText().toString() != "") {
                h = Double.parseDouble(h1.getText().toString());
                w = Double.parseDouble(w1.getText().toString());
                Log.d("msg", h + "");
                bmi = w / (h * h) * 10000;
//        Toast.makeText(getApplicationContext(),bmi+" kg/m2",Toast.LENGTH_SHORT).show();
                if (bmi < 18.5) {
//            System.out.println("");
                    Toast.makeText(getApplicationContext(), "Underweight", Toast.LENGTH_SHORT).show();

                } else if (bmi >= 18.5 && bmi <= 23.9) {
//            System.out.println("Normal");
                    Toast.makeText(getApplicationContext(), "Normal", Toast.LENGTH_SHORT).show();
                } else if (bmi >= 24.0 && bmi <= 29.9) {
//            System.out.println("Overweight");
                    Toast.makeText(getApplicationContext(), "Overweight", Toast.LENGTH_SHORT).show();
                } else if (bmi >= 30.0) {
//            System.out.println("Obese");
                    Toast.makeText(getApplicationContext(), "Obese", Toast.LENGTH_SHORT).show();
                }
            }
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Enter a Valid data ", Toast.LENGTH_SHORT).show();
        }
    }
}
