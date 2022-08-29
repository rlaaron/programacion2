import java.util.Scanner;
public class AppFraction {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Fraction a = new Fraction();
        Fraction b = new Fraction();
        Scanner input = new Scanner(System.in);
        int menuMain; 
        boolean exit = false;        
        boolean exit2 = false;        
        do {
            menuMain = menu.menuFraction();
            switch(menuMain){
                case 1: 
                    do {
                        int subMenu = menu.subMenuFraction();
                        switch(subMenu){
                            case 1:
                                System.out.println("Enter numerator:");
                                a.setNumerator(menu.input.nextInt());
                                System.out.println("Enter denominator:");
                                a.setDenominator(menu.input.nextInt());
                                break;
                            case 2:
                                System.out.println("Enter numerator:");
                                b.setNumerator(menu.input.nextInt());
                                System.out.println("Enter denominator:");
                                b.setDenominator(menu.input.nextInt());
                                break;
                            case 3:
                                exit2 = true;
                                break;
                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                    } while (!exit2); 
                    break;
                case 2:
                    System.out.println(a.add(b));
                    break;
                case 3:
                    System.out.println(a.subtract(b));
                    break;
                case 4:
                    System.out.println(a.multiply(b));
                    break;
                case 5:
                    System.out.println(a.divide(b));
                    break;
                case 6:
                    System.out.println("Fraction simplified a: " + a.simplify());
                    System.out.println("Fraction simplified b: " + b.simplify());
                    break;
                case 7:
                    String fractions = "Fraction 1: " + a.toString()+" Fraction 2: " + b.toString();
                    System.out.println(fractions);
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }while(!exit);
        input.close();

    }
}
