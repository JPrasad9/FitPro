package com.example.fitpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String username,password;
    EditText e1,e2;
//    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void mainpage(View view){
            e1=findViewById(R.id.user);
            e2=findViewById(R.id.password);
//            t1=findViewById(R.id.r);
            username=e1.getText().toString();
            password=e2.getText().toString();
        Log.d("tag", username);
            if(username.equals("user@gmail.com"))
            {
                Log.d("tag", password);
                if(password.equals("user123"))
                {
                    Intent i=new Intent(MainActivity.this,Home.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(),"wrong password",Toast.LENGTH_SHORT).show();

                }
            }
            else
            {
                Toast.makeText(getApplicationContext(),"invalid user",Toast.LENGTH_SHORT).show();
            }

    }
}
