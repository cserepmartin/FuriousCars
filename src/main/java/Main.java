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
            int choice = 127;
            Scanner userInput = new Scanner(System.in);
            System.out.println("     ____________________");
            System.out.println("     |                  |");
            System.out.println("     |   Furious Cars   |");
            System.out.println("     |__________________|");
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
                    printCarDatas();
                    break;
                case 2:
                    storeDesign();
                    break;
                case 3:
                    SellParts();
                    break;
                case 4:
                    if(MyCar.money<300) {
                        System.out.println("Sorry, but you don't have enough money for this!");
                    } else {
                        Race race = new Race();
                        int result = race.Racing();
                        if(result == 1){
                            System.out.println("You win!");
                            System.out.printf("Current balance: $%s\n",MyCar.getMoney());
                        } else if(result == 2){
                            System.out.println("You lose!");
                            System.out.printf("Current balance: $%s\n",MyCar.getMoney());
                        } else if(result == 10){
                            System.out.println("It's a draw!");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Are you sure about that? | yes or no |");
                    Scanner newUserInput = new Scanner(System.in);
                    String inputString = newUserInput.nextLine();
                    if (inputString.toLowerCase().equals("yes")){
                        MyCar newGame = new MyCar();
                        String newCarName = newUserInput.nextLine();
                        newGame.NewGame(newCarName);
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
    private static void printCarDatas(){
        System.out.printf("Your balance: $%s\n",MyCar.money);
        System.out.printf("Car name: %s\n",MyCar.carName);
        System.out.printf("Car color: %s\n",MyCar.color);
        System.out.printf("Engine level: %s\n",MyCar.engine);
        System.out.printf("Weight level: %s\n",MyCar.weight);
        System.out.printf("Gear level: %s\n",MyCar.gear);
        System.out.printf("Tires level: %s\n",MyCar.tires);
        System.out.println(" ");
        System.out.println("Press \"ENTER\" to continue");
        Scanner userInput = new Scanner(System.in);
        userInput.nextLine();
    }
    public static void SellParts(){
        Garage garage = new Garage();
        boolean notQuit = true;
        while (notQuit){
            int choice = 312312;
            System.out.println("     ___________________");
            System.out.println("     |                 |");
            System.out.println("     |      Garage     |");
            System.out.println("     |_________________|");
            System.out.println("          0. Leave");
            System.out.println("       1. Sell engine");
            System.out.println("       2. Sell weight");
            System.out.println("        3. Sell gear");
            System.out.println("        4. Sell tire\n");
            Scanner userInput = new Scanner(System.in);
            System.out.print("Choose an option: ");
            try {
                choice = userInput.nextInt();
            } catch (Exception e) {
                choice = 435;
            }
            switch (choice) {
                case 0:
                    notQuit = false;
                    break;
                case 1:
                    int engineResult = garage.SellEngine();
                    if(engineResult == 1){
                        System.out.printf("%s's engine is downgraded to level %s", MyCar.carName, MyCar.engine);
                    } else {
                        System.out.println("This is the minimum level.");
                    }
                    break;
                case 2:
                    int weightResult = garage.SellWeight();
                    if(weightResult == 1){
                        System.out.printf("%s's engine is downgraded to level %s", MyCar.carName, MyCar.weight);
                    } else {
                        System.out.println("This is the minimum level.");
                    }
                    break;
                case 3:
                    int gearResult = garage.SellGear();
                    if (gearResult == 1) {
                        System.out.printf("%s's engine is downgraded to level %s", MyCar.carName, MyCar.gear);
                    } else {
                        System.out.println("This is the minimum level.");
                    }
                    break;
                case 4:
                    int tireResult = garage.SellTire();
                    if (tireResult ==1 ){
                        System.out.printf("%s's engine is downgraded to level %s", MyCar.carName, MyCar.tires);
                    } else {
                        System.out.println("This is the minimum level.");
                    }
                    break;
                default:
                    System.out.println("Please type a correct number!");
            }
        }
    }
    public static void storeDesign() throws IOException, SAXException, ParserConfigurationException {
        boolean notQuit = true;
        while (notQuit){
            int choice = 312312;
            Store store = new Store();
            System.out.println("     ____________________");
            System.out.println("     |                  |");
            System.out.println("     |       Store      |");
            System.out.println("     |__________________|");
            System.out.println("          0. Leave");
            System.out.println("      1. Engine upgrade");
            System.out.println("      2. Weight upgrade");
            System.out.println("       3. Gear upgrade");
            System.out.println("       4. Tire upgrade");
            System.out.println("        5. Respray car\n");
            Scanner userInput = new Scanner(System.in);
            System.out.print("Choose an option: ");
            try {
                choice = userInput.nextInt();
            } catch (Exception e) {
                choice = 435;
            }
            switch (choice) {
                case 0:
                    System.out.println("Thanks for visiting us!");
                    notQuit = false;
                    break;
                case 1:
                    store.EngineUpgrade();
                    break;
                case 2:
                    store.WeightUprgade();
                    break;
                case 3:
                    store.GearUpgrade();
                    break;
                case 4:
                    store.TireUpgrade();
                    break;
                case 5:
                    if(MyCar.money < 200){
                        System.out.println("Sorry, but you don't have enough money for this!");
                    } else {
                        try {
                            System.out.println("       Select a color       ");
                            System.out.println("1. Black | 2. White | 3. Red");
                            System.out.println("4. Blue  | 5. Green | 6. Grey");
                            System.out.println("7. Cyan  | 8. Gold  | 9. Pink");
                            store.Respray();
                            Main main = new Main();
                            main.updateXML("mycar.xml");
                        } catch (Exception e){
                            System.out.println("");
                        }
                    }
                    break;
                default:
                    System.out.println("Please type a correct number!");
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
