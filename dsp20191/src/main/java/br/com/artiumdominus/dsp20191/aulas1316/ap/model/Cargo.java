package br.com.artiumdominus.dsp20191.aulas1316.ap.model;

public class Cargo {

    private Long id;
    private String nome;
    private double salario;

    public Cargo(){};

    public Cargo(Long id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
