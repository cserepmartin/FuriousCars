package com.martin.furiouscars.methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;

public class Deserialization {
    public void deserialization(RaceModelling raceModelling) throws IOException, ClassNotFoundException {

                FileInputStream fileIn = new FileInputStream("cars.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                raceModelling = (RaceModelling) in.readObject();
                in.close();
                fileIn.close();
    }
}
