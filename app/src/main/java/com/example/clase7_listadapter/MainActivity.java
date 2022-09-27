package com.example.clase7_listadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.net.InetSocketAddress;

public class MainActivity extends AppCompatActivity {

    ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] idImagen = {
                R.drawable.img,
                R.drawable.img1,
                R.drawable.img2,
                R.drawable.img3,
                R.drawable.img4,
                R.drawable.img5,
                R.drawable.img6,
                R.drawable.img7,
                R.drawable.img8,
        };

        String[] nombres = {
                "Manuela Muñoz Naranjo",
                "El Firu",
                "Andres C. Osorio",
                "Yamile Perez",
                "Anderson Kardenas",
                "El Michi",
                "El Firulais",
                "Andres Vasquez",
                "Brandon Vidal"
        };

        String[] mensajes = {
                "Tengo dolor de Cabeza",
                "...",
                "Parce una Cochita",
                "Ayudame con una tarea",
                "Se putio Esto",
                "...",
                "...",
                "...",
                "..."
        };

        String[] horaultimomensaje = {
                "15:00",
                "18:00",
                "18:01",
                "18:01",
                "18:01",
                "18:01",
                "18:01",
                "18:01",
                "18:01"
        };
        String[] numerotelefono = {
                "12345",
                "12345",
                "12345",
                "12345",
                "12345",
                "12345",
                "12345",
                "12345",
                "12345"
        };

        String[] pais = {
                "Korea",
                "Colombia",
                "Colombia",
                "Korea",
                "Colombia",
                "Colombia",
                "Colombia",
                "Colombia",
                "Colombia"
        };


        ListAdapter ListAdapter = new ListAdapter(MainActivity.this, nombres, mensajes, horaultimomensaje, numerotelefono, pais, idImagen);
        lista = (ListView) findViewById(R.id.listView);
        lista.setAdapter(ListAdapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent segunda = new Intent(MainActivity.this, UserActivity.class)
                        .putExtra("nombre", nombres[position])
                        .putExtra("mensaje", mensajes[position])
                        .putExtra("hora", horaultimomensaje[position])
                        .putExtra("telefono", numerotelefono[position])
                        .putExtra("pais", pais[position])
                        .putExtra("idImagen", idImagen[position]);
                startActivity(segunda);
            }
        });
    }
}