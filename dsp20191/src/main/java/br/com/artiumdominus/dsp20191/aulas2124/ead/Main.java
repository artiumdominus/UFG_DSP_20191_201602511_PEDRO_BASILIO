package br.com.artiumdominus.dsp20191.aulas2124.ead;

import br.com.artiumdominus.dsp20191.aulas2124.ead.Aluno;

public class Main {

    public static void main(String[] args) {
        Aluno alunoInput = new Aluno("Pedro Basilio", 201602511L, "Persistência", 0.8f, 10.0f, 9.0f);
        Empacotamento.gravarArquivoBinario(alunoInput);
        Aluno alunoOutput = Empacotamento.lerArquivoBinario();
    }

}
