package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup subjects;


    private RadioButton ss,m,s,e,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subjects = findViewById(R.id.subs);

        m = findViewById(R.id.radioButton4);
        s = findViewById(R.id.radioButton);
        e = findViewById(R.id.radioButton3);
        c = findViewById(R.id.radioButton2);

        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(getApplicationContext(),"MATHS",Toast.LENGTH_SHORT).show();

                Intent mm = new Intent(getBaseContext(),maths_q.class);
                startActivity(mm);
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"science",Toast.LENGTH_SHORT).show();
                Intent ss = new Intent(getBaseContext(),science_q.class);
                startActivity(ss);
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"ENGLISH",Toast.LENGTH_SHORT).show();
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"computers",Toast.LENGTH_SHORT).show();

            }
        });

    }
}
