package com.uisrael.estebanburbano_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText txtUsuario1, clave1;
    Button btnIngresar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtUsuario1 = (EditText) findViewById(R.id.txtUsuario);
        clave1 = (EditText) findViewById(R.id.txtClave);
        btnIngresar1 = (Button) findViewById(R.id.btnIngresar);

        btnIngresar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usuario = txtUsuario1.getText().toString();
                String clave = clave1.getText().toString();

                if(usuario.equals("estudiante2020") && clave.equals("uisrael2020")){
                    Intent intentEnvio = new Intent(getApplicationContext(), Registro.class);
                    intentEnvio.putExtra("usuario", txtUsuario1.getText().toString());
                    startActivity(intentEnvio);
                }else{

                    Toast.makeText(getApplicationContext(),"Usuario Incorrecto", Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
}
