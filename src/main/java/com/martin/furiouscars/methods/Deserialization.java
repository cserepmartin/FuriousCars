package com.martin.furiouscars.methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Deserialization {
    public void deserialization(ArrayList cars){
            try {
                FileInputStream fileIn = new FileInputStream("/tmp/cars.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                cars = (ArrayList) in.readObject();
                in.close();
                fileIn.close();
            } catch (FileNotFoundException e) {
                System.out.println("You don't have save yet.\nCreating new game...");
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
    }
}
