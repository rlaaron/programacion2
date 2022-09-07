import java.util.Scanner;
public class MenuTriangulo {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        //Se crean los 3 puntos 
        Punto p1= new Punto(10,50);
        Punto p2= new Punto(20,30);
        Punto p3= new Punto(60,80);
        
      //Se le pide al usuario que ingrese las coordenadas de los 3 puntos 
        // System.out.println ("Ingrese x del punto 1: ");
        // p1.setX(input.nextDouble());
        // System.out.println("Ingrese y del punto 1: ");
        // p1.setY(input.nextDouble());
        // System.out.println("Ingrese x del punto 2: ");
        // p2.setX(input.nextDouble());
        // System.out.println("Ingrese y del punto 2: ");
        // p2.setY(input.nextDouble());
        // System.out.println("Ingrese x del punto 3: ");
        // p3.setX(input.nextDouble());
        // System.out.println("Ingrese y del punto 3: ");
        // p3.setX(input.nextDouble());
        
        //Se crea el nuevo triangulo con los puntos 
        Triangulo t= new Triangulo(p1,p2,p3);
        
        //Se imprime el area y perimetro del triangulo ingresado 
        System.out.println("Area: "+t.area());
        System.out.println("Perimetro: "+t.perimetro());

        input.close();
    }
}
