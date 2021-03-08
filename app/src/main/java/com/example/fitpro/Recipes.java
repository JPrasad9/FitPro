package com.example.fitpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Recipes extends AppCompatActivity {
    ListView li;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipes);
        li = findViewById(R.id.gain);
        ArrayList<String> grocery = new ArrayList<>();
        grocery.add("Grilled Buttermilk Chicken");
        grocery.add("Shredded Kale and Brussels Sprouts Salad");
        grocery.add("Spicy Plum Salmon");

        grocery.add("Jicama Citrus Salad");
        grocery.add("Garden-Fresh Rainbow Chard");
        grocery.add("Lemony Zucchini Ribbons");

        grocery.add("Breakfast Sweet Potatoes");
        grocery.add("Asparagus Nicoise Salad");
        grocery.add("Crab Phyllo Cups");
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, grocery);
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
                Intent i=new Intent(Recipes.this,DetailRecipes.class);
                i.putExtra("food",text);
                startActivity(i);
//                Toast.makeText(HealthyFood.this,text , Toast.LENGTH_SHORT).show();
            }
        });
    }
}
