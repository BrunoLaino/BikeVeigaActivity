package com.ava4.bikeibmecprojeto1.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.ava4.bikeibmecprojeto1.R;
import com.ava4.bikeibmecprojeto1.adapter.MilhasAdapter;
import com.ava4.bikeibmecprojeto1.model.appointment.Marcacao;
import com.ava4.bikeibmecprojeto1.model.milhas.MilhasPost;

import java.util.ArrayList;
import java.util.List;


public class MilhasActivity extends AppCompatActivity {

    private RecyclerView recyclerMilhas;
    private List<MilhasPost> milhasPostList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milhas);

        recyclerMilhas = findViewById(R.id.recyclerMilhas);


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerMilhas.setLayoutManager(layoutManager);
        recyclerMilhas.setHasFixedSize(true);

        createMilhasPost();
        MilhasAdapter milhasAdapter = new MilhasAdapter(milhasPostList);

        recyclerMilhas.addItemDecoration( new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerMilhas.setAdapter(milhasAdapter);
    }

    public void createMilhasPost(){
        milhasPostList.add( new MilhasPost("Programa de milhas", "Junte milhas e troque por viagens", R.drawable.imagem1));
        milhasPostList.add( new MilhasPost("Dobre a suas milhas!", "Participe da pedalada nas montanhas esse final de semana e ganhe o dobro de milhas", R.drawable.imagem4));
        milhasPostList.add( new MilhasPost("Viajem para Paris com desconto!", "Só hoje desconto de 50% na troca de milhas por uma passagem para Paris!", R.drawable.imagem3));
    }

    public void saibaMaisButton(View view) {
        saibaMaisToast();
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    }

    private void saibaMaisToast(){
        Toast.makeText(getApplicationContext(),"Activity de saiba mais", Toast.LENGTH_SHORT).show();
    }
}