package com.example.myprimeraaplicacin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calcular extends AppCompatActivity {

 private EditText et1;
 private EditText et2;
 private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular);

        et1=(EditText)findViewById(R.id.textnum1);
        et2=(EditText)findViewById(R.id.textnum2);
        tv1=(TextView) findViewById(R.id.textResultado);

    }

    public void Sumar(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma= num1+num2;

        String result =String.valueOf( suma);
        tv1.setText(result);

    }


}
