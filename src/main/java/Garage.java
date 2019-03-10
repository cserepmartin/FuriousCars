import java.util.Scanner;

public class Garage {


    static Integer SellEngine() {
        if (MyCar.engine > 1) {
                MyCar.money += MyCar.engine * 50;
                MyCar.engine -= 1;
                return 1;
        } else {
            return 0;
        }
    }
    static Integer SellGear() {
        if (MyCar.gear > 1) {
                MyCar.money += MyCar.gear*100;
                MyCar.gear -= 1;
                return 1;
        } else {
            return 0;
        }
    }
    static Integer SellWeight() {
        if (MyCar.weight > 1) {
                MyCar.money += MyCar.weight * 100;
                MyCar.weight -= 1;
                return 1;
        } else {
            return 0;
        }
    }

    static Integer SellTire() {
        if (MyCar.tires > 1) {
                MyCar.money += MyCar.tires * 50;
                MyCar.tires -= 1;
                return 1;
        } else {
            return 0;
        }
    }
}