package com.hybrid_logic.miapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txt_matematicas);
        et2 = (EditText) findViewById(R.id.txt_fisica);
        et3 = (EditText) findViewById(R.id.txt_quimica);
        tv1= (TextView) findViewById(R.id.tv_estatus);
    }

    public void estatus(View view){
        String Matematicas_String = et1.getText().toString();
        String Fisica_String = et2.getText().toString();
        String Quimica_String = et3.getText().toString();

        int Matematicas_int = Integer.parseInt(Matematicas_String);
        int Fisica_int = Integer.parseInt(Fisica_String);
        int Quimica_int = Integer.parseInt(Quimica_String);

        int promedio = (Matematicas_int+Fisica_int+Quimica_int)/3;

        if(promedio>=6){
            tv1.setText("Estatus aprovado con: "+ promedio);

        }else if(promedio<=5){
            tv1.setText("Estatus reprobado con: "+ promedio);



        }

    }

    public void limpiar(View view){
        et1.setText("");
        et2.setText("");
        et3.setText("");
        tv1.setText("Estatus del Alumno");


    }

}