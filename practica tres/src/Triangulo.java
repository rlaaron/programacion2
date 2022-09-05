public class Triangulo {
    private Punto p1;
    private Punto p2;//(x2,y2)
    private Punto p3;//(x3,y3)
    // private Recta r1;
    // private Recta r2;
    // private Recta r3;
    
    public Triangulo(Punto p1,Punto p2, Punto p3){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }
    public Punto getP2(){
        return p2;
    }
     public Punto getP3(){
        return p3;
    }
     public Punto getP1(){
         return p1;
     }
    public void setP1(Punto p1){
        this.p1=p1;
    }
     public void setP2(Punto p2){
        this.p2=p2;
    }
     public void setP3(Punto p3){
        this.p3=p3;
    }
    public double altura(){
        Recta r1= new Recta(p1, p2);
        Recta r2= new Recta(p1, p3);
        Recta r3= new Recta(p2, p3);
        double a = r1.distancia();
        double b = r2.distancia();
        double c = r3.distancia();
        double s = ((a+b+c)/2);
        double h = ((2 / a) * Math.sqrt(s * (s - a) * (s - b) * (s - c)));
        return h;
    }
    public double perimetro(){
        Recta r1= new Recta(p1, p2);
        Recta r2= new Recta(p1, p3);
        Recta r3= new Recta(p2, p3);
        double perimetro= (r1.distancia()+r2.distancia()+r3.distancia());
        return perimetro;
    }
    
    public double area(){
        Recta base = new Recta(p1, p2);
        double area = ((base.distancia()*altura()/2));
        return area;
    }
    @Override
    public String toString(){
        return "Triangulo{" + "p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + '}';
    }
}
