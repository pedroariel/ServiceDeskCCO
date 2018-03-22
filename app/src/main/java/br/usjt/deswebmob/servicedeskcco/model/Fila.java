package br.usjt.deswebmob.servicedeskcco.model;

/**
 * Created by arqdsis on 21/03/2018.
 */

class Fila {

    private int id;
    private String nome, figura;

    public Fila(int id, String nome, String figura) {
        this.id = id;
        this.nome = nome;
        this.figura = figura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public String getFigura() {
        return figura;
    }
}
