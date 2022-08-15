public class App {
    public static void main(String[] args) throws Exception {
        Circulo c1 = new Circulo();
        System.out.println(c1);
        Circulo c2 = new Circulo(2.0, "azul");
        System.out.println(c2);
        System.out.println("El area del circulo c1 es: " + c1.area());
        System.out.println("El area del circulo c2 es: " + c2.area());
        System.out.println("El perimetro del circulo c1 es: " + c1.perimetro());
        System.out.println("El perimetro del circulo c2 es: " + c2.perimetro());
    }

    
}
