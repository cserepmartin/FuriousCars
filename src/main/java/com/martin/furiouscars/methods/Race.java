package com.martin.furiouscars.methods;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public abstract class Race {

    public abstract int WhoIsTheWinner(String carName, Garage garage, RaceModelling raceModelling) throws ParserConfigurationException, SAXException, IOException, OutOfMoneyException;

}
