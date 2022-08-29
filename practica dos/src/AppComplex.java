import java.util.Scanner;
public class AppComplex {
    public static void main(String[] args){
        Menu menu = new Menu(); 
        Complex a = new Complex(1,10);
        Complex b = new Complex(4,5);
        Scanner input = new Scanner(System.in);
        int menuMain; 
        boolean exit = false;        
        boolean exit2 = false;        
        do {
            menuMain = menu.menuComplex();
            switch(menuMain){
                case 1: 
                    do {
                        int subMenu = menu.subMenuComplex();
                        switch(subMenu){
                            case 1:
                                System.out.println("Enter real part:");
                                a.setReal(input.nextInt());
                                System.out.println("Enter imaginary part:");
                                a.setImaginary(input.nextInt());
                                break;
                            case 2:
                                System.out.println("Enter real part:");
                                b.setReal(input.nextInt());
                                System.out.println("Enter imaginary part:");
                                b.setImaginary(input.nextInt());
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
                    System.out.println(a.add(a,b));
                    break;
                case 3:
                    System.out.println(a.subtract(a,b));
                    break;
                case 4:
                    System.out.println(a.multiply(a,b));
                    break;
                case 5:
                    System.out.println("Conjugate of a: " + a.conjugate(a));
                    System.out.println("Conjugate of b: " + b.conjugate(b));
                    break;
                case 6:
                    System.out.println("Modulus: " + a.module(a,b));
                    break;
                case 7:
                    System.out.println("Angle of a: " + a.angle(a));
                    System.out.println("Angle of b: " + b.angle(b));
                    break;
                case 8:
                    String complex = "Complex 1: " + a.toString()+" Complex 2: " + b.toString();
                    System.out.println(complex);
                    break;
                case 9:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (!exit);
        input.close(); 
    }
}
