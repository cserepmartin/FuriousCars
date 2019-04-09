package com.martin.furiouscars.methods;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

    public void serialization(RaceModelling raceModelling){
        try {
            FileOutputStream fileOut = new FileOutputStream("cars.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(raceModelling);
            out.close();
            fileOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
