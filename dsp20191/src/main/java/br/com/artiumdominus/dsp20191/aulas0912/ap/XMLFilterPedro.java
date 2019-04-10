package br.com.artiumdominus.dsp20191.aulas0912.ap;

import java.io.*;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class XMLFilterPedro {

    public static void main(String[] args) {

        try {
            File inputFile = new File("src/main/resources/students.xml");
            SAXReader reader = new SAXReader();
            Document document = reader.read(inputFile);

            System.out.println("Root element :" + document.getRootElement().getName());

            Element classElement = document.getRootElement();

            Node student = document.selectSingleNode("/class/student[matricula = 201602511]");

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

            Document outputDocument = DocumentHelper.createDocument();
            Element root = outputDocument.addElement("student");
            root.addElement("matricula").addText(student.selectSingleNode("matricula").getText());
            root.addElement("firstname").addText(student.selectSingleNode("firstname").getText());
            root.addElement("lastname").addText(student.selectSingleNode("lastname").getText());
            root.addElement("nickname").addText(student.selectSingleNode("nickname").getText());
            Element frequencia = root.addElement("frequencia");
            for (Node aula : aulas) {
                frequencia.addElement("aulas")
                        .addAttribute("numero", aula.valueOf("@numero")).addText(aula.getText());
            }

            OutputFormat format = OutputFormat.createPrettyPrint();
            XMLWriter writer;

            File file = new File("src/main/resources/201602511.xml");
            if (!file.exists()) {
                file.createNewFile();
            }

            writer = new XMLWriter(new FileOutputStream("src/main/resources/201602511.xml"), format);
            writer.write(outputDocument);

        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
