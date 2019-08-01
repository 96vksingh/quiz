package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup subjects;


    private RadioButton ss,m,s,e,c;
    private Button hg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hg = findViewById(R.id.button3);


        subjects = findViewById(R.id.subs);

        m = findViewById(R.id.radioButton4);
        s = findViewById(R.id.radioButton);
        e = findViewById(R.id.radioButton3);
        c = findViewById(R.id.radioButton2);

        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(getApplicationContext(),"MATHS",Toast.LENGTH_SHORT).show();


            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"science",Toast.LENGTH_SHORT).show();

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

    @Override
    public boolean onCreateOptionsMenu(Menu mm){
        getMenuInflater().inflate(R.menu.items,mm);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem ii){
        //int id = ii.getItemId();
        switch (ii.getItemId()){
            case R.id.i1 :
                Toast.makeText(getApplicationContext(),"cccc item 1 was selected",Toast.LENGTH_SHORT).show();
                Intent mm = new Intent(getBaseContext(),maths_q.class);
                startActivity(mm);

                break;
            case R.id.i2 :
                Toast.makeText(getApplicationContext(),"cccc item 2 was selected",Toast.LENGTH_SHORT).show();
                Intent ss = new Intent(getBaseContext(),science_q.class);
                startActivity(ss);
                break;
            case R.id.i3 :
                Toast.makeText(getApplicationContext(),"cccc item 3 selected",Toast.LENGTH_SHORT).show();
                break;
            case R.id.i4 :
                Toast.makeText(getApplicationContext(),"ccccc item 4 selected",Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(ii);
    }
}
