import java.util.Scanner;
public class Termometros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        boolean salir2 = false;
        int opt, opt2;
        do {
            System.out.println("1. Termometro Celsius");
            System.out.println("2. Termometro Fahrenheit");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Ingrese la temperatura: ");
                    double grados = sc.nextDouble();
                    TermometroCelsius tc = new TermometroCelsius(grados);
                    System.out.println("Termometro creado con exito: ");
                    do {
                        System.out.println("1.Convertir a Fahrenheit");
                        System.out.println("2.Determinar temperatura");
                        System.out.println("3.Guardar memoria");
                        System.out.println("4.Mostrar temperatura minima");
                        System.out.println("5.Mostrar temperatura maxima");
                        System.out.println("6.Resetear memoria");
                        System.out.println("7.Salir");
                        System.out.print("Opcion: ");
                        opt2 = sc.nextInt();
                        switch (opt2) {
                            case 1:
                                System.out.println("Temperatura en Fahrenheit: " + tc.convertir(tc.getGrados()));
                                break;
                            case 2:
                                System.out.println("Temperatura: " + tc.determinarTemperatura());
                                break;
                            case 3:
                                tc.guardarMemoria();
                                System.out.println("Memoria guardada con exito");
                                break;
                            case 4:
                                System.out.println("Temperatura minima: " + tc.minimo());
                                break;
                            case 5:
                                System.out.println("Temperatura maxima: " + tc.maximo());
                                break;
                            case 6:
                                tc.resetearMemoria();
                                System.out.println("Memoria reseteada con exito");
                                break;
                            case 7:
                                salir2 = true;
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }

                    } while (salir2);
                    break;
                case 2:
                    System.out.println("Ingrese la temperatura: ");
                    double grados2 = sc.nextDouble();
                    TermometroFahrenheit tf = new TermometroFahrenheit(grados2);
                    System.out.println("Termometro creado con exito: ");
                    do {
                        System.out.println("1.Convertir a Celsius");
                        System.out.println("2.Determinar temperatura");
                        System.out.println("3.Guardar memoria");
                        System.out.println("4.Mostrar temperatura minima");
                        System.out.println("5.Mostrar temperatura maxima");
                        System.out.println("6.Resetear memoria");
                        System.out.println("7.Salir");
                        System.out.print("Opcion: ");
                        opt2 = sc.nextInt();
                        switch (opt2) {
                            case 1:
                                System.out.println("Temperatura en Celsius: " + tf.convertir(tf.getGrados()));
                                break;
                            case 2:
                                System.out.println("Temperatura: " + tf.determinarTemperatura());
                                break;
                            case 3:
                                tf.guardarMemoria();
                                System.out.println("Memoria guardada con exito");
                                break;
                            case 4:
                                System.out.println("Temperatura minima: " + tf.minimo());
                                break;
                            case 5:
                                System.out.println("Temperatura maxima: " + tf.maximo());
                                break;
                            case 6:
                                tf.resetearMemoria();
                                System.out.println("Memoria reseteada con exito");
                                break;
                            case 7:
                                salir2 = true;
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
                    } while (salir2);
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (!salir); sc.close();
    }
}
