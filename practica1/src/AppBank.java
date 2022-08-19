import java.util.Scanner;
import java.util.InputMismatchException;

public class AppBank {
    public static void main(String[] args) throws Exception{
        // Creating a new object of the class BankAccount.
        BankAccount account = new BankAccount("John", 1234, 1000);
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int op; 
        while (!exit) {
            // Printing the menu options.
            System.out.println("\n1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Get Balance");
            System.out.println("4.Get id");
            System.out.println("5.Exit");
            try {
                System.out.println("Select an option");
                op = sn.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("How much do you want to deposit?");
                        double amount = sn.nextDouble();
                        System.out.println(account.deposit(amount));
                        break;
                    case 2:
                        System.out.println("How much do you want to withdraw?");
                        amount = sn.nextDouble();
                        System.out.println(account.withdraw(amount));
                        break;
                    case 3:
                        System.out.println(account.getBalance());
                        break;
                    case 4:
                        System.out.println(account.getId());
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid option");
            }
        }sn.close();
    }   
    
}
