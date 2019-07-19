package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class maths_q extends AppCompatActivity {
    private Button kk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_q);
        kk=findViewById(R.id.button2);
        kk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent fr = new Intent(getBaseContext(),MainActivity.class);
                startActivity(fr);
            }
        });
    }
}
