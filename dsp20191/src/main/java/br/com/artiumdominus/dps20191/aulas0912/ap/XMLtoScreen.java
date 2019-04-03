package br.com.artiumdominus.dps20191.aulas0912.ap;

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

            List<Node> nodes = document.selectNodes("/class/student");
            System.out.println("• • • • • • • • • •");

            for (Node node : nodes) {
                System.out.println("\nCurrent Element :"
                        + node.getName());
                System.out.println("First Name : "
                        + node.selectSingleNode("firstname").getText());
                System.out.println("Last Name : "
                        + node.selectSingleNode("lastname").getText());
                System.out.println("Nick Name : "
                        + node.selectSingleNode("nickname").getText());
            }

        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

}
