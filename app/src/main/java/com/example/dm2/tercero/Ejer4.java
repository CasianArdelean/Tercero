package com.example.dm2.tercero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class Ejer4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer4);
    }


    public void validar(View v){
        String [] str={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

        EditText e=(EditText) findViewById(R.id.dni);
        String s=e.getText().toString();
        int dni=Integer.parseInt(s);


        if(s.length()==8){
            int res=dni%23;
            EditText r=(EditText) findViewById(R.id.letra);
            r.setText(str[res]);
        }

    }
}
