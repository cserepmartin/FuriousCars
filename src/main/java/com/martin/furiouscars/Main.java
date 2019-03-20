package com.martin.furiouscars;

import com.martin.furiouscars.methods.MyCar;
//import com.martin.furiouscars.methods.XML;
//import com.sun.tools.javac.util.List;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static com.martin.furiouscars.gui.MainMenu.mainMenu;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException{
        MyCar myCar = new MyCar("",1);
        if (myCar.getCarName().length()==0) {
                System.out.println("Name your first car: ");
                Scanner userInput = new Scanner(System.in);
                String newCarName = userInput.nextLine();
                MyCar.cars.add(new MyCar(newCarName,1));
                mainMenu();
            } else {
            mainMenu();
        }
    }




}
