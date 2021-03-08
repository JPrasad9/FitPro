package com.example.fitpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class LossWt extends AppCompatActivity {
    ListView li;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loss_wt);
        li = findViewById(R.id.loss);
        ArrayList<String> grocery = new ArrayList<>();
        grocery.add("Whole Eggs");
        grocery.add("Leafy Greens");
        grocery.add("Cruciferous Vegetables");
        grocery.add("Lean Beef and Chicken Breast");
        grocery.add("Boiled Potatoes");
        grocery.add("Beans and Legumes");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, grocery){
            @Override
            public View getView(int position, View convertView, ViewGroup parent){
                // Get the Item from ListView
                View view = super.getView(position, convertView, parent);

                // Initialize a TextView for ListView each Item
                TextView tv = (TextView) view.findViewById(android.R.id.text1);

                // Set the text color of TextView (ListView Item)
                tv.setTextColor(Color.WHITE);
                // Generate ListView Item using TextView
                return view;
            }
        };

        li.setAdapter(arrayAdapter);




        li.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text = ((TextView) view).getText().toString();
//                Log.d("food", "onItemClick: "+text);
                Intent i=new Intent(LossWt.this,DetailFood.class);
                i.putExtra("food",text);
                startActivity(i);
//                Toast.makeText(HealthyFood.this,text , Toast.LENGTH_SHORT).show();
            }
        });

    }
}
