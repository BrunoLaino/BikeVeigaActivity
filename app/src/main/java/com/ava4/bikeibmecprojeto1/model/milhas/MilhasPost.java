package com.ava4.bikeibmecprojeto1.model.milhas;

public class MilhasPost {

    private String titulo;
    private String desc;
    private int img;

    public MilhasPost() {
    }

    public MilhasPost(String titulo, String desc, int img) {
        this.titulo = titulo;
        this.desc = desc;
        this.img = img;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
