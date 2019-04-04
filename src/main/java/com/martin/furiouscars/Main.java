package com.martin.furiouscars;

import com.martin.furiouscars.gui.*;
import com.martin.furiouscars.methods.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException{
        FirstGarage firstGarage = new FirstGarage();
        Money money = new Money();
        Deserialization deserialization = new Deserialization();
        deserialization.deserialization(firstGarage);
        Scanner userInput = new Scanner(System.in);
        StoreDesign storeDesign = new StoreDesign();
        RaceDesign raceDesign = new RaceDesign();
        CarDataDesign carDataDesign = new CarDataDesign(userInput);
        GarageDesign garageDesign = new GarageDesign();
        Serialization serialization = new Serialization();
        Main main = new Main();
        MainMenu mainmenu = new MainMenu(userInput,storeDesign,raceDesign,carDataDesign,garageDesign,serialization,deserialization,main,firstGarage,money);
        MyCar myCar = new MyCar("",1);
        //deserialization.deserialization(firstGarage.cars);
        if (firstGarage.cars.size()==0) {
                System.out.println("Name your first car: ");
                String newCarName = userInput.nextLine();
                firstGarage.cars.add(new MyCar(newCarName,1));
            mainmenu.mainMenu();
            } else {
            mainmenu.mainMenu();
        }
    }
}
