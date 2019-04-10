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
        Money money = new Money();
        RaceModelling raceModelling;
        Map<String,ArrayList<MyCar>> garages = new HashMap<>();
        raceModelling = new RaceModelling( garages,900);
        try {
            FileInputStream fileIn = new FileInputStream("cars.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            raceModelling = (RaceModelling) in.readObject();
            in.close();
            fileIn.close();

        } catch (InvalidClassException e){
            System.out.println("");
        }
        catch (StreamCorruptedException e) {
            System.out.printf("Your save file is damaged! Error: %s \n Creating new game...\n",e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Welcome new little racer!");
            e.getMessage();
        }
        catch (IOException e) {
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
        MainMenu mainmenu = new MainMenu(userInput,storeDesign,raceDesign,carDataDesign,garageDesign,serialization,main,money,raceModelling);
        //MyCar myCar = new MyCar("",1);
        if (!raceModelling.hasGarages()) {
            System.out.println("You don't have garage yet. Please buy one!");
            System.out.println("Name your first garage: ");
            String newGarageName = userInput.nextLine();
            try {
                raceModelling.addGarage(newGarageName);
            } catch (RaceModellingException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Now buy your first car!");
            System.out.println("Name your first car: ");
            String newCarName = userInput.nextLine();

            //raceModelling.addCarToGarage(newCarName, newGarageName);
            // or
            Garage garage = raceModelling.findByName(newGarageName);
            garage.buyCar(newCarName,raceModelling,newGarageName);
        }
        mainmenu.mainMenu();
    }
}
