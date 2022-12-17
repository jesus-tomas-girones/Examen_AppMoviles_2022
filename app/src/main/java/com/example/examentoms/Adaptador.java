package com.example.examentoms;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

// 6.- RecyclerView
public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    protected List<Naranjas> lista;    // Lista de lugares a mostrar

    public Adaptador(List<Naranjas> lista) {
        this.lista = lista;
    }

    //Creamos nuestro ViewHolder, con los tipos de elementos a modificar
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView variedad, periodo, diametro;
        public ImageView foto; // 7.- Imágenes en RecyclerView

        public ViewHolder(@NonNull View view) {
            super(view);
            variedad = (TextView) view.findViewById(R.id.variedad);
            periodo  = (TextView) view.findViewById(R.id.periodo);
            diametro = (TextView) view.findViewById(R.id.diametro);
            // 7.- Imágenes en RecyclerView
            foto     = (ImageView) view.findViewById(R.id.foto);
        }

        // Personalizamos un ViewHolder a partir de un lugar
        public void personaliza(Naranjas naranjas) {
            variedad.setText(naranjas.getVariedad());
            periodo.setText(String.valueOf(naranjas.getPeriodo()));
            diametro.setText(String.valueOf(naranjas.getDiametro()));
            // 7.- Imágenes en RecyclerView
            if(naranjas.getDiametro()> 6)
                foto.setImageResource(R.drawable.naranja);
            else
                foto.setImageResource(R.drawable.clementina);
            foto.setScaleType(ImageView.ScaleType.FIT_END);
        }
    }

    // Creamos el ViewHolder con la vista de un elemento sin personalizar
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.elemento_lista, parent, false);
        return new ViewHolder(view);
    }

    // Usando como base el ViewHolder y lo personalizamos
    @Override
    public void onBindViewHolder(ViewHolder holder, int posicion) {
        holder.personaliza(lista.get(posicion));
    }

    // Indicamos el número de elementos de la lista
    @Override public int getItemCount() {
        return lista.size();
    }
}
