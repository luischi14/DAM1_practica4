package com.example.dam1_practica4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class multiplicar extends AppCompatActivity {
    private EditText Num, Sal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicar);
        Num = (EditText) findViewById(R.id.entnumero);
        Sal = (EditText) findViewById(R.id.Resultado);
    }
    public void cal (View v){
        String c = "";
        if (Num.getText().toString().equals("")) {
            Toast.makeText(this, "Ingrese un numero", Toast.LENGTH_LONG).show();
        }
        else {
            int n = Integer.parseInt(Num.getText().toString());
            for (int i = 1; i <= 10; i++) {
                c += String.valueOf(n) + "\t x \t" + i + "\t = \t" + (n * i) + "\n";
            }
            Sal.setText(c);
        }
    }
}