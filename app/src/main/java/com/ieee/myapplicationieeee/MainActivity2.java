package com.ieee.myapplicationieeee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText atg=(EditText)findViewById(R.id.atg);
        Bundle b=getIntent().getExtras();
        String etA =b.getString("Birthofyear");
        atg.setText("Birthofyear"+etA);
            }

}