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
    public double perimetro(){
        double perimetro = p1.distancia(p2)+p2.distancia(p3)+p3.distancia(p1);
        return perimetro;
    }
    
    public double area(){
        Recta r = new Recta(p1,p2);
        double h =  r.distanciaPunto(p3);
        double base = p1.distancia(p2);
        double area = base*h/2;
        return area;
    }
    @Override
    public String toString(){
        return "Triangulo{" + "p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + '}';
    }

}
