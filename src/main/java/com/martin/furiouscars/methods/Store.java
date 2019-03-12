package com.martin.furiouscars.methods;

import java.util.Scanner;

public class Store {


    public static void EngineUpgrade() {
        if (MyCar.engine < 5) {
            if(MyCar.money< MyCar.engine*100) {
                System.out.println("Sorry, but you don't have enough money for this!");
            } else {
                MyCar.money -= MyCar.engine * 100;
                MyCar.engine += 1;
                System.out.printf("%s's engine is upgraded to level %s\n", MyCar.carName, MyCar.engine);
            }
        } else {
            System.out.println("You already reached the maximum engine level! Congrats!");
        }
    }
    public static void GearUpgrade() {
        if (MyCar.gear < 5) {
            if(MyCar.money< MyCar.gear*100) {
                System.out.println("Sorry, but you don't have enough money for this!");
            } else {
                MyCar.money -= MyCar.gear*100;
                MyCar.gear += 1;
                System.out.printf("%s's engine is upgraded to level %s\n", MyCar.carName, MyCar.gear);
            }
        } else {
            System.out.println("You already reached the maximum engine level! Congrats!");
        }
    }
    public static void WeightUprgade() {
        if (MyCar.weight < 5) {
            if(MyCar.money< MyCar.weight*100) {
                System.out.println("Sorry, but you don't have enough money for this!");
            } else {
                MyCar.money -= MyCar.weight * 100;
                MyCar.weight += 1;
                System.out.printf("%s's engine is upgraded to level %s\n", MyCar.carName, MyCar.weight);
            }
        } else {
            System.out.println("You already reached the maximum engine level! Congrats!");
        }
    }

    public static void TireUpgrade() {
        if (MyCar.tires < 5) {
            if(MyCar.money< MyCar.gear*100) {
                System.out.println("Sorry, but you don't have enough money for this!");
            } else {
                MyCar.money -= MyCar.tires * 100;
                MyCar.tires += 1;
                System.out.printf("%s's engine is upgraded to level %s\n", MyCar.carName, MyCar.tires);
            }
        } else {
            System.out.println("You already reached the maximum engine level! Congrats!");
        }
    }
    public static void Respray() {

        Scanner userInput = new Scanner(System.in);
        int choice = userInput.nextInt();
        switch (choice) {
            case 1:
                MyCar.color = "Black";
                break;
            case 2:
                MyCar.color = "White";
                break;
            case 3:
                MyCar.color = "Red";
                break;
            case 4:
                MyCar.color = "Blue";
                break;
            case 5:
                MyCar.color = "Green";
                break;
            case 6:
                MyCar.color = "Grey";
                break;
            case 7:
                MyCar.color = "Cyan";
                break;
            case 8:
                MyCar.color = "Gold";
                break;
            case 9:
                MyCar.color = "Pink";
                break;
        }
    }



}
