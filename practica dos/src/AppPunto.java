import java.util.Scanner;
public class AppPunto { 
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        PuntoR2 p1 = new PuntoR2();
        PuntoR2 p2 = new PuntoR2();
        Scanner input = new Scanner(System.in);
        int menuMain; 
        boolean exit = false;        
        boolean exit2 = false;        
        do {
            menuMain = menu.menuPoint();
            switch(menuMain){
                case 1: 
                    do {
                        int subMenu = menu.subMenuPoint();
                        switch(subMenu){
                            case 1:
                                System.out.println("Enter x:");
                                p1.setPx(menu.input.nextInt());
                                System.out.println("Enter y:");
                                p1.setPy(menu.input.nextInt());
                                break;
                            case 2:
                                System.out.println("Enter x:");
                                p2.setPx(menu.input.nextInt());
                                System.out.println("Enter y:");
                                p2.setPy(menu.input.nextInt());
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
                    System.out.println(p1.distancePoints(p2));
                    break;
                case 3:
                    System.out.println(p1.midPoint(p2));
                    break;
                case 4:
                    String points = p1.toString()+" "+p2.toString();
                    System.out.println(points);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }while(!exit);
        input.close();
    }
}
