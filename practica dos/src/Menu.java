import java.security.Principal;
import java.util.Scanner;
public class Menu {
    private int choice;
    private Scanner input = new Scanner(System.in);

    public Menu(){
        choice =1;
    }

    public int menuPoint(){
        try {
            System.out.println("1.-Modify points");
            System.out.println("2.- Distance between points");
            System.out.println("3.- Midpoint between points");
            System.out.println("4.- Print points");
            System.out.println("5.- Exit");
            choice = input.nextInt();
        }catch(Exception e){
            input.next();
            choice = 10;
        }
        
        return choice;
    }
    public int subMenuPoint(){
        try {
            System.out.println("1.-Point 1");
            System.out.println("2.- Point 2");
            System.out.println("3.- Exit");
            choice = input.nextInt();
        }catch(Exception e){
            input.next();
            choice = 10;
        }
        
        return choice;
    }
    public int changePoint(){
        try {
            System.out.println("1.-Set x");
            System.out.println("2.- Set y");
            System.out.println("3.- Exit");
            choice = input.nextInt();
        }catch(Exception e){
            input.next();
            choice = 10;
        }
        
        return choice;
    }
    
}
