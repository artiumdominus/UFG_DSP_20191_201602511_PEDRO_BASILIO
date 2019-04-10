package br.com.artiumdominus.dsp20191.aulas0508.as;

public class Aluno {

    private String nome;
    private Long matricula;
    private Double nota1;
    private Double nota2;

    Aluno(String nome, Long matricula, Double nota1, Double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return this.nome;
    }

    public Long getMatricula() {
        return this.matricula;
    }

    public Double getNota1() {
        return this.nota1;
    }

    public Double getNota2() {
        return this.nota2;
    }

    public boolean isAprovado() {
        return (nota1 + nota2) / 2 >= 5.0;
    }

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Nota 1: " + this.nota1);
        System.out.println("Nota 2: " + this.nota2);
        System.out.println("Status: " + (isAprovado() ? "aprovado" : "reprovado"));
    }
}
