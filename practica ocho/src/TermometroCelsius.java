public class TermometroCelsius extends Termometro  {
    public TermometroCelsius(double grados) {
        super(grados);
    }

    @Override
    public double convertir(double grados) {
        return (grados*9/5)+32;
    }

    @Override
    public String determinarTemperatura() {
        if (getGrados() < 0) {
            return "Congelado";
        } else if (getGrados() < 10) {
            return "Frio";
        } else if (getGrados() < 20) {
            return "Templado";
        } else if (getGrados() < 30) {
            return "Calido";
        } else {
            return "Caluroso";
        }
    }

    @Override
    public String toString() {
        return "Temperatura actual: " + convertir(getGrados()) + "C";
    }
}
    

