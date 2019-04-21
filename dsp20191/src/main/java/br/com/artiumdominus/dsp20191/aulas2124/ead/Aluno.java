package br.com.artiumdominus.dsp20191.aulas2124.ead;

import java.io.Serializable;

public class Aluno implements Serializable {

    String nome;
    Long matricula;
    String disciplina;
    Float frequencia;
    Float nota1;
    Float nota2;

    public Aluno() {}

    public Aluno(String nome, Long matricula, String disciplina, Float frequencia, Float nota1, Float nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplina = disciplina;
        this.frequencia = frequencia;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Float getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(Float frequencia) {
        this.frequencia = frequencia;
    }

    public Float getNota1() {
        return nota1;
    }

    public void setNota1(Float nota1) {
        this.nota1 = nota1;
    }

    public Float getNota2() {
        return nota2;
    }

    public void setNota2(Float nota2) {
        this.nota2 = nota2;
    }

    public String avaliacao() {
        if ((nota1 + nota2) / 2 >= 6.0 && frequencia >= 0.75) {
            return "aprovado";
        }
        return "reprovado";
    }
}
