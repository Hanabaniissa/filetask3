package com.ieee.myapplicationieeee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buGetAge(View view) {
        EditText etAge=(EditText)findViewById(R.id.etAge);
        int YearOfBirth = Integer.parseInt(etAge.getText().toString());
        int age=2020-YearOfBirth;
        Toast.makeText(this,"age:"+ String.valueOf(age),Toast.LENGTH_LONG).show();

        Intent myitent=new Intent(this,MainActivity2.class);
        Bundle b=new Bundle();
        b.putString("Birthofyear", etAge.getText().toString());
        myitent.putExtras(b);


        startActivity(myitent);;
    }

}