package br.com.artiumdominus.dsp20191.aulas0912.ap;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class XMLFrequencySwitcher {

    public static void main(String[] args) {

        try {
            File inputFile = new File("src/main/resources/students.xml");
            SAXReader reader = new SAXReader();
            Document document = reader.read(inputFile);

            Element classElement = document.getRootElement();

            Node node = document.selectSingleNode("/class/student[matricula = 201602511]/frequencia/aulas[@numero = 0104]");
            Element element = (Element) node;

            if (node.getText() == "A") {
                element.setText("P");
            } else {
                element.setText("A");
            }

            File file = new File("src/main/resources/students_modified.xml");
            if (!file.exists()) {
                file.createNewFile();
            }

            OutputFormat format = OutputFormat.createPrettyPrint();
            XMLWriter writer;
            writer = new XMLWriter(new FileOutputStream("src/main/resources/students_modified.xml"), format);
            writer.write(document);
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
