package com.ava4.bikeibmecprojeto1.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.ava4.bikeibmecprojeto1.R;
import com.ava4.bikeibmecprojeto1.adapter.AdapterMarcacoes;
import com.ava4.bikeibmecprojeto1.model.appointment.Marcacao;

import java.util.ArrayList;
import java.util.List;

public class MarcacaoActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Marcacao> marcacaoList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcacao);

        recyclerView = findViewById(R.id.recyclerView);

        createMarcacaos();
        AdapterMarcacoes adapterMarcacoes = new AdapterMarcacoes(marcacaoList);


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration( new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapterMarcacoes);
    }

    public void createMarcacaos(){
        marcacaoList.add( new Marcacao("Pedalada em grupo", "14:00", "30/05/2022"));
        marcacaoList.add( new Marcacao("Exame fisico", "09:00", "06/06/2022"));
        marcacaoList.add( new Marcacao("Exibição de bikes", "19:00", "15/07/2022"));
        marcacaoList.add( new Marcacao("Pedalada na serra em grupo", "06:00", "05/08/2022"));
    }
}