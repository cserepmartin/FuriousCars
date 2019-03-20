package com.martin.furiouscars;

import com.martin.furiouscars.methods.MyCar;
import com.martin.furiouscars.methods.XML;
import com.sun.tools.javac.util.List;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static com.martin.furiouscars.gui.MainMenu.mainMenu;
import static com.martin.furiouscars.methods.MyCar.cars;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException{
        XML.readXML("mycar.xml");
        MyCar myCar = new MyCar(Integer.parseInt(cars.get(0).toString()), cars.get(1).toString(), cars.get(2).toString(),Integer.parseInt(cars.get(3).toString()),Integer.parseInt(cars.get(4).toString()),Integer.parseInt(cars.get(5).toString()),Integer.parseInt(cars.get(6).toString()));
        if (myCar.getCarName().length()==0) {
                System.out.println("Name your car: ");
                Scanner userInput = new Scanner(System.in);
                String newCarName = userInput.nextLine();
                myCar.setCarName(newCarName);
                mainMenu();
            } else {
            mainMenu();
        }
    }




}
