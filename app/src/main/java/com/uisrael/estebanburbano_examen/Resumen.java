package com.uisrael.estebanburbano_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Resumen extends AppCompatActivity {

    Bundle datoRecibir, datoRecibido3, datoRecibido4, datoRecibido5, datoRecibido6, datoRecibido7, datoRecibido8;
    EditText recibir3, recibir4, recibir5, recibir6, recibir7, recibir8, recibir9;
    TextView nombre,usuario,totalApagar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        nombre = findViewById(R.id.tvNombreRecibido);
        usuario = findViewById(R.id.tvUsuarioRecibido);
        totalApagar = findViewById(R.id.tvTotalApagarRecibido);

        datoRecibir = getIntent().getExtras();
        String RecibiUsuario = datoRecibir.getString("usuario");
        usuario.setText(RecibiUsuario);

        datoRecibir = getIntent().getExtras();
        String RecibirNombre = datoRecibir.getString("nombre");
        nombre.setText(RecibirNombre);

        datoRecibir = getIntent().getExtras();
        String RecibirValor = datoRecibir.getString("totalpagomensual");
        totalApagar.setText(RecibirValor);
        ////////////////////////////////////////////////////////////////////////

        recibir3 = findViewById(R.id.txtCb11);
        datoRecibido3 = getIntent().getExtras();
        String RecibirDato3 = datoRecibido3.getString("datoEnviado6");
        recibir3.setText(RecibirDato3);

        recibir4 = findViewById(R.id.txtCb22);
        datoRecibido4 = getIntent().getExtras();
        String RecibirDato4 = datoRecibido4.getString("datoEnviado7");
        recibir4.setText(RecibirDato4);

        recibir5 = findViewById(R.id.txtCb33);
        datoRecibido5 = getIntent().getExtras();
        String RecibirDato5 = datoRecibido5.getString("datoEnviado8");
        recibir5.setText(RecibirDato5);

        recibir6 = findViewById(R.id.txtRb11);
        datoRecibido6 = getIntent().getExtras();
        String RecibirDato6 = datoRecibido6.getString("datoEnviado4");
        recibir6.setText(RecibirDato6);

        recibir7 = findViewById(R.id.txtRb22);
        datoRecibido7 = getIntent().getExtras();
        String RecibirDato7 = datoRecibido7.getString("datoEnviado5");
        recibir7.setText(RecibirDato7);

        recibir8 = findViewById(R.id.txtRespuesta11);
        datoRecibido8 = getIntent().getExtras();
        String RecibirDato8 = datoRecibido8.getString("datoEnviado3");
        recibir8.setText(RecibirDato8);

    }
}
