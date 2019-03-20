package com.martin.furiouscars.gui;

import com.martin.furiouscars.Main;
import com.martin.furiouscars.methods.Respray;
import com.martin.furiouscars.methods.XML;

import java.util.Scanner;

public class ResprayDesign {
        public Integer printRespayMenu(){
            try {
                Scanner userInput = new Scanner(System.in);
                System.out.println("       Select a color       ");
                System.out.println("1. Black | 2. White | 3. Red");
                System.out.println("4. Blue  | 5. Green | 6. Grey");
                System.out.println("7. Cyan  | 8. Gold  | 9. Pink");
                int choice = userInput.nextInt();
                return choice;
            } catch (Exception e){
                System.out.println("");
                return 1;
            }
        }
}