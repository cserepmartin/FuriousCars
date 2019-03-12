package com.martin.furiouscars.gui;

import com.martin.furiouscars.Main;
import com.martin.furiouscars.methods.MyCar;
import com.martin.furiouscars.methods.Store;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Scanner;

public class StoreDesign {
    public static void storeDesign() throws IOException, SAXException, ParserConfigurationException {
        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
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
                    printEningeResult(store.EngineUpgrade());
                    break;
                case 2:
                    printWeightResult(store.WeightUprgade());
                    break;
                case 3:
                    printGearResult(store.GearUpgrade());
                    break;
                case 4:
                    printTireResult(store.TireUpgrade());
                    break;
                case 5:
                    if(myCar.getMoney() < 200){
                        System.out.println("Sorry, but you don't have enough money for this!");
                    } else {
                        try {
                            System.out.println("       Select a color       ");
                            System.out.println("1. Black | 2. White | 3. Red");
                            System.out.println("4. Blue  | 5. Green | 6. Grey");
                            System.out.println("7. Cyan  | 8. Gold  | 9. Pink");
                            store.Respray();
                            //Main.updateXML("mycar.xml");
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
    public static void printEningeResult(Integer result){
        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        if(result == 0){
            System.out.println("Sorry, but you don't have enough money for this!");
        } else if(result == 1){
            System.out.printf("%s's engine is upgraded to level %s\n", myCar.getCarName(),myCar.getEngine());
        } else if(result == 2){
            System.out.println("You already reached the maximum engine level! Congrats!");
        }
    }
    public static void printWeightResult(Integer result){
        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        if(result == 0){
            System.out.println("Sorry, but you don't have enough money for this!");
        } else if(result == 1){
            System.out.printf("%s's weight level is upgraded to level %s\n", myCar.getCarName(),myCar.getWeight());
        } else if(result == 2){
            System.out.println("You already reached the maximum weight level! Congrats!");
        }
    }
    public static void printGearResult(Integer result){
        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        if(result == 0){
            System.out.println("Sorry, but you don't have enough money for this!");
        } else if(result == 1){
            System.out.printf("%s's gear is upgraded to level %s\n", myCar.getCarName(),myCar.getGear());
        } else if(result == 2){
            System.out.println("You already reached the maximum gear level! Congrats!");
        }
    }
    public static void printTireResult(Integer result){
        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        if(result == 0){
            System.out.println("Sorry, but you don't have enough money for this!");
        } else if(result == 1){
            System.out.printf("%s's tires is upgraded to level %s\n", myCar.getCarName(),myCar.getTires());
        } else if(result == 2){
            System.out.println("You already reached the maximum tire level! Congrats!");
        }
    }
}
