package com.example.dm2.tercero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ejer1(View v){
        Intent ejer = new Intent(MainActivity.this, Ejer1.class);
        startActivity(ejer);
    }

    public void ejer2(View v){
        Intent ejer2 = new Intent(MainActivity.this, Ejer2.class);
        startActivity(ejer2);
    }

    public void ejer3(View v){
        Intent ejer3 = new Intent(MainActivity.this, Ejer3.class);
        startActivity(ejer3);
    }
    public void ejer4(View v){
        Intent ejer4 = new Intent(MainActivity.this, Ejer4.class);
        startActivity(ejer4);
    }
    public void ejer5(View v){
        Intent ejer5 = new Intent(MainActivity.this, Ejer5.class);
        startActivity(ejer5);
    }
    public void ejer6(View v){
        Intent ejer6 = new Intent(MainActivity.this, Ejer6.class);
        startActivity(ejer6);
    }
    public void ejer7(View v){
        Intent ejer7 = new Intent(MainActivity.this, Ejer7.class);
        startActivity(ejer7);
    }
}

