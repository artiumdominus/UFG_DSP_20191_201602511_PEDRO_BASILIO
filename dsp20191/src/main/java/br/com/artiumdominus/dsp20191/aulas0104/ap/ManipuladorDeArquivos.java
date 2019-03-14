package br.com.artiumdominus.dsp20191.aulas0104.ap; /**
 * Created by Pedro Basilio on 13/03/19.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class ManipuladorDeArquivos {

    public static void main(String[] args) throws IOException {
        String path = "src/main/resources/arquivo.txt";
        criador(path);
        escritor(path);
        System.out.println("Conteúdo do arquivo:");
        leitor(path);
    }

    public static void leitor(String path) throws IOException {
        BufferedReader buffer = new BufferedReader(new FileReader(path));
        String linha = "";
        while(true) {
            if (linha != null) {
                System.out.println(linha);
            } else {
                break;
            }
            linha = buffer.readLine();
        }
        buffer.close();
    }

    public static void escritor(String path) throws IOException {
        BufferedWriter buffer = new BufferedWriter(new FileWriter(path));
        String linha = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Entre uma frase: ");
        linha = in.nextLine();
        buffer.append(linha + "\n");
        buffer.close();
    }

    public static void criador(String path) throws IOException {
        File file = new File(path);
        file.createNewFile();
    }

}
