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
    Scanner scanner;

    public void raceMenu() throws ParserConfigurationException, SAXException, IOException {

        boolean notQuit = true;
        while (notQuit){
            boolean inWhile = true;
            int index;
            String carName = null;
                while (inWhile) {
                    System.out.println("Select a car to race: ");
                    scanner.nextLine();
                    carName = scanner.nextLine();
                    if(Garage.findCarByName(MyCar.cars,carName)==null){
                        System.out.printf("Car named %s does not exist!", carName);
                    } else {
                        MyCar myCar = Garage.findCarByName(MyCar.cars, carName);
                        inWhile = false;
                    }
                }
            int choice;
            System.out.println("     ___________________");
            System.out.println("     |                 |");
            System.out.println("     |       Race      |");
            System.out.println("     |_________________|");
            System.out.println("          0. Leave");
            System.out.println("        1. Drag Race");
            System.out.println("       2. Visual Race\n");
            System.out.print("Choose an option: ");
            try {
                choice = scanner.nextInt();
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
                        int result = dragRace.Racing(carName);
                        printRaceResult(result);
                    }
                    break;
                case 2:
                    if(MyCar.money<100) {
                        System.out.println("Sorry, but you don't have enough money for this!");
                    } else {
                        VisualRace visualRace = new VisualRace();
                        printVRaceResult(visualRace.vRace(visualRace.booleanGenerator()));
                    }
                    break;
                default:
                    System.out.println("Please type a correct number!");
            }
        }
    }
    public void printRaceResult(Integer result){
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
    public void printVRaceResult(boolean result) {

        if (result) {
            System.out.println("You win!");
            System.out.printf("Current balance: $%s\n", MyCar.money);
        } else {
            System.out.println("You lose!");
            System.out.printf("Current balance: $%s\n", MyCar.money);
        }
    }
}
