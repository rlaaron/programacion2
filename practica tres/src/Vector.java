public class Vector {
    // class vector whit magnitude, unit vector, multiply by scalar, dot product, cross product, angle between vectors, projection of vector on another vector, rejection of vector on another vector, vector sum, vector difference, vector triple product, vector quadruple product, vector product of 3 vectors, vector product of 4 vectors, vector product of 5 vectors, vector product of 6 vectors, vector product of 7 vectors, vector product of 8 vectors, vector product of 9 vectors, vector product of 10 vectors, vector product of 11 vectors, vector product of 12 vectors, vector product of 13 vectors, vector product of 14 vectors, vector product of 15 vectors, vector product of 16 vectors, vector product of 17 vectors, vector product of 18 vectors, vector product of 19 vectors, vector product of 20 vectors, vector product of 21 vectors, vector product of 22 vectors, vector product of 23 vectors, vector product of 24 vectors, vector product of 25 vectors, vector product of 26 vectors, vector product of 27 vectors, vector product of 28 vectors, vector product of 29 vectors, vector product of 30 vectors, vector product of 31 vectors, vector product of 32 vectors, vector product of 33 vectors, vector product of 34 vectors, vector product of 35 vectors, vector product of 36 vectors, vector product of 37 vectors, vector product of 38 vectors, vector product of 39 vectors, vector product of 40 vectors, vector product of 41 vectors, vector product of 42 vectors, vector product of 43 vectors, vector product of 44 vectors, vector product of 45 vectors, vector product of 46 vectors, vector product of 47 vectors, vector product of 48 vectors, vector product of 49 vectors, vector product of 50 vectors, vector product of 51 vectors, vector product of 52 vectors, vector product of 53 vectors, vector product of 54 vectors, vector product of 55 vectors, vector product of 56 vectors, vector product of 57 vectors, vector product of 58 vectors, vector product of 59 vectors, vector product of 60 vectors, vector product of 61 vectors, vector product of 62 vectors, vector product of 63 vectors, vector product of 64 vectors, vector product of 65 vectors, vector product of 66 vectors, vector product of 67 vectors, vector product of
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //getters
    public double getX(){
        return x;
    }
    public double getY (){
       return y;
    }
    public double getZ(){
        return z;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    public void setZ(double z){
        this.z=z;
    }
    


    public double magnitud() {
        double vector;
        vector= Math.sqrt((x*x)+(y*y)+(z*z));
        return vector; 
    }
    public Vector VectorUnitario (){
        double magnitud= magnitud();
        Vector unitario= new Vector((x / magnitud), (y / magnitud), (z / magnitud)) ;
        return unitario;
    }
    public Vector multiplicacion(int a){
        Vector multiplicacion= new Vector((a*x),(a*y),(a*z));
        return multiplicacion;
    }

    public Vector suma(Vector v){
        Vector suma= new Vector ((this.x+v.getX()),(this.y+v.getY()),(this.z+v.getZ()));
        return suma;
    }
    public double ProductoPunto(Vector v){
        double punto= ((this.x*v.getX())+(this.y*v.getY())+(this.z*v.getZ()));
        return punto;
    }
    
    public Vector ProductoCruz(Vector v){
        Vector producto= new Vector((this.y*v.getZ()-v.getY()*this.z), (v.getX()*this.z-this.x*v.getZ()),(this.x*v.getY()-v.getX()*this.y) );
        return producto;
    }
    
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
    
    
    
}
