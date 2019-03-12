package com.martin.furiouscars.gui;

import java.util.Scanner;
import com.martin.furiouscars.methods.Garage;
import com.martin.furiouscars.methods.MyCar;

public class GarageDesign {
    public static void SellParts(){
        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        boolean notQuit = true;
        while (notQuit){
            Garage garage = new Garage();
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
                    printEningeResult(garage.SellEngine());
                    break;
                case 2:
                    printWeightResult(garage.SellWeight());
                    break;
                case 3:
                    printGearResult(garage.SellGear());
                    break;
                case 4:
                    printTireResult(garage.SellTire());
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
            System.out.printf("%s's engine is downgraded to level %s\n", myCar.getCarName(),myCar.getEngine());
        } else if(result == 2){
            System.out.println("You already reached the minimum engine level! Congrats!");
        }
    }
    public static void printWeightResult(Integer result){
        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        if(result == 0){
            System.out.println("Sorry, but you don't have enough money for this!");
        } else if(result == 1){
            System.out.printf("%s's weight level is downgraded to level %s\n", myCar.getCarName(),myCar.getWeight());
        } else if(result == 2){
            System.out.println("You already reached the minimum weight level! Congrats!");
        }
    }
    public static void printGearResult(Integer result){
        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        if(result == 0){
            System.out.println("Sorry, but you don't have enough money for this!");
        } else if(result == 1){
            System.out.printf("%s's gear is downgraded to level %s\n", myCar.getCarName(),myCar.getGear());
        } else if(result == 2){
            System.out.println("You already reached the minimum gear level! Congrats!");
        }
    }
    public static void printTireResult(Integer result){
        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        if(result == 0){
            System.out.println("Sorry, but you don't have enough money for this!");
        } else if(result == 1){
            System.out.printf("%s's tires is downgraded to level %s\n", myCar.getCarName(),myCar.getTires());
        } else if(result == 2){
            System.out.println("You already reached the minimum tire level! Congrats!");
        }
    }
}
