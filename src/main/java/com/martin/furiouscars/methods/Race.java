package com.martin.furiouscars.methods;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Random;

public abstract class Race {
    public int enemyCarStat;
    public int myCarStat;

    public abstract int WhoIsTheWinner(String carName, FirstGarage firstGarage, Money money) throws ParserConfigurationException, SAXException, IOException;

}
