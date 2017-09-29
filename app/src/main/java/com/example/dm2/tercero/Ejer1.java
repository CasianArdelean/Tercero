package com.example.dm2.tercero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Ejer1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer1);
    }

    public void sumar(View v){
        EditText uno=(EditText) findViewById(R.id.primero);
        EditText dos=(EditText) findViewById(R.id.segundo);

        int u=Integer.parseInt(uno.getText().toString());
        int d=Integer.parseInt(dos.getText().toString());

        int r=u+d;
        TextView res=(TextView) findViewById(R.id.resultado);
        res.setText(res.getText()+" "+String.valueOf(r));




    }
}
