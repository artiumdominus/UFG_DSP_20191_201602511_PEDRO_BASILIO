package br.com.artiumdominus.dsp2019.aulas1316.ap.model;

public class Departamento {

    private String id;
    private String nome;

    public Departamento(){};

    public Departamento(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
