public class Paralylepiped {
    private Vector a;
    private Vector b;
    private Vector c;

    public Paralylepiped(Vector a, Vector b, Vector c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Vector getA() {
        return a;
    }

    public Vector getB() {
        return b;
    }

    public Vector getC() {
        return c;
    }

    public void setA(Vector a) {
        this.a = a;
    }

    public void setB(Vector b) {
        this.b = b;
    }

    public void setC(Vector c) {
        this.c = c;
    }

    public double volume() {
        double volume;
        volume = a.ProductoPunto(b.ProductoCruz(c));
        return volume;
    }

    @Override
    public String toString() {
        return "Paralylepiped{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
}
