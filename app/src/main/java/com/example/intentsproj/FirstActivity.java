package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button btn;
    EditText ed1,ed2;

    String v1,v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btn = findViewById(R.id.btn1);
        ed1 = findViewById(R.id.e1);
        ed2 = findViewById(R.id.e2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( FirstActivity.this, SecondActivity.class);

                intent.putExtra("Value1", ed1.getText().toString());
                intent.putExtra("Value2", ed2.getText().toString());

                Context context = getApplicationContext();
                CharSequence message = "Numbers are saved";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context,message,duration);
                toast.show();

                startActivity(intent);
            }
        });
    }
}
