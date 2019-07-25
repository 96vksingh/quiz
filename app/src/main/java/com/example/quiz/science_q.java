package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class science_q extends AppCompatActivity {
    private Button bb;
    private RadioGroup s1,s2,s3;
    private TextView y;
    private RadioButton ss1,ss2,ss3,ss4,ss5,ss6,ss7,ss8,ss9,ss10,ss11,ss12;

    int qq1=0,qq2=0,qq3=0,cc=0;
    StringBuilder d = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_q);

        s1 = findViewById(R.id.saq1);
        s2 = findViewById(R.id.radioGroup2);
        s3 = findViewById(R.id.radioGroup);
y = findViewById(R.id.textView7);
        bb= findViewById(R.id.button);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(getBaseContext(),MainActivity.class);
                startActivity(back);
            }
        });

        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("You selected the correct answer");
        builder1.setCancelable(false);
        builder1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
        builder2.setMessage("uhhhh! its seems u left some questions");
        builder2.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        final AlertDialog alert1 = builder1.create();
        final AlertDialog alert2 = builder2.create();
        ss1 = findViewById(R.id.radioButton5);
        ss2 = findViewById(R.id.radioButton6);
        ss3 = findViewById(R.id.radioButton7);
        ss4 = findViewById(R.id.radioButton8);


        s1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(qq1 == 0){
                    cc= cc+1;
                }

                RadioButton g = radioGroup.findViewById(i);
                if(ss1 == g){
                    //alert1.show();
                    if(qq1 == 0){
                        d.append("\n1st is correct ");
                        qq1=1;
                    }

                }else{
                    //alert2.show();
                    if(qq1 ==0){
                        d.append("\n1st is wrong ");
                        qq1=-1;
                    }

                }
            }
        });

        ss5 =  findViewById(R.id.radioButton9);
        ss6 = findViewById(R.id.radioButton10);
        ss7 = findViewById(R.id.radioButton23);
        ss8 = findViewById(R.id.radioButton24);

        ss9 =  findViewById(R.id.radioButton25);
        ss10 = findViewById(R.id.radioButton26);
        ss11= findViewById(R.id.radioButton27);
        ss12 = findViewById(R.id.radioButton28);

        s2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(qq2 == 0){
                    cc=cc+1;
                }

                RadioButton g = radioGroup.findViewById(i);
                if(ss9 == g){
                   // alert1.show();
                    if(qq2 ==0){
                        d.append("\n2nd is correct ");
                        qq2=1;
                    }

                }else{
                    //alert2.show();
                    if(qq2 == 0){
                        d.append("\n2nd is wrong");
                        qq2=-1;
                    }

                }
            }
        });

        s3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(qq3 == 0){
                    cc=cc+1;
                }

                RadioButton g = radioGroup.findViewById(i);
                if(ss12 == g){
                   // alert1.show();
                    if(qq3 == 0){
                        d.append("\n3rd is correct ");
                        qq3=1;
                    }

                }else {
                    //alert2.show();
                    if(qq3 == 0){
                        d.append("\n3rd is wrong ");
                        qq3=-1;
                    }

                }
            }
        });

        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(cc==3){
                    y.setText(d);
                }else{
alert2.show();
                }

            }
        });







    }
}
