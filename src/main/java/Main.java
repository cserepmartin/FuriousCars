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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException{
        Main.readXML("mycar.xml");
        if (MyCar.carName.length()==0) {
                System.out.println("Name your car: ");
                Scanner userInput = new Scanner(System.in);
                String newCarName = userInput.nextLine();
                MyCar.carName = newCarName;
                mainMenu();
            } else {
            mainMenu();
        }
    }
    public static void mainMenu() throws ParserConfigurationException, SAXException, IOException {
        boolean notQuit=true;
        while (notQuit)  {
            int choice = 1432;
            Scanner userInput = new Scanner(System.in);
            System.out.println("     |̅̅̅̅̅̅̅̅̅̅̅̅̅̅̅̅̅̅|");
            System.out.println("     |   Furious Cars   |");
            System.out.println("     |̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶|");
            System.out.println("           0. Exit");
            System.out.println("          1. My Car");
            System.out.println("           2. Shop");
            System.out.println("          3. Garage");
            System.out.println("           4. Race");
            System.out.println("         5. New Game");
            System.out.print("\nChoose an option: ");
            try {
                choice = userInput.nextInt();
            } catch (Exception e) {
                choice = 435;
            }
            switch (choice) {
                case 0:
                    System.out.println("Thanks for playing. Bye");
                    System.exit(1);
                    break;
                case 1:
                    MyCar mycar = new MyCar();
                    mycar.printCarDatas();
                    break;
                case 2:
                    Store store = new Store();
                    store.storeDesign();
                    break;
                case 3:
                    System.out.println("Not implemented yet!");
                    Garage garage = new Garage();
                    garage.SellParts();
                    break;
                case 4:
                    if(MyCar.money<300) {
                        System.out.println("Sorry, but you don't have enough money for this!");
                    } else {
                        Race race = new Race();
                        race.Racing();
                    }
                    break;
                case 5:
                    System.out.println("Are you sure about that? | yes or no |");
                    Scanner newUserInput = new Scanner(System.in);
                    String inputString = newUserInput.nextLine();
                    if (inputString.toLowerCase().equals("yes")){
                        MyCar newGame = new MyCar();
                        newGame.NewGame();
                    } else {
                        System.out.println("Okay!");
                    }
                    break;
                default:
                    System.out.println("Please type a correct number!");
                    break;

            }
        }
    }
    private static List<MyCar> readXML(String xmlFile) throws ParserConfigurationException, IOException, SAXException {
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
