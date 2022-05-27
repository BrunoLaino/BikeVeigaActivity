package com.ava4.bikeibmecprojeto1.model.appointment;

public class Marcacao {

    private String titulo;
    private String hora;
    private String data;

    public Marcacao() {
    }

    public Marcacao(String titulo, String hora, String data) {
        this.titulo = titulo;
        this.hora = hora;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


}
