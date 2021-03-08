package com.example.fitpro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class DetailFood extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5;
    String s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_food);
        t1=findViewById(R.id.food1);
        t2=findViewById(R.id.food2);
        t3=findViewById(R.id.food3);
        t4=findViewById(R.id.food4);
        t5=findViewById(R.id.food5);
        Bundle extras=getIntent().getExtras();
        if(extras!=null)
        {
            s1=extras.getString("food");
            if(s1.equals("Whole Eggs")){
                t1.setText("Whole Eggs:");
                t2.setText("A single large egg contains roughly 72 calories");
                t3.setText("There is no Best time or worst time to eat eggs as such. " +
                        "But it is preferable to eat eggs in breakfast.");
                t4.setText(" This is because breakfast is the first and the most important meal if the day and should be heavy. It is this"+
                        "breakfast which helps you to run the day . So eggs taken in breakfast act as good source of protein in the diet");
                t5.setText("Best way to consume :Boiled,Poached,Fried");
            }
            else if(s1.equals("Leafy Greens")){
                t1.setText("Leafy Greens:");
                t2.setText("Leafy Greens contains roughly 23 colories.");
                t3.setText("Leafy green vegetables are preferable to be taken during day time. "+
                        "They're packed with vitamins, minerals and fiber but low in calories. "+
                        "Eating a diet rich in leafy greens can offer numerous health benefits including reduced risk of obesity, heart disease, high blood pressure and mental decline");
                t4.setText("As such not much harmful for green leafy vegetables at night yet better in daytime as at nighttime consuming those may make you feel bloated at night ."+
                        " And you may need to break sleep over need of drinking water and urination.");
                t5.setText("Best way to consume :Curries,Soups,Juice,Garnishes");
            }
            else if(s1.equals("Cruciferous Vegetables")){
                t1.setText("Cruciferous Vegetables:");
                t2.setText("All Cruciferous vegetables contain average of 33 calories");
                t3.setText("In case of deficiency of vitamin A,K and C, it is better to take Cruciferous vegetables."+
                        " Dark green cruciferous veggies also are an excellent source of vitamins A,K and C. ");
                t4.setText("Taking Cruciferous vegetables during night time may harder your Sleep.");
                t5.setText("Best way to consume :spinach with eggs in the morning, a salad for lunch and roasted brussels sprouts with your dinner.");
            }
            else if(s1.equals("Lean Beef and Chicken Breast")){
                t1.setText("Lean Beef and Chicken Breast:");
                t2.setText("Lean Beef is a high calorie contained food which has about 250 calaries."+
                        "Chicken Breast containes roughly 165 calaries.");
                t3.setText("Lean Beef Chicken breast are the highest quality protein available and it could be taken throughout the day "+
                        "i.e. pre workout, post workout, lunch or dinner. But since it takes one and half hr to two hr to digest it is better to take it day time.");
                t4.setText("Since , they take more time to digest ,taking them during night time may lead to Stomach pain .");
                t5.setText("Best way to consume : Chicken and Lean beef are best to eat when baked in the oven or stir fried with your favorite vegetables.");
            }
            else if(s1.equals("Boiled Potatoes")){
                t1.setText("Boiled Potatoes:");
                t2.setText("100 g of Boiled Potatoes containes 72 calories.");
                t3.setText("A boiled, unskinned potato is good for Slow-burning complex carbs found in fruits,"+
                        " vegetables, wholegrain bread, rice, pasta, and cereals are ideal for a pre-workout meal.");
                t4.setText("Eating too many boiled Potatoes may lead to gas problem in Stomach.");
                t5.setText("Best way to consume :Boiled potatoes are tastier when cooked with other vegetables.");
            }
            else if(s1.equals("Beans and Legumes")){
                t1.setText("Beans and Legumes:");
                t2.setText("Beans and Legumes contain 347 calaries.");
                t3.setText("Beans for Breakfast. Breakfast is often called the most important meal of the day, "+
                        "one that provides nourishment to break the overnight fast and energy for morning work. ");
                t4.setText("There's no worst time to take beans and legumes.It’s fine to eat beans - unless they cause any ill physical effects, like excess gas or something.");
                t5.setText("Best way to consume :Soups,salads,casseroles.");
            }
            else if(s1.equals("Homemade Protein Smoothies")){
                t1.setText(s1);
                t2.setText("232 calories");
                t3.setText("ideally, 30 minutes before spending an hour in the weight room, you have 2.5 hours to drink that shake and build optimal bulk.");
                t4.setText("there is such a time");
                t5.setText("Blend together 1 cup of yogurt, ½ cup almond milk, 1 to 2 tablespoons of peanut butter and 15-20 green grapes. Refrigerate and enjoy chilled. Believe it or not, chocolate and bananas make for a wonderful combination");
            }
            else if(s1.equals("Milk")){
                t1.setText("Milk:");
                t2.setText("The colorie content of Milk is 42 calories.");
                t3.setText("Milk taken in the morning provides the proteins you require during the day and milk at night provides good rest as it induces sleep.");
                t4.setText("Consuming milk with empty stomach may lead to poor digestion.");
                t5.setText("Best way to consume :Mixing it with nutritional powders.");
            }
            else if(s1.equals("Rice")){
                t1.setText("Rice:");
                t2.setText("Rice serves roughly 130 calories. ");
                t3.setText("Lunch time is the best time to have rice. This is due to two factors. Firstly, during daytime, our metabolism is faster and our body will digest all heavy healthy foods.");
                t4.setText("Thers's no worst time to eat rice.But, Over eating of rice during night time may lead to acidity and gas problem.");
                t5.setText("Best way to consume :. Team your cooked rice with blanched or stir-fried high-fibre vegetables to make your meal more satiating and healthy.");
            }
            else if(s1.equals("Nuts and Nut Butters")){
                t1.setText("Nuts and Nut Butters:");
                t2.setText("Hight calorie content foods are Nuts and Nut Butters which contain 607 calories. ");
                t3.setText("Consuming nuts along with breakfast can help you ward off fatigue and smoothly regulate blood pressure in your body.");
                t4.setText("Nuts and Nut butters should not be taken alond with Meals.They can be taken separatley at any time.");
                t5.setText("Best way to consume :Eating nuts by raw.");
            }
            else if(s1.equals("Red Meats")){
                t1.setText("Red Meats:");
                t2.setText("Red Meats consists an average of 176 calories.");
                t3.setText("Red Meats takes 24 to 72 hours to digest , depending on the person's digestive tract."+
                        "So, it is better to take during day time.");
                t4.setText("Since , they take more time to digest ,taking them during night time may lead to Acidity and gas problem.");
                t5.setText("Best way to consume :Fried,baked on oven.");
            }
            else if(s1.equals("Dried Fruit")){
                t1.setText(s1);
                t2.setText("Dry Fruits containes roughly an average of 359 calories.");
                t3.setText("The Right time to eat dry fruit is in morning and right method is to soak first.");
                t4.setText("Not all dry fruits are prefered to eat night time.Pista,almond etc.,can be taken at night time.");
                t5.setText("Best way to consume :Eating dry friuts by raw.");
            }
        }
        else {
            Toast.makeText(DetailFood.this,"something went wrong" , Toast.LENGTH_SHORT).show();
        }
    }
}
