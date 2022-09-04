import java.util.Scanner;
public class MenuPrlyd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Vector a = new Vector(110, 25, 35);
        // Vector b = new Vector(50, 60, 100);
        // Vector c = new Vector(70, 55, 90);
        // Paralylepiped p = new Paralylepiped(a, b, c);

        System.out.println("Input the x the y and the z of the vector a");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double z1 = sc.nextDouble();
        Vector a = new Vector(x1,y1,z1);
        System.out.println("Input the x the y and the z of the vector b");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double z2 = sc.nextDouble();
        Vector b = new Vector(x2,y2,z2);
        System.out.println("Input the x the y and the z of the vector c");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double z3 = sc.nextDouble();
        Vector c = new Vector(x3,y3,z3);
        Paralylepiped p = new Paralylepiped(a, b, c);
        
        System.out.println(p);
        System.out.println("Volume: " + p.volume());
        sc.close();
    }
}
