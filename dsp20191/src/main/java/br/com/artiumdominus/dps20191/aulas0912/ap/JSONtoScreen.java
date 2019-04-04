package br.com.artiumdominus.dps20191.aulas0912.ap;

import com.google.gson.JsonParser;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.BufferedReader;

public class JSONtoScreen {

    public static void main(String[] args) {

        JsonParser parser = new JsonParser();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/students.json"));
            JsonElement root = parser.parse(bufferedReader);
            JsonObject details = root.getAsJsonObject();
            JsonElement classe = details.get("class");
            details = classe.getAsJsonObject();
            System.out.println("Classe");
            JsonArray students = details.getAsJsonArray("student");
            for (JsonElement student : students) {
                details = student.getAsJsonObject();
                System.out.println("\nMatricula : " + details.get("matricula").getAsString());
                System.out.println("First Name : " + details.get("firstname").getAsString());
                System.out.println("Last Name : " + details.get("lastname").getAsString());
                System.out.println("Nick Name : " + details.get("nickname").getAsString());
                System.out.println("› Frequencia :");
                JsonObject frequencia = details.getAsJsonObject("frequencia");
                JsonArray aulas = frequencia.getAsJsonArray("aulas");
                for (JsonElement aula : aulas) {
                    JsonObject auladetails = aula.getAsJsonObject();
                    System.out.println("\tAulas " + auladetails.get("numero").getAsString()
                            + " : " + auladetails.get("#text").getAsString());
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
