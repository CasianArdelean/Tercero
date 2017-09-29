package com.example.dm2.tercero;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ejer2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer2);
    }

    public void operacion (View v){
        Button b=(Button) findViewById(v.getId());

        EditText uno=(EditText) findViewById(R.id.primero);
        EditText dos=(EditText) findViewById(R.id.segundo);
        TextView res=(TextView) findViewById(R.id.resultado);
        res.setTextColor(Color.BLACK);
        int u=Integer.parseInt(uno.getText().toString());
        int d=Integer.parseInt(dos.getText().toString());

        if(b.getText().equals("+")){
            int r=u+d;
            res.setText("Resultado: "+String.valueOf(r));
        }
        if(b.getText().equals("-")){
            int r=u-d;
            res.setText("Resultado: "+String.valueOf(r));
        }
        if(b.getText().equals("*")){
            int r=u*d;
            res.setText("Resultado: "+String.valueOf(r));
        }
        if(b.getText().equals("/")){
            if(d==0){
                res.setTextColor(Color.RED);
                res.setText("No se puede dividir entre cero");

            }else{
                int r=u/d;
                res.setText("Resultado: "+String.valueOf(r));
            }

        }



    }
}

