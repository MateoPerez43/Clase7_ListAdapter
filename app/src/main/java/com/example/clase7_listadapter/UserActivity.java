package com.example.clase7_listadapter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UserActivity extends AppCompatActivity {

    TextView nombreUsuario,ultimoMensaje,horaMensaje,pais,telefono;
    ImageView profile;
    String nombre,mensaje,lpais,ltelefono,hora;
    int foto;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_activity);

        nombreUsuario = findViewById(R.id.nombrePersona);
        ultimoMensaje = findViewById(R.id.ultimoMensaje);
        horaMensaje = findViewById(R.id.horaMensaje);
        pais = findViewById(R.id.pais);
        telefono = findViewById(R.id.telefono);
        profile = findViewById(R.id.imagenPerfil);

        Intent datos = this.getIntent();

       nombre = datos.getStringExtra("nombre");
       mensaje = datos.getStringExtra("mensaje");
       hora = datos.getStringExtra("hora");
       lpais = datos.getStringExtra("pais");
       ltelefono = datos.getStringExtra("telefono");
       foto = datos.getIntExtra("idImagen",R.drawable.img);

       nombreUsuario.setText(nombre);
       ultimoMensaje.setText(mensaje);
       horaMensaje.setText(hora);
       pais.setText(lpais);
       telefono.setText(ltelefono);
       profile.setImageResource(foto);



    }
}
