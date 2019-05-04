package com.example.myprimeraaplicacin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edt1;
    private EditText edt2;
    private EditText edt3;
    private TextView tv1;

    /*------- Ciclo de vida de una aplicacion movil , sus momentos */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 =(EditText)findViewById(R.id.txt1);
        edt2 =(EditText)findViewById(R.id.txt2);
        edt3 =(EditText)findViewById(R.id.txt3);
        tv1 =(TextView)findViewById(R.id.textResultado);


/*
        int matematicas=5,quimica=5,fisica=5,promedio=0;
        promedio=(matematicas+quimica+fisica)/3;
        if(promedio>=5){
            Toast.makeText(this ,"Aprobado",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this ,"Desaprobado",Toast.LENGTH_SHORT).show();
        }
        */
    }
    public void promedio(View view) {
        String pandroid_String = edt1.getText().toString();
        String csoftware_String = edt2.getText().toString();
        String tesis_String = edt3.getText().toString();

        int pandroid_int = Integer.parseInt(pandroid_String);
        int csoftware_int = Integer.parseInt(csoftware_String);
        int tesis_int = Integer.parseInt(tesis_String);

      int  promedio = (pandroid_int + csoftware_int + tesis_int) / 3;
        if (promedio >= 11) {
            tv1.setText("Estudiante aprobado con promedio " + promedio);

        } else {
            tv1.setText("Estudiante desaprobado con promedio " + promedio);
        }
    }

    // Metodo regresar
    public void salir(View view){
        Intent siguiente2=new Intent(this,loginprueba.class);
        startActivity(siguiente2);
    }
    @Override protected void onStart(){
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    /*-------------- Otros -----------------------------------*/
    /*onResume */
    @Override protected void onResume(){
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }
    /*onPause */
    @Override protected void onPause(){
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }
    /*onStop */
    @Override protected void onStop(){
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }
    /*onRestart */
    @Override protected void onRestart(){
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }
    /*onDestroy */
    @Override protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }

}
