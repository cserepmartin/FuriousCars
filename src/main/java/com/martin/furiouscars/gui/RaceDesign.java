package com.martin.furiouscars.gui;

import com.martin.furiouscars.methods.Garage;
import com.martin.furiouscars.methods.Race;
import com.martin.furiouscars.methods.MyCar;
import com.martin.furiouscars.methods.VisualRace;
import com.martin.furiouscars.methods.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Scanner;

public class RaceDesign {
    public static void raceMenu() throws ParserConfigurationException, SAXException, IOException {
        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        boolean notQuit = true;
        while (notQuit){
            int choice = 312312;
            System.out.println("     ___________________");
            System.out.println("     |                 |");
            System.out.println("     |      Garage     |");
            System.out.println("     |_________________|");
            System.out.println("          0. Leave");
            System.out.println("        1. Drag Race");
            System.out.println("       2. Visual Race\n");
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
                    if(myCar.getMoney()<300) {
                        System.out.println("Sorry, but you don't have enough money for this!");
                    } else {
                        Race dragRace = new Race();
                        int result = dragRace.Racing();
                        RaceDesign.printRaceResult(result);
                    }
                    break;
                case 2:
                    if(myCar.getMoney()<100) {
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
    public static void printRaceResult(Integer result){

        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        if(result == 1){
            System.out.println("You win!");
            System.out.printf("Current balance: $%s\n", myCar.getMoney());
        } else if(result == 2){
            System.out.println("You lose!");
            System.out.printf("Current balance: $%s\n", myCar.getMoney());
        } else if(result == 10){
            System.out.println("It's a draw!");
        }
    }
    public static void printVRaceResult(boolean result) {

        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()), MyCar.cars.get(1).toString(), MyCar.cars.get(2).toString(), Integer.parseInt(MyCar.cars.get(3).toString()), Integer.parseInt(MyCar.cars.get(4).toString()), Integer.parseInt(MyCar.cars.get(5).toString()), Integer.parseInt(MyCar.cars.get(6).toString()));
        if (result) {
            System.out.println("You win!");
            System.out.printf("Current balance: $%s\n", myCar.getMoney());
        } else {
            System.out.println("You lose!");
            System.out.printf("Current balance: $%s\n", myCar.getMoney());
        }
    }
}
