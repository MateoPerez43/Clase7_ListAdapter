package com.example.clase7_listadapter;

import android.content.Context;
import android.service.chooser.ChooserTargetService;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class ListAdapter extends BaseAdapter {

    Context Context;
    String [] nombres,mensajes,horaultimomensaje,numerotelefono,pais;
    int[] idImagen;
    LayoutInflater inflater;

    public ListAdapter(Context context,String [] nombres,String [] mensajes,String [] horaultimomensaje,
                       String [] numerotelefono,String [] pais,int[] idImagen){
        this.Context=context;
        this.nombres=nombres;
        this.mensajes=mensajes;
        this.horaultimomensaje=horaultimomensaje;
        this.numerotelefono=numerotelefono;
        this.pais=pais;
        this.idImagen=idImagen;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return nombres.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.list_items, null);
        ImageView fotoPerfil = view.findViewById(R.id.imagenPerfil);
        TextView nombreUsuario = view.findViewById(R.id.nombrePersona);
        TextView ultimoMensaje = view.findViewById(R.id.ultimoMensaje);
        TextView horaMensaje = view.findViewById(R.id.horaMensaje);
        fotoPerfil.setImageResource(idImagen[i]);
        nombreUsuario.setText(nombres[i]);
        ultimoMensaje.setText(mensajes[i]);
        horaMensaje.setText(horaultimomensaje[i]);
        return view;
    }
}
