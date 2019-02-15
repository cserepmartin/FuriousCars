import java.util.Scanner;

public class Store {
    MyCar mycar = new MyCar();
    public static void storeDesign(){
        boolean notQuit = true;
        while (notQuit){
            System.out.println("     |̅̅̅̅̅̅̅̅̅̅̅̅̅̅̅̅̅̅|");
            System.out.println("     |       Store      |");
            System.out.println("     |̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶|");
            System.out.println("          0. Leave");
            System.out.println("      1. Engine upgrade");
            System.out.println("      2. Weight upgrade");
            System.out.println("       3. Gear upgrade");
            System.out.println("       4. Tire upgrade\n");
            Scanner userInput = new Scanner(System.in);
            System.out.print("Choose an option: ");
            int choice = userInput.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Thanks for visiting us!");
                    notQuit = false;
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
    /*public void engineUpgrade();
        if(mycarr.getInstance.engine){

        } else {
            System.out.println("You reached the maximum engine level! Congrats!");
        }
    */
        }
    }
}
