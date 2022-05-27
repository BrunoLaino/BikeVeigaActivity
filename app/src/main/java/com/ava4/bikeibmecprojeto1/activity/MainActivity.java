package com.ava4.bikeibmecprojeto1.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ava4.bikeibmecprojeto1.R;

public class MainActivity extends AppCompatActivity {

    public Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void cadastrar(View view) {
        Intent intent = new Intent(getApplicationContext(), CadastroDadosPessoaisActitvity.class);
        startActivity(intent);
    }

    public void pedaladas(View view) {
        Intent intent = new Intent(getApplicationContext(), PedaladasActivity.class);
        startActivity(intent);
    }

    public void marcacao(View view) {
        Intent intent = new Intent(getApplicationContext(), MarcacaoActivity.class);
        startActivity(intent);
    }


    public void milhas(View view) {
        Intent intent = new Intent(getApplicationContext(), MilhasActivity.class);
        startActivity(intent);
    }

}