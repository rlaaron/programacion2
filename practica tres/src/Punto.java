public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Punto() {
        x = 0;
        y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distancia(Punto p) {
        double distancia;
        distancia = Math.sqrt(Math.pow((p.getX() - this.x), 2) + Math.pow((p.getY() - this.y), 2));
        return distancia;
    }
    
}

