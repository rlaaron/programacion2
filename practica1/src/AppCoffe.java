import java.util.Scanner;
import java.util.InputMismatchException;
public class AppCoffe {
    public static void main(String[] args) throws Exception {
        // Creating a new object of the class CoffeeMaker.
        CoffeeMaker maker = new CoffeeMaker();
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int op; 
 
       // The above code is a simple program that simulates a coffee maker. The user can select from a
       // menu of options to fill the coffee maker, serve coffee, add coffee, empty the coffee maker,
       // or exit the program.
        while (!exit) {
 
            // Printing the menu options.
            System.out.println("\n1.Fill Coffee");
            System.out.println("2.Serve Coffe");
            System.out.println("3.Add Coffe");
            System.out.println("4.Empty Coffe");
            System.out.println("5.Setters and Getters");
            System.out.println("6.Exit");
 
            try {
 
                System.out.println("Select an option");
                op = sn.nextInt();
 
                switch (op) {
                    case 1:
                        // Printing the string "Filling coffe" and then calling the method fillCoffe()
                        // from the class CoffeeMaker.
                        System.out.println("Filling coffe");
                        System.out.println(maker.fillCoffee());
                        break;
                    case 2:
                        // Asking the user how much coffee they want and then serving it to them.
                        System.out.println("How much coffee do you want?");
                        int cup = sn.nextInt();
                        System.out.println(maker.serveCoffe(cup));
                        break;
                    case 3:
                        // Asking the user how much coffee they want to refill and then serving it to
                        // them.
                        System.out.println("How much coffee do you want refill?");
                        int refill = sn.nextInt();
                        System.out.println(maker.addCoffe(refill));
                        break;
                    case 4:
                        // Printing the string "Emptying coffe" and then calling the method
                        // emptyCoffe() from the class CoffeeMaker.
                        System.out.println("Emptying coffe");
                        System.out.println(maker.emptyCoffe());
                        break;
                    // This is a setter and getters.
                    case 5:
                        while(!exit){
                            // A menu for the user to select an option.
                            System.out.println("\n1.get Ammount Max");
                            System.out.println("2.get Ammount");
                            System.out.println("3.set Ammount Max");
                            System.out.println("4.set Ammount");
                            System.out.println("5.toString");
                            System.out.println("6.Exit");
                            try {
 
                                System.out.println("Select an option");
                                op = sn.nextInt();
                 
                                switch (op) {
                                    case 1:
                                        System.out.println(maker.getAmmountMax());
                                        break;
                                    case 2:
                                        System.out.println(maker.getAmmount());
                                        break;
                                    case 3:
                                        System.out.println("Enter new ammountMax");
                                        int ammountMax = sn.nextInt();
                                        maker.setAmmountMax(ammountMax);
                                        break;
                                    case 4:
                                        System.out.println("Enter new ammount");
                                        int ammount = sn.nextInt();
                                        maker.setAmmount(ammount);
                                        break;
                                    case 5:
                                        System.out.println(maker.toString());
                                        break;
                                    case 6:
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
                        break;
                    case 6:
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
