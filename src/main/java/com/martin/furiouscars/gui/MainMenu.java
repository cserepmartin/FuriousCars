package com.martin.furiouscars.gui;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Scanner;
import com.martin.furiouscars.methods.*;

public class MainMenu {
    public static void mainMenu() throws ParserConfigurationException, SAXException, IOException {
        boolean notQuit=true;
        while (notQuit)  {
            MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
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
                    CarDataDesign.printCarDatas();
                    break;
                case 2:
                    StoreDesign.storeDesign();
                    break;
                case 3:
                    GarageDesign.SellParts();
                    break;
                case 4:
                    if(myCar.getMoney()<300) {
                        System.out.println("Sorry, but you don't have enough money for this!");
                    } else {
                        Race race = new Race();
                        int result = race.Racing();
                        RaceDesign.printRaceResult(result);
                    }
                    break;
                case 5:
                    System.out.println("Are you sure about that? | yes or no |");
                    Scanner newUserInput = new Scanner(System.in);
                    String inputString = newUserInput.nextLine();
                    if (inputString.toLowerCase().equals("yes")){

                        String newCarName = newUserInput.nextLine();
                        myCar.NewGame(newCarName);
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
}
