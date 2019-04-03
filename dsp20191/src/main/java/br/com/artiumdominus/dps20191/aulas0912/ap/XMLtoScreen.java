package br.com.artiumdominus.dps20191.aulas0912.ap;

import java.io.*;
import java.util.*;
import org.dom4j.*;

public class XMLtoScreen {

    public static void main(String[] args) {
        try {
            File inputFile = new File("src/main/resources/students.xml");
            SAXBuilder saxBuilder = new SAXBuilder();
            Document document = saxBuilder.build(inputFile);

            System.out.println("Root element :" + document.getRootElement().getName());

            Element classElement = document.getRootElement();

            List<Node> nodes = document.selectNodes("/class/student");
            System.out.println();

            for (Node node : nodes) {
                System.out.println("\nCurrent Element :" + node.getName());
                System.out.println("Student roll no : " + node.valueOf("@rollno"));
                System.out.println("First Name : " + node.selectSingleNode("firstname").getText());
                System.out.println("Last Name : " + node.selectSingleNode("lastname").getText());
                System.out.println("Nick Name : " + node.selectSingleNode("nickname").getText());
            }

        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

}
