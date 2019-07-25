package com.example.quiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class maths_q extends AppCompatActivity {
    private Button kk;
    RadioGroup m1,m2,m3;
    RadioButton mm1,mm2,mm3,mm4,mm5,mm6,mm7,mm8,mm9,mm10,mm11,mm12;
    int mmm1=0,mmm2=0,mmm3=0,mcc=0;
    StringBuilder k = new StringBuilder();
    TextView tr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_q);

        tr = findViewById(R.id.textView8);
        m1 = findViewById(R.id.maq1);
        m2 = findViewById(R.id.maq2);
        m3 = findViewById(R.id.maq3);
        kk=findViewById(R.id.button2);
        kk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent fr = new Intent(getBaseContext(),MainActivity.class);
                startActivity(fr);
            }
        });

        mm1=findViewById(R.id.radioButton13);
        mm2=findViewById(R.id.radioButton14);
        mm3=findViewById(R.id.radioButton15);
        mm4=findViewById(R.id.radioButton16);

        mm1=findViewById(R.id.radioButton11);
        mm1=findViewById(R.id.radioButton12);
        mm1=findViewById(R.id.radioButton17);
        mm1=findViewById(R.id.radioButton18);

        mm1=findViewById(R.id.radioButton19);
        mm1=findViewById(R.id.radioButton20);
        mm1=findViewById(R.id.radioButton21);
        mm1=findViewById(R.id.radioButton22);

        AlertDialog.Builder gt = new AlertDialog.Builder(this);
        gt.setMessage("uhhh! seems u left some questions behind");
        gt.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        final AlertDialog ff =  gt.create();
        //gt.create();

        m1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if(mmm1==0){
                    mcc = mcc+1;
                }
                RadioButton uu = radioGroup.findViewById(i);

                if(uu == mm3){

                    k.append("\n1st is correct ");
                    mmm1=1;

                }else{
                    k.append("\n1st is wrong ");
                    mmm1=1;

                }


            }
        });

        m2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if(mmm2==0){
                    mcc = mcc + 1;
                }
                RadioButton uu = radioGroup.findViewById(i);
                if(uu == mm8){

                    k.append("\n2nd is correct ");
                    mmm2=1;

                }else{
                    k.append("\n2nd is wrong ");
                    mmm2=1;

                }

            }
        });

        m3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(mmm3==0){
                    mcc = mcc+1;
                }
                RadioButton uu = radioGroup.findViewById(i);
                if(uu == mm10){

                    if(mmm3==0){
                        k.append("\n3rd is correct ");
                        mmm3=1;
                    }

                }else{

                    k.append("\n3rd is wrong");
                    mmm3=1;

                }

            }
        });

        tr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mcc==3){
                    tr.setText(k);
                }
                else
                {
                  ff.show();
                }
            }
        });

    }
}
