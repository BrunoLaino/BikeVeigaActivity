package com.ava4.bikeibmecprojeto1.user;

import java.io.Serializable;

public class CreditCard implements Serializable {

    private String bandeira;
    private String numero;
    private String titular;
    private String validade;
    private String cv;


    public CreditCard(String bandeira, String numero, String titular, String validade, String cv) {
        this.bandeira = bandeira;
        this.numero = numero;
        this.titular = titular;
        this.validade = validade;
        this.cv = cv;
    }

    public CreditCard() {
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }
}
