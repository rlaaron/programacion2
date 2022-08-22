import java.util.Scanner;
public class Menu {
    private int choice;
    Scanner input = new Scanner(System.in);

    public Menu(){
        choice =1;
    }

    public int menuPoint(){
        try {
            System.out.println("\tSelect an option: \n");
            System.out.println("1.- Modify points");
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
            System.out.println("\tSelect an option: \n");
            System.out.println("1.- Point 1");
            System.out.println("2.- Point 2");
            System.out.println("3.- Exit");
            choice = input.nextInt();
        }catch(Exception e){
            input.next();
            choice = 10;
        }
        
        return choice;
    }
    
    public int menuFraction(){
        try {
            System.out.println("\tSelect an option: \n");
            System.out.println("1.- Input fractions");
            System.out.println("2.- Add fractions");
            System.out.println("3.- Subtract fractions");
            System.out.println("4.- Multiply fractions");
            System.out.println("5.- Divide fractions");
            System.out.println("6.- simplify fraction");
            System.out.println("7.- Print fraction");
            System.out.println("8.- Exit");
            choice = input.nextInt();
        }catch(Exception e){
            input.next();
            choice = 10;
        }
        
        return choice;
    }

    public int subMenuFraction(){
        try {
            System.out.println("\tSelect an option: \n");
            System.out.println("1.- Fraction 1");
            System.out.println("2.- Fraction 2");
            System.out.println("3.- Exit");
            choice = input.nextInt();
        }catch(Exception e){
            input.next();
            choice = 10;
        }
        
        return choice;
    }
}
