package com.ava4.bikeibmecprojeto1.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import android.widget.RadioButton;

import com.ava4.bikeibmecprojeto1.R;
import com.ava4.bikeibmecprojeto1.model.user.CreditCard;
import com.ava4.bikeibmecprojeto1.model.user.User;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

public class CadastroDadosPessoaisActitvity extends AppCompatActivity {

    private TextInputEditText campoNome, campoSobrenome, campoCelular, campoEmail, numeroCartao, titularCartao,validadeCartao, cvCartao;
    private RadioButton sexoMasculino, sexoFeminio, cartãoMasterCard,cartãoVisa;
    private CheckBox checkBoxComputacao, checkBoxCivil, checkBoxProducao, checkBoxMecanica;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_dados_pessoais_actitvity);

        //Usuario

        //Text
        campoNome = findViewById(R.id.textInputEditName);
        campoSobrenome = findViewById(R.id.textInputEditeSobrenome);
        campoCelular = findViewById(R.id.textInputEditeCelular);
        campoEmail = findViewById(R.id.textInputEditeEmail);

        //RadioButton Sexo
        sexoMasculino = findViewById(R.id.radioButtonM);
        sexoFeminio = findViewById(R.id.radioButtonF);

        //Checkbox
        checkBoxComputacao = findViewById(R.id.checkBoxComputacao);
        checkBoxCivil = findViewById(R.id.checkBoxCivil);
        checkBoxMecanica = findViewById(R.id.checkBoxMecanica);
        checkBoxProducao = findViewById(R.id.checkBoxProducao);

        //Cartão

        //RadioButton bandeira do cartão
        cartãoMasterCard = findViewById(R.id.radioButtonMasterCard);
        cartãoVisa = findViewById(R.id.radioButtonVisa);

        //Text
        numeroCartao = findViewById(R.id.textInputEditeCartaoNumero);
        titularCartao = findViewById(R.id.textInputEditeCartaoTitular);
        validadeCartao = findViewById(R.id.textInputEditeCartaoValidade);
        cvCartao = findViewById(R.id.textInputEditeCartaoCv);



    }

    public void cadastrar(View view){

        Intent intent = new Intent(getApplicationContext(), CadastroConfirmacaoActitvity.class);
        intent.putExtra("user", createUser());
        startActivity( intent );

    }

    public User createUser(){

        CreditCard creditCard = new CreditCard(radioButtonBandeiraCartao(), numeroCartao.getText().toString()
                , titularCartao.getText().toString(), validadeCartao.getText().toString(), cvCartao.getText().toString());

        return new User(campoNome.getText().toString(),campoSobrenome.getText().toString(), radioButtonSexo(),
                checkBoxCurso(), campoCelular.getText().toString(), campoEmail.getText().toString(), creditCard);
    }

    public ArrayList<String> checkBoxCurso(){
        ArrayList<String> cursos = new ArrayList<String>();
         if (checkBoxComputacao.isChecked()){
             cursos.add(checkBoxComputacao.getText().toString());
         }
        if (checkBoxCivil.isChecked()){
            cursos.add(checkBoxCivil.getText().toString());
        }
        if (checkBoxMecanica.isChecked()){
            cursos.add(checkBoxMecanica.getText().toString());
        }
        if (checkBoxProducao.isChecked()){
            cursos.add(checkBoxProducao.getText().toString());
        }

        return cursos;

    }

    public String radioButtonSexo(){

        if (sexoMasculino.isChecked()){
            return sexoMasculino.getText().toString();
        }else{
            return sexoFeminio.getText().toString();
        }
    }

    public String radioButtonBandeiraCartao(){

        if (cartãoMasterCard.isChecked()){
            return cartãoMasterCard.getText().toString();
        }else{
            return cartãoVisa.getText().toString();
        }
    }
}