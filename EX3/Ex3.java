package EX3;

import java.io.File;
import java.io.IOException;

import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;   


public class Ex3 {
    public static void main(String[] args) {
        double menorValor;
        double maiorValor = 0;
        double soma = 0;
        int count = 0, j = 0;
        //ArrayList<Month> arrayMonth = new ArrayList<>();
        HashMap<Integer,Double> faturamento = new HashMap<Integer,Double>();
        try {
            File file = new File("EX3/dados.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(file);
            document.getDocumentElement().normalize();
            NodeList nList = document.getElementsByTagName("row");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    Integer dia = Integer.parseInt(eElement.getElementsByTagName("dia").item(0).getTextContent());
                    Double valor = Double.parseDouble(eElement.getElementsByTagName("valor").item(0).getTextContent());
                    faturamento.put(dia, valor);
                }
            }
            menorValor = faturamento.get(1);
            for (int i = 1; i < faturamento.size() - 1; i++) {
                if(faturamento.get(i) != 0){
                    if (menorValor > faturamento.get(i)) {
                        menorValor = faturamento.get(i);
                    }
                    if (maiorValor < faturamento.get(i)) {
                        maiorValor = faturamento.get(i);
                    }
                    soma = faturamento.get(i) + soma;
                }else{
                    j++;
                }
            }

            double mediaMensal = soma / (faturamento.size() - j);

            for (int i = 1; i < faturamento.size() - 1; i++) {
                if (faturamento.get(i) > mediaMensal) {
                    count = 1 + count;
                }
            }
            System.out.println("Maior faturamento: R$"+maiorValor);
            System.out.println("Menor faturamento: R$"+menorValor);
            System.out.println("Dias em que o valor de faturamento foi maior que a média mensal: "+count);
        }
        catch(IOException | ParserConfigurationException | SAXException e) {
            System.out.println(e);
        }
    }
}