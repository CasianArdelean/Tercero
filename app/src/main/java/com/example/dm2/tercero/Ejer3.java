package com.example.dm2.tercero;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Ejer3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer3);
    }

    public void amarrillo(View v){
        LinearLayout l=(LinearLayout) findViewById(R.id.contenedor);
        l.setBackgroundColor(Color.YELLOW);

    }
    public void gris(View v){
        LinearLayout l=(LinearLayout) findViewById(R.id.contenedor);
        l.setBackgroundColor(Color.GRAY);

    }
}
