package com.ava4.bikeibmecprojeto1.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ava4.bikeibmecprojeto1.R;
import com.ava4.bikeibmecprojeto1.model.milhas.MilhasPost;

import java.util.List;


public class MilhasAdapter extends RecyclerView.Adapter<MilhasAdapter.MyViewHolder> {

    private List<MilhasPost> milhasList;

    public MilhasAdapter(List<MilhasPost> milhasList) {
        this.milhasList = milhasList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View listItem = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_milhas, parent, false);
        return new MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        MilhasPost milhasPost = milhasList.get(position);
        holder.postTitulo.setText(milhasPost.getTitulo());
        holder.postImagem.setImageResource(milhasPost.getImg());
        holder.postDesc.setText(milhasPost.getDesc());
    }

    @Override
    public int getItemCount() {
        return milhasList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView postTitulo;
        ImageView postImagem;
        TextView postDesc;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.postTitulo = itemView.findViewById(R.id.textMilhasTituloPost);
            this.postImagem = itemView.findViewById(R.id.imageMilhasPost);
            this.postDesc = itemView.findViewById(R.id.textMilhasDescPost);;
        }
    }

}
