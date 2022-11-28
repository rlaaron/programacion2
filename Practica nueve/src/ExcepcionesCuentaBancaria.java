import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionesCuentaBancaria {
    static Scanner sc = new Scanner(System.in);

    private static int obtenerOpcionUsuario() {
        int opcion = -1;
        do {
            try {
                System.out.println("Opciones Menú:");
                System.out.println("0) Salir");
                System.out.println("1) Crear nueva cuenta");
                System.out.println("2) Depositar cuenta actual");
                System.out.println("3) Retirar cuenta actual");
                System.out.println("4) Buscar cuenta");
                System.out.println("5) Imprimir todas las cuentas");

                System.out.print("Digita tu opción(0 - 5): ");
                opcion = sc.nextInt();

                if (opcion < 0 || opcion > 5)
                    System.out.println("Opción inválida");

            } catch (InputMismatchException b3) {
                System.out.println("ENTRADA INVALIDA");
                sc = new Scanner(System.in);
            }
        } while (opcion < 0 || opcion > 5);
        return opcion;
    }

    private static double obtenerCantidad() {
        double cantidad = 0;
        boolean salir = false;
        do {
            try {
                System.out.println("Ingrese cantidad");
                cantidad = sc.nextDouble();
                salir = true;
            } catch (InputMismatchException b3) {
                System.out.println("ENTRADA INVALIDA");
                sc = new Scanner(System.in);
            }
        } while (!salir);
        return cantidad;
    }

    private static int obtenerNoCuenta() {
        int noCuenta = 0;
        boolean salir = false;
        do {
            try {
                System.out.println("Ingrese numero de cuenta");
                noCuenta = sc.nextInt();
                salir = true;
            } catch (InputMismatchException b3) {
                System.out.println("ENTRADA INVALIDA");
                sc = new Scanner(System.in);
            }
        } while (!salir);
        return noCuenta;
    }

    public static void main(String[] args) {
        Banco banco = new Banco(10);
        CuentaBancaria cuenta = null;
        double cantidad;
        int noCuenta, opcion;

        do {
            opcion = obtenerOpcionUsuario();
            try {

                switch (opcion) {
                    case 1:
                        cantidad = obtenerCantidad();
                        noCuenta = obtenerNoCuenta();
                        cuenta = new CuentaBancaria(cantidad, noCuenta);
                        banco.agregarCuenta(cuenta);
                        System.out.println("Información cuenta: " + cuenta + "\n");
                        break;
                    case 2:
                        boolean salir = false;
                        do{
                            try{
                                cantidad = obtenerCantidad();
                                cuenta.depositar(cantidad);
                                System.out.println("Información de la cuenta: " + cuenta + "\n");
                                salir = true;
                                break;
                            }catch(NullPointerException e){
                                System.out.println("cuenta no existente");
                                salir = false;
                                break;
                            }
                        }while(!salir);
                    case 3:
                        try{
                            cantidad = obtenerCantidad();
                            cuenta.retirar(cantidad);
                            System.out.println("Información de la cuenta: " + cuenta + "\n");
                            break;
                        }catch(NullPointerException e){
                            System.out.println("cuenta no existente");
                            break;
                        }
                    case 4:
                        noCuenta = obtenerNoCuenta();
                        CuentaBancaria b = banco.buscarCuenta(noCuenta);
                        if (b != null) {
                            cuenta = b;
                            System.out.println("Información cuenta: " + cuenta + "\n");
                        } else {
                            System.out.println("\n**ERROR**: Cuenta bancaria " + noCuenta + " no encontrada!\n");
                        }
                        break;

                    case 5:
                        System.out.print("\n\nLas cuentas: \n" + banco + "\n\n");
                        break;
                }
            } catch (IllegalArgumentException b1) {
                System.out.println(b1.getMessage());
            } catch (SobregiroNegativo b2) {
                System.out.println(b2.getMessage());
            }

        } while (opcion != 0);
        System.out.println("\n\nHasta luego!");
    }
}
