package com.martin.furiouscars.methods;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serialization {

    public void serialization(ArrayList<MyCar> cars){
        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/cars.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(cars);
            out.close();
            fileOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
