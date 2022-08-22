import java.security.Principal;
import java.util.Scanner;
public class Menu {
    private int choice;
    private Scanner input = new Scanner(System.in);

    public Menu(){
        choice =1;
    }

    public int menuOptions(){
        try {
            System.out.println("1.- opcion 1");
            System.out.println("2.- opcion 2");
            System.out.println("3.- opcion 3");
            System.out.println("4.- opcion 4");
            System.out.println("5.- salir");
            choice = input.nextInt();
        }catch(Exception e){
            input.next();
            choice = 10;
        }
        
        return choice;
    }
    
}
