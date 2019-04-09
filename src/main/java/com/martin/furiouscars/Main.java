package com.martin.furiouscars;

import com.martin.furiouscars.gui.*;
import com.martin.furiouscars.methods.*;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Money money = new Money();
        RaceModelling raceModelling;
        Map<String,ArrayList<MyCar>> garages = new HashMap<>();
        /*File save = new File("car.ser");
        if(save.exists() && !save.isDirectory()) {
            System.out.println("lefut az if");
            raceModelling = new RaceModelling( garages,900);
        } else {
            System.out.println("nem fut le");
            raceModelling = new RaceModelling( garages,900);
        }*/
        raceModelling = new RaceModelling( garages,900);
        try {
            FileInputStream fileIn = new FileInputStream("cars.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            raceModelling = (RaceModelling) in.readObject();
            in.close();
            fileIn.close();
        } catch (StreamCorruptedException e) {
            System.out.printf("Your save file is damaged! Error: %s \n Creating new game...\n",e.getMessage());
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
        MainMenu mainmenu = new MainMenu(userInput,storeDesign,raceDesign,carDataDesign,garageDesign,serialization,main,garage,money,raceModelling);
        MyCar myCar = new MyCar("",1);
        if (raceModelling.garages.size()==0) {
            System.out.println("You don't have garage yet. Please buy one!");
            System.out.println("Name your first garage: ");
            String newGarageName = userInput.nextLine();
            garage.buyGarage(newGarageName,money,raceModelling);
            System.out.println("Now buy your first car!");
            System.out.println("Name your first car: ");
            String newCarName = userInput.nextLine();
            raceModelling.garages.get(newGarageName).add(new MyCar(newCarName,1));
            mainmenu.mainMenu();
            } else {
            mainmenu.mainMenu();
        }
    }
}
