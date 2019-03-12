package com.martin.furiouscars;

import com.martin.furiouscars.methods.MyCar;
import com.martin.furiouscars.methods.XML;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Scanner;
import static com.martin.furiouscars.gui.MainMenu.mainMenu;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException{
        XML.readXML("mycar.xml");
        if (MyCar.carName.length()==0) {
                System.out.println("Name your car: ");
                Scanner userInput = new Scanner(System.in);
                String newCarName = userInput.nextLine();
                MyCar.carName = newCarName;
                mainMenu();
            } else {
            mainMenu();
        }
    }




}
