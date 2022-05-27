package com.ava4.bikeibmecprojeto1.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ava4.bikeibmecprojeto1.R;
import com.ava4.bikeibmecprojeto1.model.appointment.Marcacao;

import java.util.List;


public class AdapterMarcacoes extends RecyclerView.Adapter<AdapterMarcacoes.MyViewHolder> {

    private List<Marcacao> marcacaoList;

    public AdapterMarcacoes(List<Marcacao> marcacaoList) {
        this.marcacaoList = marcacaoList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View listItem = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_marcacoes, parent, false);
        return new MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Marcacao marcacao = marcacaoList.get(position);
        holder.titulo.setText(marcacao.getTitulo());
        holder.data.setText(marcacao.getData());
        holder.hora.setText(marcacao.getHora());
    }

    @Override
    public int getItemCount() {
        return marcacaoList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView titulo;
        TextView data;
        TextView hora;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.textTitulo);
            data = itemView.findViewById(R.id.textData);
            hora = itemView.findViewById(R.id.textHora);
        }
    }

}
