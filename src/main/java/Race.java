import java.util.Random;

public class Race  {
    public int OverallCarData() {
        int myCarStat = MyCar.engine + MyCar.gear + MyCar.tires + MyCar.weight;
        return myCarStat;
    }
    public int EnemyGenerator() {
        Random rand = new Random();
        int enemyCarStat = rand.nextInt(25)+1;
        return enemyCarStat;
    }

    public void Racing() {
        if(OverallCarData()>EnemyGenerator()) {
            MyCar.money += 300;
            System.out.printf("You win!\n");
        } else if(OverallCarData()<EnemyGenerator()) {
            MyCar.money -= 300;
            System.out.printf("You Lose\n");
        } else {
            System.out.println("It's a draw");
        }
        System.out.printf("Write this shit out!\n");
    }
}
