package com.martin.furiouscars.methods;

import com.martin.furiouscars.Main;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class XML {
    public static List<MyCar> readXML(String xmlFile) throws ParserConfigurationException, IOException, SAXException {
        List<MyCar> allCars = new ArrayList<>();
        InputStream is = Main.class.getResourceAsStream("/"+xmlFile);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse(is);
        Element documentElement = document.getDocumentElement();
        List<Element> allCarNode = new ArrayList<>();
        for (int i = 0; i < documentElement.getChildNodes().getLength(); i++) {
            Node node = documentElement.getChildNodes().item(i);
            if(node instanceof  Element){
                allCarNode.add((Element)node);
            }
        }
        Element carElement = allCarNode.get(0);
        MyCar.carName = carElement.getElementsByTagName("name").item(0).getTextContent();
        MyCar.color = carElement.getElementsByTagName("color").item(0).getTextContent();
        MyCar.money = Integer.parseInt(carElement.getElementsByTagName("money").item(0).getTextContent());
        MyCar.engine = Integer.parseInt(carElement.getElementsByTagName("engine").item(0).getTextContent());
        MyCar.gear = Integer.parseInt(carElement.getElementsByTagName("gear").item(0).getTextContent());
        MyCar.weight = Integer.parseInt(carElement.getElementsByTagName("weight").item(0).getTextContent());
        MyCar.tires = Integer.parseInt(carElement.getElementsByTagName("tire").item(0).getTextContent());
        for (int i = 0; i < carElement.getChildNodes().getLength(); i++) {
            Node node = carElement.getChildNodes().item(i);
            if(node instanceof Element) {
                String name = ((Element) node).getTagName();
            }
        }

        return allCars;
    }
    public static List<MyCar> updateXML(String xmlFile) throws ParserConfigurationException, IOException, SAXException {
        List<MyCar> allCars = new ArrayList<>();
        InputStream is = Main.class.getResourceAsStream("/"+xmlFile);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse(is);
        Element documentElement = document.getDocumentElement();
        List<Element> allCarNode = new ArrayList<>();
        for (int i = 0; i < documentElement.getChildNodes().getLength(); i++) {
            Node node = documentElement.getChildNodes().item(i);
            if(node instanceof  Element){
                allCarNode.add((Element)node);
            }
        }
        Element carElement = allCarNode.get(0);
        MyCar.carName = carElement.getElementsByTagName("name").item(0).getTextContent();
        MyCar.color = carElement.getElementsByTagName("color").item(0).getTextContent();
        MyCar.money = Integer.parseInt(carElement.getElementsByTagName("money").item(0).getTextContent());
        MyCar.engine = Integer.parseInt(carElement.getElementsByTagName("engine").item(0).getTextContent());
        MyCar.gear = Integer.parseInt(carElement.getElementsByTagName("gear").item(0).getTextContent());
        MyCar.weight = Integer.parseInt(carElement.getElementsByTagName("weight").item(0).getTextContent());
        MyCar.tires = Integer.parseInt(carElement.getElementsByTagName("tire").item(0).getTextContent());

        for (int i = 0; i < carElement.getChildNodes().getLength(); i++) {
            Node node = carElement.getChildNodes().item(i);
            if(node instanceof Element) {
                String name = ((Element) node).getTagName();
            }
        }

        return allCars;
    }
}
