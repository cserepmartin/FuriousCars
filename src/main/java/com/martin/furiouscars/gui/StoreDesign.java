package com.martin.furiouscars.gui;

import com.martin.furiouscars.Main;
import com.martin.furiouscars.methods.MyCar;
import com.martin.furiouscars.methods.Store;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Scanner;

public class StoreDesign {
    public static void storeDesign() throws IOException, SAXException, ParserConfigurationException {
        boolean notQuit = true;
        while (notQuit){
            int choice = 312312;
            Store store = new Store();
            System.out.println("     ____________________");
            System.out.println("     |                  |");
            System.out.println("     |       Store      |");
            System.out.println("     |__________________|");
            System.out.println("          0. Leave");
            System.out.println("      1. Engine upgrade");
            System.out.println("      2. Weight upgrade");
            System.out.println("       3. Gear upgrade");
            System.out.println("       4. Tire upgrade");
            System.out.println("        5. Respray car\n");
            Scanner userInput = new Scanner(System.in);
            System.out.print("Choose an option: ");
            try {
                choice = userInput.nextInt();
            } catch (Exception e) {
                choice = 435;
            }
            switch (choice) {
                case 0:
                    System.out.println("Thanks for visiting us!");
                    notQuit = false;
                    break;
                case 1:
                    store.EngineUpgrade();
                    break;
                case 2:
                    store.WeightUprgade();
                    break;
                case 3:
                    store.GearUpgrade();
                    break;
                case 4:
                    store.TireUpgrade();
                    break;
                case 5:
                    if(MyCar.money < 200){
                        System.out.println("Sorry, but you don't have enough money for this!");
                    } else {
                        try {
                            System.out.println("       Select a color       ");
                            System.out.println("1. Black | 2. White | 3. Red");
                            System.out.println("4. Blue  | 5. Green | 6. Grey");
                            System.out.println("7. Cyan  | 8. Gold  | 9. Pink");
                            store.Respray();
                            //Main.updateXML("mycar.xml");
                        } catch (Exception e){
                            System.out.println("");
                        }
                    }
                    break;
                default:
                    System.out.println("Please type a correct number!");
            }
        }
    }
}
