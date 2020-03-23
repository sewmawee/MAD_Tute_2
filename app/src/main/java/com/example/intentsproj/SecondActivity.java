package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    EditText ed3, ed4, ed5;
    Button btnAdd, btnSub, btnMulti, btnDiv;
    String value1=null,value2=null;


    double n1=0, n2=0, ans=0;
    CharSequence message = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ed3 = findViewById(R.id.e3);
        ed4 = findViewById(R.id.e4);
        ed5 = findViewById(R.id.editText);
        btnAdd = findViewById(R.id.btn2);
        btnSub = findViewById(R.id.btn3);
        btnMulti = findViewById(R.id.btn4);
        btnDiv = findViewById(R.id.btn5);

        Intent receive = getIntent();

        String value1 = receive.getStringExtra("Value1");
        String value2 = receive.getStringExtra("Value2");


        ed3.setText(value1);
        ed4.setText(value2);


        n1 = Double.parseDouble(value1);


        n2 = Double.parseDouble(value2);

        final Context context = getApplicationContext();

        final int duration = Toast.LENGTH_LONG;
        final Toast toast = Toast.makeText(context, message, duration);
        toast.setGravity(Gravity.TOP, 0, 0);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed5.setText(String.valueOf(ans));
                message = "Add two numbers";
                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.TOP, 0, 100);
                toast.show();

            }


        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed5.setText(String.valueOf(ans));
                message = "Substraction two numbers";
                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.TOP, 0, 100);
                toast.show();
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed5.setText(String.valueOf(ans));
                message = "Multiply two numbers";
                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.TOP, 0, 100);
                toast.show();

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed5.setText(String.valueOf(ans));
                message = "Divide two numbers";
                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.TOP, 0, 100);
                toast.show();

            }
        });
    }
}






