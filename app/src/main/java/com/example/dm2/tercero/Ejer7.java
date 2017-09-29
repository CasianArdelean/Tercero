package com.example.dm2.tercero;

import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class Ejer7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejer7);
    }

    public void camara1(View v){
        Switch s=(Switch)findViewById(v.getId());

        if(s.isChecked()){
            ImageView im=(ImageView)findViewById(R.id.cam1);
            im.setVisibility(im.VISIBLE);
        }else{
            ImageView im=(ImageView)findViewById(R.id.cam1);
            im.setVisibility(im.INVISIBLE);
        }


    }
    public void luz1(View v){
        Switch s=(Switch)findViewById(v.getId());

        if(s.isChecked()){
            ImageView im=(ImageView)findViewById(R.id.bom1);
            im.setImageResource(R.drawable.bombillaen);
        }else{
            ImageView im=(ImageView)findViewById(R.id.bom1);
            im.setImageResource(R.drawable.bombillaap);
        }
    }
    public void camara2(View v){
        ToggleButton s=(ToggleButton)findViewById(v.getId());

        if(s.isChecked()){
            ImageView im=(ImageView)findViewById(R.id.cam2);
            im.setVisibility(im.VISIBLE);
        }else{
            ImageView im=(ImageView)findViewById(R.id.cam2);
            im.setVisibility(im.INVISIBLE);
        }

    }
    public void luz2(View v){
        ToggleButton s=(ToggleButton)findViewById(v.getId());

        if(s.isChecked()){
            ImageView im=(ImageView)findViewById(R.id.bom2);
            im.setImageResource(R.drawable.bombillaen);
        }else{
            ImageView im=(ImageView)findViewById(R.id.bom2);
            im.setImageResource(R.drawable.bombillaap);
        }
    }

    public void persiana(View v){
        ToggleButton s=(ToggleButton)findViewById(v.getId());
        if(s.isChecked()){
            ImageView im=(ImageView)findViewById(R.id.persiana);
            im.setImageResource(R.drawable.dra2);
            ((TransitionDrawable)im.getDrawable()).startTransition(3000);
        }else{
            ImageView im=(ImageView)findViewById(R.id.persiana);
            im.setImageResource(R.drawable.dra);
            ((TransitionDrawable)im.getDrawable()).startTransition(3000);
        }
    }
}
