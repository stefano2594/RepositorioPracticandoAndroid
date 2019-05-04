package com.example.myprimeraaplicacin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginprueba extends AppCompatActivity {
    private EditText edt1;
    private EditText edt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginprueba);

        edt1=(EditText)findViewById(R.id.usu);
        edt2=(EditText)findViewById(R.id.cont);
        /* otra forma

        String btnlogo =((EditText)findViewById(R.id.btnlog));
        btnlogo.setOnClickListener(new View.OnClickListener(){
        @override
        public void onClick(View view){
        String usuario =((EditText)findViewById(R.id.usu));
        String contraseña =((EditText)findViewById(R.id.cont));
        if(valor1.equals("ste") && valor2.equals("abc")) {
            Intent siguiente = new Intent(this, MainActivity.class);
            startActivity(siguiente);
        }
        else{
            Toast.makeText(this," Contraseña o usuario incorrectos",Toast.LENGTH_LONG).show();
        }
        */
    }
    public void Siguiente(View view){
        String valor1 = edt1.getText().toString();
        String valor2 = edt2.getText().toString();

        if(valor1.equals("ste") && valor2.equals("abc")) {
            Intent siguiente = new Intent(this, MainActivity.class);
            startActivity(siguiente);
        }
        else{
            Toast.makeText(this," Contraseña o usuario incorrectos",Toast.LENGTH_LONG).show();
        }
    }
}
