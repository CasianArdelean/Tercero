package com.example.dm2.tercero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Ejer5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer5);
    }

    public void yahoo(View v){
        ImageView foto=(ImageView) findViewById(R.id.foto);
        foto.setImageResource(R.drawable.yahoo);
    }
    public void bing(View v){
        ImageView foto=(ImageView) findViewById(R.id.foto);
        foto.setImageResource(R.drawable.bing);
    }
    public void google(View v){
        ImageView foto=(ImageView) findViewById(R.id.foto);
        foto.setImageResource(R.drawable.google);
    }
}
