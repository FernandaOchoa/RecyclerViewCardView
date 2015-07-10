package com.example.fernandaochoa.recviewexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Fernanda Ochoa on 09/07/2015.
 */
public class EstructuraAdapter extends RecyclerView.Adapter<EstructuraAdapter.EstructuraViewHolder> {
    private List<EstructuraDatos> items;

    public static class EstructuraViewHolder extends RecyclerView.ViewHolder {
        public ImageView imagen;
        public TextView nombre;
        public TextView cinta;

        public EstructuraViewHolder(View itemView) {
            super(itemView);
            imagen = (ImageView) itemView.findViewById(R.id.imagen);
            nombre = (TextView) itemView.findViewById(R.id.nombre);
            cinta = (TextView) itemView.findViewById(R.id.cinta);
        }
    }

    public EstructuraAdapter(List<EstructuraDatos> items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public EstructuraViewHolder onCreateViewHolder (ViewGroup viewGroup, int i){
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tarjetas,viewGroup,false);
        return  new EstructuraViewHolder(v);
    }

    @Override
    public void onBindViewHolder(EstructuraViewHolder viewHolder,int i){
        viewHolder.imagen.setImageResource(items.get(i).getImagen());
        viewHolder.nombre.setText(items.get(i).getNombre());
        viewHolder.cinta.setText(items.get(i).getCinta());
    }
}

