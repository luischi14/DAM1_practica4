package com.example.dam1_practica4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Aniobisiesto extends AppCompatActivity {
    EditText An;
    Button ve;
    TextView res;
    AlertDialog.Builder dialogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aniobisiesto);

        An = (EditText) findViewById(R.id.edtxtAn);
        ve = (Button) findViewById(R.id.btnVer);
        res = (TextView) findViewById(R.id.resul);

        ve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ve.getText().toString().equals("Limpiar")){
                    An.setText("");
                    res.setText("");
                    An.setEnabled(true);
                    An.requestFocus();
                    ve.setText("Verificar");
                }else{
                    if(An.getText().length() == 0){
                        dialogo = new AlertDialog.Builder(Aniobisiesto.this);
                        dialogo.setTitle("Error");
                        dialogo.setMessage("Debe ingresar el cociente 'año'");
                        dialogo.setCancelable(false);
                        dialogo.setPositiveButton("Cerrar", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogo, int id) {
                                dialogo.cancel();
                                An.setText("");
                                An.requestFocus();
                            }
                        });
                        dialogo.show();
                    }else{
                        int a = Integer.parseInt(An.getText().toString());
                        if(a % 4 == 0  &&  (a % 100 != 0  ||  a % 400 == 0)){
                            res.setText("El año " + An.getText() + " es bisiesto");
                        }else{
                            res.setText("El año " + An.getText() + " no es bisiesto");
                        }
                    }
                    An.setEnabled(false);
                    ve.setText("Limpiar");
                }
            }
        });
    }
}