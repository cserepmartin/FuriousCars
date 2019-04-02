package com.martin.furiouscars.methods;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class DragRace {
    public Integer Racing(int myCarStat, int enemyCarStat,Money money) throws IOException, SAXException, ParserConfigurationException {

        if(myCarStat>enemyCarStat) {
            money.money +=300;
            return 1;
        } else if(myCarStat<enemyCarStat) {
            money.money +=300;
            return 2;
        } else {
            return 0;
        }
    }
}
