package br.com.artiumdominus.dsp20191.aulas0912.ap;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class XMLtoScreen {

    public static void main(String[] args) {

        try {
            File inputFile = new File("src/main/resources/students.xml");
            SAXReader reader = new SAXReader();
            Document document = reader.read(inputFile);

            System.out.println("Root element :" + document.getRootElement().getName());

            Element classElement = document.getRootElement();

            List<Node> students = document.selectNodes("/class/student");
            System.out.println("• • • • • • • • • •");

            for (Node student : students) {
                System.out.println("\nCurrent Element :"
                        + student.getName());
                System.out.println("First Name : "
                        + student.selectSingleNode("firstname").getText());
                System.out.println("Last Name : "
                        + student.selectSingleNode("lastname").getText());
                System.out.println("Nick Name : "
                        + student.selectSingleNode("nickname").getText());
                System.out.println("› Frequencia :");
                List<Node> aulas = student.selectNodes("frequencia/aulas");
                for (Node aula : aulas) {
                    System.out.println("\tAulas " + aula.valueOf("@numero")
                            + " : " + aula.getText());
                }
            }

        } catch (DocumentException e) {
            e.printStackTrace();
        }

    }

}
