public class PuntoR2 {
    private int x;
    private int y;

    public PuntoR2(){
        this.x=0;
        this.y=0;
    }

    public PuntoR2(int x, int y){
        this.x = x;
        this.y = y;
    }

    // getters
    public int getPx(){
        return x;
    }

    public int getPy(){
        return y;
    }
    
    //setters
    public void setPx(int x){
        this.x = x;
    }

    public void setPy(int y){
        this.y = y;
    }

    public double distancePoints(PuntoR2 p1){

        // // Calculating the distance between two points.
        double distance = Math.sqrt((p1.getPx()-this.x)*(p1.getPx()-this.x)+(p1.getPy()-this.y)*(p1.getPy()-this.y));
        // double distance = Math.sqrt((puntoUno.getPx()-puntoDos.getPx())*(puntoUno.getPx()-puntoDos.getPx())+(puntoUno.getPy()-puntoDos.getPy())*(puntoUno.getPy()-puntoDos.getPy()));
        return distance;
    }
    
    /**
     * The function takes two points and returns the midpoint of the line segment connecting them
     * 
     * @param p1 PuntoR2
     * @param p2 PuntoR2
     * @return The midpoint of the two points.
     */
    public PuntoR2 midPoint(PuntoR2 p1){
        int x = (p1.getPx()+this.x)/2;
        int y = (p1.getPy()+this.y)/2;
        PuntoR2 midPoint = new PuntoR2(x,y);
        return midPoint;
    }
    @Override
    public String toString(){
        return "("+x+","+y+")";
    }

}
