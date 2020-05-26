package com.uisrael.estebanburbano_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Encuesta extends AppCompatActivity {

    Bundle datoRecibir;
    EditText respuesta1;
    Button btnEnviar1;
    TextView usuarioRecibido, nombreRecividoParaEnviar, totalRecivido;
    RadioButton rb11, rb22;
    CheckBox cb11, cb22, cb33;
    StringBuffer radioButton1 = new StringBuffer();
    StringBuffer radioButton2 = new StringBuffer();
    StringBuffer checkBox1 = new StringBuffer();
    StringBuffer checkBox2 = new StringBuffer();
    StringBuffer checkBox3 = new StringBuffer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        usuarioRecibido = findViewById(R.id.tvUsuarioRe);
        nombreRecividoParaEnviar = findViewById(R.id.tvNombreRe);
        totalRecivido = findViewById(R.id.tvTotalPagarRe);

        //Para recibir el dato

        datoRecibir = getIntent().getExtras();
        String RecibiUsuario = datoRecibir.getString("usuario");
        usuarioRecibido.setText(RecibiUsuario);

        datoRecibir = getIntent().getExtras();
        String RecibirNombre = datoRecibir.getString("nombre");
        nombreRecividoParaEnviar.setText(RecibirNombre);

        datoRecibir = getIntent().getExtras();
        String RecibirValor = datoRecibir.getString("totalpagomensual");
        totalRecivido.setText(RecibirValor);
        //

        respuesta1 = findViewById(R.id.txtPreguntaUno);

        rb11 = (RadioButton) findViewById(R.id.rb1);
        rb22 = (RadioButton) findViewById(R.id.rb2);


        cb11 = (CheckBox) findViewById(R.id.cbFutbol);
        cb22 = (CheckBox) findViewById(R.id.cbBasquet);
        cb33 = (CheckBox) findViewById(R.id.cbTennis);

        btnEnviar1 = (Button) findViewById(R.id.btnEnviar);

    }

    public void mostrarSeleccionado(){

        if(rb11.isChecked()==true){
            radioButton1.append(rb11.getText().toString()).append(" - ");
        }
        if(rb22.isChecked()==true){
            radioButton2.append(rb22.getText().toString()).append(" - ");

        }
        if(cb11.isChecked()==true){
            checkBox1.append(cb11.getText().toString());
        }
        if(cb22.isChecked()==true){
            checkBox2.append(cb22.getText().toString());
        }
        if(cb33.isChecked()==true) {
            checkBox3.append(cb33.getText().toString());
        }
    }

    public void mostrarDatos(View v){
        mostrarSeleccionado();
        Intent intentEnvio = new Intent(this, Resumen.class);
        intentEnvio.putExtra("usuario", usuarioRecibido.getText().toString());
        intentEnvio.putExtra("nombre", nombreRecividoParaEnviar.getText().toString());
        intentEnvio.putExtra("totalpagomensual", totalRecivido.getText().toString());

        intentEnvio.putExtra("datoEnviado3", respuesta1.getText().toString());
        intentEnvio.putExtra("datoEnviado4", radioButton1.toString());
        intentEnvio.putExtra("datoEnviado5", radioButton2.toString());

        intentEnvio.putExtra("datoEnviado6", checkBox1.toString());
        intentEnvio.putExtra("datoEnviado7", checkBox2.toString());
        intentEnvio.putExtra("datoEnviado8", checkBox3.toString());

        startActivity(intentEnvio);

    }

}
