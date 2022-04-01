package com.example.dam1_practica4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class promedio extends AppCompatActivity {
    EditText et1, et2, et3, et4,et5;
    int promedio, p1, p2, p3, p4, p5 ;
    Button calc;
    private ListView lc;
    ArrayList<String> calificaciones = new ArrayList<>();
    ArrayAdapter<String> adapter;
    String p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promedio);
        et1 = (EditText)findViewById(R.id.txtmat1);
        et2 = (EditText)findViewById(R.id.txtmat2);
        et3 = (EditText)findViewById(R.id.txtmat3);
        et4 = (EditText)findViewById(R.id.txtmat4);
        et5 = (EditText)findViewById(R.id.txtmat5);
        calc = (Button)findViewById(R.id.btn);
        lc = (ListView)findViewById(R.id.Listview);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p1 = Integer.parseInt(et1.getText().toString());
                p2 = Integer.parseInt(et2.getText().toString());
                p3 = Integer.parseInt(et3.getText().toString());
                p4 = Integer.parseInt(et4.getText().toString());
                p5 = Integer.parseInt(et5.getText().toString());
                promedio = (p1 + p2+ p3 + p4 + p5)/5;

                if (TextUtils.isEmpty(et1.getText().toString()) || TextUtils.isEmpty(et2.getText().toString()) || TextUtils.isEmpty(et3.getText().toString()) || TextUtils.isEmpty(et4.getText().toString()) || TextUtils.isEmpty(et5.getText().toString()) ){
                    Toast.makeText(getApplicationContext(),"calificaciones faltantes", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (promedio >=90){
                        p = "Eres buen alumno";
                    }
                    else if (promedio <90 && promedio>=80) {
                        p = "Vas bien pero debes mejorar";
                    }
                    else if (promedio <80 && promedio >=70){
                        p= "Estas aprobando de pansazo" ;
                    }
                    else if (promedio <70){
                        p = "Ya fuiste";
                    }
                    calificaciones.add("su promedio es "+promedio +" " +p);
                    adapter = new ArrayAdapter<>(promedio.this, android.R.layout.simple_list_item_1,calificaciones);
                    lc.setAdapter(adapter);
                }
            }
        });
    }

}