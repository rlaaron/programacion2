import java.util.Scanner;
import java.util.InputMismatchException;
public class AppCoffe {
    public static void main(String[] args) throws Exception {
        CoffeeMaker maker = new CoffeeMaker();
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int op; 
 
        while (!exit) {
 
            System.out.println("1.Fill Coffee");
            System.out.println("2.Serve Coffe");
            System.out.println("3.Add Coffe");
            System.out.println("4.Empty Coffe");
            System.out.println("5.Exit");
 
            try {
 
                System.out.println("Select an option");
                op = sn.nextInt();
 
                switch (op) {
                    case 1:
                        System.out.println("Filling coffe");
                        System.out.println(maker.fillCoffee());
                        break;
                    case 2:
                        System.out.println("How much coffee do you want?");
                        int cup = sn.nextInt();
                        System.out.println(maker.serveCoffe(cup));
                        break;
                    case 3:
                        System.out.println("How much coffee do you want refill?");
                        int refill = sn.nextInt();
                        System.out.println(maker.addCoffe(refill));
                        break;
                    case 4:
                        System.out.println("Emptying coffe");
                        System.out.println(maker.emptyCoffe());
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Select a valid option");
                }
            } catch (InputMismatchException e) {
                System.out.println("invalid option");
                sn.next();   
            }
        }
        sn.close();
    }
}
