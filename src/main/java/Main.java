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
        Main.readCars("mycar.xml");
        if (MyCar.carName == null) {
            System.out.println("Name your car: ");
            Scanner userInput = new Scanner(System.in);
            String newCarName = userInput.nextLine();
            MyCar.carName = newCarName;
            mainMenu();
        }else {
            mainMenu();
        }
    }
    public static void mainMenu(){
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
                    String inputString = userInput.nextLine();
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
    private static List<MyCar> readCars(String xmlFile) throws ParserConfigurationException, IOException, SAXException {
        List<MyCar> allCars = new ArrayList<>();
        InputStream is = Main.class.getResourceAsStream("/"+xmlFile);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse(is);
        Element documentElement = document.getDocumentElement();
        List<Node> allCarNode = new ArrayList<>();
        for (int i = 0; i < documentElement.getChildNodes().getLength(); i++) {
            Node node = documentElement.getChildNodes().item(i);
            if(node instanceof  Element){
                allCarNode.add(node);
            }
        }
        Node carNode = allCarNode.get(0);
        for (int i = 0; i < carNode.getChildNodes().getLength(); i++) {
            Node node = carNode.getChildNodes().item(i);
            if(node instanceof Element) {
                String name = ((Element) node).getTagName();
                if ("name".equals(name)){
                    System.out.println(node.getTextContent());
                }
            }
        }
        Node carNameNode = carNode.getChildNodes().item(1);
        if (carNameNode instanceof Element) {
            String newCarName =((Element) carNameNode).getTagName();
            if ("name".equals(newCarName)){
                MyCar.carName=carNameNode.getTextContent();
            }
        }
        Node carColorNode = carNode.getChildNodes().item(1);
        if (carColorNode instanceof Element) {
            String newCarColor =((Element) carColorNode).getTagName();
            if ("color".equals(newCarColor)){
                MyCar.carName=carColorNode.getTextContent();
            }
        }
        Node carEngineNode = carNode.getChildNodes().item(3);
        if (carNameNode instanceof Element) {
            String newCarName =((Element) carEngineNode).getTagName();
            if ("engine".equals(newCarName)){
                MyCar.engine = Integer.parseInt(carEngineNode.getNodeValue());
            }
        }
        Node carGearNode = carNode.getChildNodes().item(4);
        if (carGearNode instanceof Element) {
            String newCarName =((Element) carGearNode).getTagName();
            if ("gear".equals(newCarName)){
                MyCar.gear = Integer.parseInt(carGearNode.getNodeValue());
            }
        }
        Node carWeightNode = carNode.getChildNodes().item(5);
        if (carWeightNode instanceof Element) {
            String newCarName =((Element) carWeightNode).getTagName();
            if ("weight".equals(newCarName)){
                MyCar.weight=Integer.parseInt(carWeightNode.getNodeValue());
            }
        }
        Node carTireNode = carNode.getChildNodes().item(6);
        if (carTireNode instanceof Element) {
            String newCarName =((Element) carTireNode).getTagName();
            if ("tire".equals(newCarName)){
                MyCar.tires=Integer.parseInt(carTireNode.getNodeValue());
            }
        }
        return allCars;
    }
}
