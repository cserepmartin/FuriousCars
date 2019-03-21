package com.martin.furiouscars.gui;

import com.martin.furiouscars.methods.Garage;
import com.martin.furiouscars.methods.MyCar;
import com.martin.furiouscars.methods.Store;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StoreDesign {
    public static void storeDesign() throws IOException, SAXException, ParserConfigurationException {
        boolean notQuit = true;
        while (notQuit){
            System.out.printf("Select a car to upgrade: ");
            Scanner userInput = new Scanner(System.in);
            String carName = userInput.nextLine();
            Garage garage = new Garage();
            MyCar myCar = garage.findCarByName(MyCar.cars,carName);

            int choice;
            Store store = new Store();
            System.out.println("     ____________________");
            System.out.println("     |                  |");
            System.out.println("     |       Store      |");
            System.out.println("     |__________________|");
            System.out.println("          0. Leave");
            System.out.println("      1. Engine upgrade\n");
            System.out.print("Choose an option: ");
            try {
                choice = userInput.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please type an integer: " + e.getMessage());
                continue;
            }
            switch (choice) {
                case 0:
                    System.out.println("Thanks for visiting us!");
                    notQuit = false;
                    break;
                case 1:
                    printEningeResult(store.EngineUpgrade(carName),carName);
                    break;

                default:
                    System.out.println("Please type a correct number!");
            }
        }
    }
    public static void printEningeResult(Integer result,String carName){
        Garage garage = new Garage();
        MyCar myCar = garage.findCarByName(MyCar.cars,carName);
        if(result == 0){
            System.out.println("Sorry, but you don't have enough money for this!");
        } else if(result == 1){
            System.out.printf("%s's engine is upgraded to level %s\n",myCar.getCarName(),myCar.getEngine());
        } else if(result == 2){
            System.out.println("You already reached the maximum engine level! Congrats!");
        }
    }

}
