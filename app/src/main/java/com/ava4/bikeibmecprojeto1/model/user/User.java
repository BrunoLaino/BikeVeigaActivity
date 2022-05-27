package com.ava4.bikeibmecprojeto1.model.user;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    private String nome;
    private String sobrenome;
    private String sexo;
    private List<String> curso;
    private String celular;
    private String email;
    private CreditCard creditCard;

    public User(String nome, String sobrenome, String sexo, List<String> curso, String celular, String email, CreditCard creditCard) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.curso = curso;
        this.celular = celular;
        this.email = email;
        this.creditCard = creditCard;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<String> getCurso() {
        return curso;
    }

    public void setCurso(List<String> curso) {
        this.curso = curso;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
}
