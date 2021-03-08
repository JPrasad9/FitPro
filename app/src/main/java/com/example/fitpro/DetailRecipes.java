package com.example.fitpro;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class DetailRecipes extends AppCompatActivity {
    TextView r1,r2,r3;
    ImageView i1;
    String s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_recipes);
        Bundle extras=getIntent().getExtras();
        r1=findViewById(R.id.recipename);
        r2=findViewById(R.id.ingredients);
        i1=findViewById(R.id.recipeimg);
        r3=findViewById(R.id.directions);
        if(extras!=null) {
            s1 = extras.getString("food");
            if(s1.equals("Grilled Buttermilk Chicken")){
                i1.setImageResource(R.drawable.grilled);
                r1.setText(s1);
                r2.setText("1-1/2 cups buttermilk\n" +
                        "4 fresh thyme sprigs\n" +
                        "4 garlic cloves, halved\n" +
                        "1/2 teaspoon salt\n" +
                        "12 boneless skinless chicken breast halves (about 4-1/2 pounds)");
                r3.setText("Place the buttermilk, thyme, garlic and salt in a large bowl or shallow dish. Add chicken and turn to coat. Refrigerate 8 hours or overnight, turning occasionally.\n" +
                        "Drain chicken, discarding marinade. Grill, covered, over medium heat until a thermometer reads 165°, 5-7 minutes per side");
            }
            else if(s1.equals("Shredded Kale and Brussels Sprouts Salad")){
                i1.setImageResource(R.drawable.shredded);
                r1.setText(s1);
                r2.setText("1 small bunch kale (about 8 ounces), stemmed and thinly sliced (about 6 cups)\n" +
                        "1/2 pound fresh Brussels sprouts, thinly sliced (about 3 cups)\n" +
                        "1/2 cup pistachios, coarsely chopped\n" +
                        "1/2 cup honey mustard salad dressing\n" +
                        "1/4 cup shredded Parmesan cheese");
                r3.setText("Toss together all ingredients.\n" +
                        "\n" +
                        "Test Kitchen tips\n" +
                        "If you want to skip the slicing, use baby kale instead.\n" +
                        "Coarsely chopped ripe pear would be a great addition to this salad.");
            }
            else if(s1.equals("Spicy Plum Salmon")){
                i1.setImageResource(R.drawable.spicy);
                r1.setText(s1);
                r2.setText("5 medium plums, divided\n" +
                        "1/2 cup water\n" +
                        "2 tablespoons ketchup\n" +
                        "1 chipotle pepper in adobo sauce, finely chopped\n" +
                        "1 tablespoon sugar\n" +
                        "1 tablespoon olive oil\n" +
                        "6 salmon fillets (6 ounces each)\n" +
                        "3/4 teaspoon salt");
                r3.setText("Coarsely chop 2 plums; place in a small saucepan. Add water; bring to a boil. Reduce heat; simmer, uncovered, 10-15 minutes or until plums are softened and liquid is almost evaporated. Cool slightly. Transfer to a food processor; add ketchup, chipotle, sugar and oil. Process until pureed. Reserve 3/4 cup sauce for serving.\n" +
                        "Sprinkle salmon with salt; place on a greased grill rack, skin side up. Grill, covered, over medium heat until fish just begins to flake easily with a fork, about 10 minutes. Brush with remaining sauce during last 3 minutes. Slice remaining plums. Serve salmon with plum slices and reserved sauce.");
            }
            else if(s1.equals("Jicama Citrus Salad")){
                i1.setImageResource(R.drawable.jicama);
                r1.setText(s1);
                r2.setText("8 tangerines, peeled, quartered and sliced\n" +
                        "1 pound medium jicama, peeled and cubed\n" +
                        "2 shallots, thinly sliced\n" +
                        "2 tablespoons lemon or lime juice\n" +
                        "1/4 cup chopped fresh cilantro\n" +
                        "1/2 teaspoon salt\n" +
                        "1/2 teaspoon pepper");
                r3.setText("Combine all ingredients; refrigerate until serving.");
            }
            else if(s1.equals("Garden-Fresh Rainbow Chard")){
                i1.setImageResource(R.drawable.garden);
                r1.setText(s1);
                r2.setText("2 tablespoons olive oil\n" +
                        "1 medium red onion, halved and sliced\n" +
                        "3 garlic cloves, sliced\n" +
                        "1/4 cup chicken broth\n" +
                        "2 bunches rainbow Swiss chard, coarsely chopped (about 16 cups)\n" +
                        "2 tablespoons lemon juice\n" +
                        "1/4 teaspoon salt\n" +
                        "1/4 teaspoon pepper");
                r3.setText("In a 6-qt. stockpot, heat oil over medium-high heat. Add onion; cook and stir until tender, 2-3 minutes. Add garlic; cook 1 minute longer.\n" +
                        "Add broth and chard; cook and stir until chard is tender, 5-6 minutes. Remove from heat; stir in lemon juice, salt and pepper.");
            }
            else if(s1.equals("Lemony Zucchini Ribbons")){
                i1.setImageResource(R.drawable.lemony);
                r1.setText(s1);
                r2.setText("1 tablespoon olive oil\n" +
                        "1/2 teaspoon grated lemon zest\n" +
                        "1 tablespoon lemon juice\n" +
                        "1/2 teaspoon salt\n" +
                        "1/4 teaspoon pepper\n" +
                        "3 medium zucchini\n" +
                        "1/3 cup crumbled goat or feta cheese");
                r3.setText("For dressing, in a small bowl, mix the first 5 ingredients. Using a vegetable peeler, shave zucchini lengthwise into very thin slices; arrange on a serving plate.\n" +
                        "To serve, drizzle with dressing and toss lightly to coat. Top with cheese.");
            }
            else if(s1.equals("Breakfast Sweet Potatoes")){
                i1.setImageResource(R.drawable.breakfast);
                r1.setText(s1);
                r2.setText("4 medium sweet potatoes (about 8 ounces each)\n" +
                        "1/2 cup fat-free coconut Greek yogurt\n" +
                        "1 medium apple, chopped\n" +
                        "2 tablespoons maple syrup\n" +
                        "1/4 cup toasted unsweetened coconut flakes");
                r3.setText("Preheat oven to 400°. Place potatoes on a foil-lined baking sheet. Bake until tender, 45-60 minutes.\n" +
                        "With a sharp knife, cut an \"X\" in each potato. Fluff pulp with a fork. Top with remaining ingredients.");
            }
            else if(s1.equals("Asparagus Nicoise Salad")){
                i1.setImageResource(R.drawable.asparagus);
                r1.setText(s1);
                r2.setText("1 pound small red potatoes (about 10), halved\n" +
                        "1 pound fresh asparagus, trimmed and halved crosswise\n" +
                        "3 pouches (2-1/2 ounces each) albacore white tuna in water\n" +
                        "1/2 cup pitted Greek olives, halved, optional\n" +
                        "1/2 cup zesty Italian salad dressing");
                r3.setText("Place potatoes in a large saucepan; add water to cover by 2 in. Bring to a boil. Reduce heat; cook, uncovered, until tender, 10-12 minutes, adding asparagus during the last 2-4 minutes of cooking. Drain potatoes and asparagus; immediately drop into ice water.\n" +
                        "To serve, drain potatoes and asparagus; pat dry and divide among 4 plates. Add tuna and, if desired, olives. Drizzle with dressing");
            }
            else if(s1.equals("Crab Phyllo Cups")){
                i1.setImageResource(R.drawable.crabbie);
                r1.setText(s1);
                r2.setText("1/2 cup reduced-fat spreadable garden vegetable cream cheese\n" +
                        "1/2 teaspoon seafood seasoning\n" +
                        "3/4 cup lump crabmeat, drained\n" +
                        "2 packages (1.9 ounces each) frozen miniature phyllo tart shells\n" +
                        "5 tablespoons chili sauce");
                r3.setText("In a small bowl, mix cream cheese and seafood seasoning; gently stir in crab. Spoon 2 teaspoons crab mixture into each tart shell; top with chili sauce.");
            }
        }
        else
        {
            Toast.makeText(DetailRecipes.this,"something went wrong" , Toast.LENGTH_SHORT).show();
        }
    }
}