package com.example.dam1_practica4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void P1 (View view){
        Intent i = new Intent(this,Aniobisiesto.class);
        startActivity(i);
    }
    public void P2 (View view){
        Intent  i= new Intent(this,array.class);
        startActivity(i);
    }
    public void P3 (View view){
        Intent i = new Intent(this,multiplicar.class);
        startActivity(i);
    }
    public void P4 (View view){
        Intent i = new Intent(this,promedio.class);
        startActivity(i);
    }

}