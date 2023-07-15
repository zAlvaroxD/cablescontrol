package com.utp.cablescontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etusuario, etcontraseña;
    Button Btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etusuario=(EditText)findViewById(R.id.Txt_usuario);
        etcontraseña=(EditText)findViewById(R.id.Txt_contraseña);
        Btn1=(Button)findViewById(R.id.Btn_Loguear);
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IniciarSesion();
            }
        });

    }

    private void IniciarSesion() {
        if (etusuario.getText().toString().equals("alvaro@gmail.com")&& etcontraseña.getText().toString().equals("123456")){
            Toast.makeText(MainActivity.this, "Bienvenido!", Toast.LENGTH_LONG).show();
            Intent i=new  Intent(MainActivity.this, Home.class);
            startActivity(i);
        }else{
            Toast.makeText(MainActivity.this, "Error, Error, Eroor, 404, Reinicia tu pc o explotará.",Toast.LENGTH_LONG).show();
        }
    }



}