public class Recta {
    private Punto p1;
    private Punto p2;// (x2,y2)

    public Recta(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Punto getP2() {
        return p2;
    }

    public Punto getP1() {
        return p1;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    public double distancia(){
        // double distancia=Math.sqrt((this.p1.getX()-this.p2.getX())(this.p1.getX()-this.p2.getX())+(this.p1.getY()-this.p2.getY())(this.p1.getY()-this.p2.getY()));
        double distancia = Math.sqrt(Math.pow((this.p1.getX() - this.p2.getX()), 2) + Math.pow((this.p1.getY() - this.p2.getY()), 2));
        return distancia; 
    }

    public String toString() {
        return "Recta [p1=" + p1 + ", p2=" + p2 + "]";
    }
}
