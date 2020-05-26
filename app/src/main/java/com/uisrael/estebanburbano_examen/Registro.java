package com.uisrael.estebanburbano_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    EditText txtNombre1, txtMontoIncial1, txtPagoMensual1;
    Bundle datoRecibir;
    TextView usuario;
    Button btnCalcular1, btnGuardar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


        txtNombre1 = findViewById(R.id.txtNombre);
        txtMontoIncial1 = findViewById(R.id.txtMontoInicial);
        txtPagoMensual1 = findViewById(R.id.txtPagoMensual);
        usuario = findViewById(R.id.tvUsuarioRecividoLogin);
        btnCalcular1 = findViewById(R.id.btnCalcular);
        btnGuardar1 = findViewById(R.id.btnGuardar);

        datoRecibir=getIntent().getExtras();
        String recibirDatos=datoRecibir.getString("usuario");
        usuario.setText(recibirDatos);

        btnCalcular1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    double montoInicial, valorTotal = 1800, pagoMensual, subTotal;

                    montoInicial = Double.parseDouble(txtMontoIncial1.getText().toString());
                    subTotal = ((valorTotal - montoInicial) / 3) * 0.05;
                    pagoMensual = subTotal + ((valorTotal - montoInicial) / 3);

                    txtPagoMensual1.setText(Double.toString(pagoMensual));
            }
        });

        btnGuardar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nombre = txtNombre1.getText().toString();
                String totalAPagar =txtPagoMensual1.getText().toString();

                Intent intentEnvio = new Intent(getApplicationContext(), Encuesta.class);
                intentEnvio.putExtra("usuario", usuario.getText().toString());
                intentEnvio.putExtra("nombre", txtNombre1.getText().toString());
                intentEnvio.putExtra("totalpagomensual", txtPagoMensual1.getText().toString());
                startActivity(intentEnvio);
                Toast.makeText(getApplicationContext(),"Usuario guardado", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
