import java.util.ArrayList;
import java.util.Scanner;

public class BancoP {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double cantidad, retiro;
        int nc;
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        boolean salir = false;
        boolean salir2 = false;
        int op, op2;

        while (!salir) {
            System.out.println("\n1. Crear cuenta  ");
            System.out.println("2. Eliminar cuenta ");
            System.out.println("3. Depositar");
            System.out.println("4. Retirar");
            System.out.println("5. Mostrar cuentas");
            System.out.println("6. Actualizar cuentas");
            System.out.println("7. Salir");
            System.out.println("Seleccionar opción");
            op = leer.nextInt();
            leer.nextLine();
            switch (op) {
                case 1:
                    // agregar
                    do {
                        System.out.println("1. Cuenta Ahorros");
                        System.out.println("2. Cuenta Corriente");
                        System.out.println("3. Regresar al menú principal");
                        System.out.println("Seleccionar opción");
                        op2 = leer.nextInt();
                        leer.nextLine();
                        switch (op2) {
                            case 1:
                                System.out.println("Ingrese el número de cuenta");
                                nc = leer.nextInt();
                                leer.nextLine();
                                System.out.println("Ingrese el balance");
                                int balance = leer.nextInt();
                                leer.nextLine();
                                System.out.println("Ingrese el interes");
                                double interes = leer.nextDouble();
                                leer.nextLine();
                                cuentas.add(new CuentaAhorro(nc, balance, interes));
                                System.out.println("Cuenta ahorro creada");
                                break;
                            case 2:
                                System.out.println("Ingrese el número de cuenta");
                                nc = leer.nextInt();
                                leer.nextLine();
                                System.out.println("Ingrese el balance");
                                balance = leer.nextInt();
                                leer.nextLine();
                                System.out.println("Ingrese el limite");
                                int limite = leer.nextInt();
                                leer.nextLine();
                                cuentas.add(new CuentaCorriente(nc, balance, limite));
                                System.out.println("Cuenta corriente creada");
                                break;
                            case 3:
                                salir2 = true;
                                break;
                        }
                    } while (!salir2);
                case 2:
                    // eliminar
                    System.out.println("Ingresa el número de cuenta");
                    nc = leer.nextInt();
                    for(Cuenta c: cuentas){
                        if(c.getNoCuenta() == nc){
                            cuentas.remove(c);
                            System.out.println("Cuenta eliminada");
                        } else {
                            System.out.println("Cuenta no encontrada");
                        }
                    }
                    break;
                case 3:
                    // depositar
                    System.out.println("Ingresa el número de cuenta");
                    nc = leer.nextInt();
                    for (Cuenta c : cuentas) {
                        if(c.getNoCuenta() == nc) {
                            System.out.println("Ingresa la cantidad a depositar");
                            cantidad = leer.nextDouble();
                            c.depositar(cantidad);
                        }else{
                            System.out.println("Cuenta no encontrada");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Ingresa el número de cuenta");
                    nc = leer.nextInt();
                    for (Cuenta c : cuentas) {
                        if (c.getNoCuenta() == nc) {
                            System.out.println("Cantidad a retirar : ");
                            retiro = leer.nextDouble();
                            c.retirar(retiro);
                        }else {
                            System.out.println("Cuenta no encontrada");
                        }
                    }
                    break;
                case 5:
                    // mostrar
                    for (Cuenta c : cuentas) {
                        System.out.println(c);
                    }
                    break;
                case 6:
                    // actualizar
                    for (Cuenta c : cuentas) {
                        if (c instanceof CuentaAhorro) {
                            ((CuentaAhorro) c).agregarIntereses();
                            System.out.println("Cuenta ahorro actualizada");
                        }else{
                            if(((CuentaCorriente) c).getSobregiro()){
                                System.out.println("Cuenta sobregirada");
                            }else{
                                System.out.println("Cuenta al corriente");
                            }
                        }
                    }
                    break;
                case 7:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
        leer.close();
    }

}
