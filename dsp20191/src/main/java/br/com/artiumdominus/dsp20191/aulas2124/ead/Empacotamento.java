package br.com.artiumdominus.dsp20191.aulas2124.ead;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Empacotamento {

    static private String nomeArquivo = "src/main/resources/aluno.dat";

    public static void gravarArquivoBinario(Aluno aluno) {
        File arq = new File(nomeArquivo);
        try {
            arq.delete();
            arq.createNewFile();

            ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
            objOutput.writeObject(aluno);
            objOutput.close();
        } catch(IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static Aluno lerArquivoBinario() {
        Aluno aluno = new Aluno();
        try {
            File arq = new File(nomeArquivo);
            if (arq.exists()) {
                ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arq));
                aluno = (Aluno)objInput.readObject();
                objInput.close();
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matricula: " + aluno.getMatricula());
        System.out.println("Disciplina: " + aluno.getDisciplina());
        System.out.println("Frequencia: " + aluno.getFrequencia());
        System.out.println("Nota 1: " + aluno.getNota1());
        System.out.println("Nota 2: " + aluno.getNota2());
        System.out.println("Status: " + aluno.avaliacao());

        return aluno;
    }

}
