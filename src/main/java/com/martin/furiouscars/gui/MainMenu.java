package com.martin.furiouscars.gui;

import com.martin.furiouscars.Main;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.martin.furiouscars.methods.*;

public class MainMenu {

    Scanner scanner;
    StoreDesign storeDesign;
    RaceDesign raceDesign;
    CarDataDesign carDataDesign;
    GarageDesign garageDesign;
    Serialization serialization;
    Deserialization deserialization;
    Main main;
    FirstGarage firstGarage;
    Money money;

    public MainMenu(Scanner scanner, StoreDesign storeDesign, RaceDesign raceDesign, CarDataDesign carDataDesign, GarageDesign garageDesign, Serialization serialization, Deserialization deserialization, Main main, FirstGarage firstGarage, Money money) {
        this.scanner = scanner;
        this.storeDesign = storeDesign;
        this.raceDesign = raceDesign;
        this.carDataDesign = carDataDesign;
        this.garageDesign = garageDesign;
        this.serialization = serialization;
        this.deserialization = deserialization;
        this.main = main;
        this.firstGarage = firstGarage;
        this.money = money;
    }

    public void mainMenu() throws ParserConfigurationException, SAXException, IOException {
        boolean notQuit=true;
        while (notQuit)  {
            int choice;
            String carName = null;
            System.out.println("     ____________________");
            System.out.println("     |                  |");
            System.out.println("     |   Furious Cars   |");
            System.out.println("     |__________________|");
            System.out.println("           0. Exit");
            if(firstGarage.cars.size()==1){
                System.out.println("          1. My Car");
            } else {
                System.out.println("         1. My Cars");
            }
            System.out.println("           2. Shop");
            System.out.println("          3. Garage");
            System.out.println("           4. Race");
            System.out.println("           5. Save");
            System.out.println("         6. New Game");
            System.out.print("\nChoose an option: ");
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please type an integer: " + e.getMessage());
                continue;
            }

            switch (choice) {
                case 0:
                    serialization.serialization(firstGarage);
                    System.out.println("Saving...");
                    System.out.println("Thanks for playing. Bye");
                    System.exit(1);
                    break;
                case 1:
                    carDataDesign.printCarDatas(firstGarage.cars,money);
                    break;
                case 2:
                    storeDesign.storeDesign(firstGarage,money);
                    break;
                case 3:
                    garageDesign.SellParts(scanner,firstGarage,money);
                    break;
                case 4:
                    Garage garage = new Garage();
                    raceDesign.raceMenu(firstGarage,scanner,money,garage);
                    break;
                case 5:
                    serialization.serialization(firstGarage);
                    break;
                case 6:
                    System.out.println("Are you sure about that? | yes or no |");
                    scanner.nextLine();
                    String inputString = scanner.nextLine();
                    if (inputString.toLowerCase().equals("yes")){
                        System.out.printf("Give a name for your new car: ");
                        String newGameCarName = scanner.nextLine();
                            firstGarage.cars.clear();
                        firstGarage.cars.add(new MyCar(newGameCarName, 1));
                    } else {
                        System.out.println("Okay!");
                    }
                    break;
                default:
                    System.out.println("No such option: " + choice);
                    break;

            }
        }
    }
}
