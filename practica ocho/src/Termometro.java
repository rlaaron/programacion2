import java.util.ArrayList;
public abstract class Termometro implements Estadistica {
    private double grados;
    private ArrayList<Double> memoria;

    public Termometro(double grados) {
        this.grados = grados;
        this.memoria = new ArrayList<Double>();
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public abstract double convertir(double grados);

    public void guardarMemoria() {
        memoria.add(grados);
    }

    public void resetearMemoria() {
        memoria.clear();
    }

    public String mostrarMemoria() {
        String salida = "";
        for (Double t : memoria) {
            salida += t + " ";
        }
        return salida;
    }

    @Override
    public String toString() {
        return "Temperatura acutal: " + grados;
    }

    @Override
    public double minimo() {
        double min = memoria.get(0);
        for (Double t : memoria) {
            if (t < min) {
                min = t;
            }
        }
        return min;
    }

    @Override
    public double maximo() {
        double max = memoria.get(0);
        for (Double t : memoria) {
            if (t > max) {
                max = t;
            }
        }
        return max;
    }


}
