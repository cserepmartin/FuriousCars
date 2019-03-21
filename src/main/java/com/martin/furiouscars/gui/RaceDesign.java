package com.martin.furiouscars.gui;

import com.martin.furiouscars.methods.Garage;
import com.martin.furiouscars.methods.Race;
import com.martin.furiouscars.methods.MyCar;
import com.martin.furiouscars.methods.VisualRace;
import com.martin.furiouscars.methods.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RaceDesign {
    public static void raceMenu() throws ParserConfigurationException, SAXException, IOException {

        boolean notQuit = true;
        while (notQuit){
            int index;
            Scanner userInput = new Scanner(System.in);
            try {
                System.out.println("Select a car to upgrade: ");
                String carName = userInput.nextLine();
                index = MyCar.cars.indexOf(carName);
                MyCar myCar = (MyCar) MyCar.cars.get(index);

            } catch (Exception e) {
                continue;
            }
            int choice;
            String carName = null;
            System.out.println("     ___________________");
            System.out.println("     |                 |");
            System.out.println("     |       Race      |");
            System.out.println("     |_________________|");
            System.out.println("          0. Leave");
            System.out.println("        1. Drag Race");
            System.out.println("       2. Visual Race\n");
            System.out.print("Choose an option: ");
            try {
                choice = userInput.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please type an integer: " + e.getMessage());
                continue;
            }
            switch (choice) {
                case 0:
                    notQuit = false;
                    break;
                case 1:
                    if(MyCar.money<300) {
                        System.out.println("Sorry, but you don't have enough money for this!");
                    } else {
                        Race dragRace = new Race();
                        int result = dragRace.Racing(index);
                        RaceDesign.printRaceResult(result);
                    }
                    break;
                case 2:
                    if(MyCar.money<100) {
                        System.out.println("Sorry, but you don't have enough money for this!");
                    } else {
                        VisualRace visualRace = new VisualRace();
                        printVRaceResult(visualRace.vRace(visualRace.booleanGenerator()),carName);
                    }
                    break;
                default:
                    System.out.println("Please type a correct number!");
            }
        }
    }
    public static void printRaceResult(Integer result){

        Scanner userInput = new Scanner(System.in);
        String carName = userInput.nextLine();
        if(result == 1){
            System.out.println("You win!");
            System.out.printf("Current balance: $%s\n", MyCar.money);
        } else if(result == 2){
            System.out.println("You lose!");
            System.out.printf("Current balance: $%s\n", MyCar.money);
        } else if(result == 10){
            System.out.println("It's a draw!");
        }
    }
    public static void printVRaceResult(boolean result,String carName) {

        MyCar myCar = new MyCar(carName,MyCar.allCar.get(carName));
        if (result) {
            System.out.println("You win!");
            System.out.printf("Current balance: $%s\n", MyCar.money);
        } else {
            System.out.println("You lose!");
            System.out.printf("Current balance: $%s\n", MyCar.money);
        }
    }
}
