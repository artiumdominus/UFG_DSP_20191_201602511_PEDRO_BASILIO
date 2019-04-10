package br.com.artiumdominus.dsp20191.aulas0508.as;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class ManipulaAluno {

    public static void geraAluno() {
        Aluno aluno = new Aluno("Pedro Basilio", 201602511l, 10.0, 9.9);

        try {
            DataOutputStream output = new DataOutputStream(new FileOutputStream("src/main/resources/avaliacao.dat"));
            output.writeUTF(aluno.getNome());
            output.writeLong(aluno.getMatricula());
            output.writeDouble(aluno.getNota1());
            output.writeDouble(aluno.getNota2());
            output.flush();
            output.close();
            System.out.println("Aluno salvo");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void lerAluno() {
        try {
            DataInputStream input = new DataInputStream(new FileInputStream("src/main/resources/avaliacao.dat"));
            String nome = input.readUTF();
            Long matricula = input.readLong();
            Double nota1 = input.readDouble();
            Double nota2 = input.readDouble();
            Aluno aluno = new Aluno(nome, matricula, nota1, nota2);
            aluno.print();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
