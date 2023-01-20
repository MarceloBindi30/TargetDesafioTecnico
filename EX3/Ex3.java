package EX3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){

        try {
            File myObj = new File("EX3/dados.json");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.next();
              if(data.equals("},") || data.equals("{") || data.equals("dia") || data.equals(""valor:"")){
                System.out.println(data);
              }
              
            }
        myReader.close();
        } 
        catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
        }
    }
}

/*
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;   
         try {
            File arquuivoXML = new File("EX3/dados (2).xml");
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse(arquuivoXML);
            System.out.println("Root element: "+ document.getDocumentElement().getNodeName());
            
            if (document.hasChildNodes()) {
                printNodeList(document.getChildNodes());
            }

        } catch (Exception e) {

        }

    }

    private static void printNodeList(NodeList nodeList) {
        for (int count = 0; count < nodeList.getLength(); count++) {
            Node elemNode = nodeList.item(count);
            if (elemNode.getNodeType() == Node.ELEMENT_NODE) {
                // get node name and value
                System.out.println("\nNode Name =" + elemNode.getNodeName() + " [OPEN]");
                System.out.println("Node Content =" + elemNode.getTextContent());
                if (elemNode.hasAttributes()) {
                    NamedNodeMap nodeMap = elemNode.getAttributes();
                    for (int i = 0; i < nodeMap.getLength(); i++) {
                        Node node = nodeMap.item(i);
                        System.out.println("attr name : " + node.getNodeName());
                        System.out.println("attr value : " + node.getNodeValue());
                    }
                }
                if (elemNode.hasChildNodes()) {
                    //recursive call if the node has child nodes
                    printNodeList(elemNode.getChildNodes());
                }
                System.out.println("Node Name =" + elemNode.getNodeName() + " [CLOSE]");
            }
        }
    }
 */