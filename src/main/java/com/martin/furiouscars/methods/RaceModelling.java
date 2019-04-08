package com.martin.furiouscars.methods;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RaceModelling implements Serializable {
    //List garages = new List();
    public Map<String,ArrayList<MyCar>> garages = new HashMap<>();
    private int money = 0;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean garageIsValid(String garageName, Map<String,ArrayList<MyCar>> garages) {
        if(garages.containsKey(garageName)){
            return true;
        } else {
            return false;
        }
    }
}
