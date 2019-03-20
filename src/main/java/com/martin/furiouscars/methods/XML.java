/*package com.martin.furiouscars.methods;

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
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XML {
    public static void updateCarList (Integer money, String name, String color, Integer engine, Integer weight, Integer gear, Integer tire){
        MyCar.cars.clear();
        MyCar.cars.add(money);
        MyCar.cars.add(name);
        MyCar.cars.add(color);
        MyCar.cars.add(engine);
        MyCar.cars.add(weight);
        MyCar.cars.add(gear);
        MyCar.cars.add(tire);
    }
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
        //Add to list
        MyCar.cars.add(carElement.getElementsByTagName("money").item(0).getTextContent());
        MyCar.cars.add(carElement.getElementsByTagName("name").item(0).getTextContent());
        MyCar.cars.add(carElement.getElementsByTagName("color").item(0).getTextContent());
        MyCar.cars.add(carElement.getElementsByTagName("engine").item(0).getTextContent());
        MyCar.cars.add(carElement.getElementsByTagName("weight").item(0).getTextContent());
        MyCar.cars.add(carElement.getElementsByTagName("gear").item(0).getTextContent());
        MyCar.cars.add(carElement.getElementsByTagName("tire").item(0).getTextContent());
        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        myCar.setCarName(carElement.getElementsByTagName("name").item(0).getTextContent());
        myCar.setColor(carElement.getElementsByTagName("color").item(0).getTextContent());
        myCar.setMoney(Integer.parseInt(carElement.getElementsByTagName("money").item(0).getTextContent()));
        myCar.setEngine(Integer.parseInt(carElement.getElementsByTagName("engine").item(0).getTextContent()));
        myCar.setGear(Integer.parseInt(carElement.getElementsByTagName("gear").item(0).getTextContent()));
        myCar.setWeight(Integer.parseInt(carElement.getElementsByTagName("weight").item(0).getTextContent()));
        myCar.setTires(Integer.parseInt(carElement.getElementsByTagName("tire").item(0).getTextContent()));

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
        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        carElement.getElementsByTagName("name").item(0);
        carElement.setTextContent(myCar.getCarName());
        carElement.getElementsByTagName("color").item(0);
        carElement.setTextContent(myCar.getColor());
        carElement.getElementsByTagName("money").item(0);
        carElement.setTextContent(String.valueOf(myCar.getMoney()));
        carElement.getElementsByTagName("engine").item(0);
        carElement.setTextContent(String.valueOf(myCar.getEngine()));
        carElement.getElementsByTagName("gear").item(0);
        carElement.setTextContent(String.valueOf(myCar.getGear()));
        carElement.getElementsByTagName("weight").item(0);
        carElement.setTextContent(String.valueOf(myCar.getWeight()));
        carElement.getElementsByTagName("tire").item(0);
        carElement.setTextContent(String.valueOf(myCar.getTires()));

        for (int i = 0; i < carElement.getChildNodes().getLength(); i++) {
            Node node = carElement.getChildNodes().item(i);
            if(node instanceof Element) {
                String name = ((Element) node).getTagName();
            }
        }

        return allCars;
    }
}
*/