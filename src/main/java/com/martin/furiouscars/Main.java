package com.martin.furiouscars;

import com.martin.furiouscars.gui.*;
import com.martin.furiouscars.methods.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Money money = new Money();
        RaceModelling raceModelling = new RaceModelling();
        Deserialization deserialization = new Deserialization();
        try {
            deserialization.deserialization(raceModelling);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Scanner userInput = new Scanner(System.in);
        StoreDesign storeDesign = new StoreDesign();
        RaceDesign raceDesign = new RaceDesign();
        CarDataDesign carDataDesign = new CarDataDesign(userInput);
        GarageDesign garageDesign = new GarageDesign();
        Serialization serialization = new Serialization();
        Main main = new Main();
        MainMenu mainmenu = new MainMenu(userInput,storeDesign,raceDesign,carDataDesign,garageDesign,serialization,deserialization,main,garage,money,raceModelling);
        MyCar myCar = new MyCar("",1);
        //deserialization.deserialization(firstGarage.cars);
        if (raceModelling.garages.size()==0) {
            System.out.println("You don't have garage yet. Please buy one!");
            System.out.println("Name your first garage: ");
            String newGarageName = userInput.nextLine();
            garage.buyGarage(newGarageName,money,raceModelling);
            System.out.println("Now buy your first car!");
            System.out.println("Name your first car: ");
            String newCarName = userInput.nextLine();
            raceModelling.garages.get(newGarageName).add(new MyCar(newCarName,1));
            System.out.println(raceModelling.garages);
            mainmenu.mainMenu();
            } else {
            mainmenu.mainMenu();
        }
    }
}
