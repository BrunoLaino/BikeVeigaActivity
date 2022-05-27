package com.ava4.bikeibmecprojeto1.activity;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.ava4.bikeibmecprojeto1.R;
import com.ava4.bikeibmecprojeto1.model.user.User;

import java.util.List;

public class CadastroConfirmacaoActitvity extends AppCompatActivity {

    private TextView campoNome, campoSobrenome, campoCelular, campoEmail, numeroCartao,
            titularCartao,validadeCartao, bandeiraCartao, cvCartao, sexo, curso;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_confirmacao_actitvity);

        //Usuario
        Bundle bundle = getIntent().getExtras();
        User user = (User) bundle.getSerializable("user");


        //Text
        campoNome = findViewById(R.id.textNome);
        campoSobrenome = findViewById(R.id.textSobrenome);
        campoCelular = findViewById(R.id.textCelular);
        campoEmail = findViewById(R.id.textEmail);

        sexo = findViewById(R.id.textSexo);
        curso = findViewById(R.id.textCurso);

        bandeiraCartao = findViewById(R.id.textCartaoBandeira);
        numeroCartao = findViewById(R.id.textCartaoNumero);
        titularCartao = findViewById(R.id.textCartaoTitular);
        validadeCartao = findViewById(R.id.textCartaoValidade);
        cvCartao = findViewById(R.id.textCartaoCv);

        StringBuilder b = new StringBuilder();
        campoNome.setText("Nome: " + user.getNome());
        campoSobrenome.setText("Sobrenome: " + user.getSobrenome());
        campoCelular.setText("Celular: " + user.getCelular());
        campoEmail.setText("Email: " + user.getEmail());
        sexo.setText("Sexo: " + user.getSexo());
        curso.setText("Curso(s): " + formatCurso(user.getCurso()));

        bandeiraCartao.setText("Bandeira: " + user.getCreditCard().getBandeira());
        numeroCartao.setText("Numero: " + user.getCreditCard().getNumero());
        titularCartao.setText("Titular: " + user.getCreditCard().getTitular());
        validadeCartao.setText("Validade: " + user.getCreditCard().getValidade());
        cvCartao.setText("Código de Segurança: " + user.getCreditCard().getValidade());
    }

    private String formatCurso (List<String> cursos){
        String output = "";
        if (cursos.size() == 1) {
            return cursos.get(0);
        }
        for (int i = 0; i < cursos.size() - 1; i++){
            if(i == 0)
                output = output + cursos.get(i);

            output = output + ", " + cursos.get(i);
        }
        return output;
    }

    public void corrigirButton(View view){
        finish();
    }

    public void confirmarButton(View view) {
        confirmacaoCadastroToast();
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    private void confirmacaoCadastroToast(){
        Toast.makeText(getApplicationContext(),"Dados Corretos!", Toast.LENGTH_SHORT).show();
    }
}