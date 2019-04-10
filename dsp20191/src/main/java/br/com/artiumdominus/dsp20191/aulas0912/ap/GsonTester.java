package br.com.artiumdominus.dsp20191.aulas0912.ap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonTester {

    public static void main(String[] args) {
        String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";

        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();

        Studentx student = gson.fromJson(jsonString, Studentx.class);
        System.out.println(student);

        System.out.println(gson.toJson(student));

    }

}

class Studentx {
    private String name;
    private int age;
    public Studentx(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student [ name " + name + ", age: " + age + " ]";
    }
}
