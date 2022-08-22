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
        this.x = y;
    }

    // public double distancePoints(int x1, int y1, int x2, int y2){
    //     double distance = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)); 
    //     return distance;
    // }

    public double distancePoints(PuntoR2 p1, PuntoR2 p2 ){
        double distance = Math.sqrt((p1.getPx()-p2.getPx())*(p1.getPx()-p2.getPx())+(p1.getPy()-p2.getPy())*(p1.getPy()-p2.getPy()));
        return distance;
    }
    
    public PuntoR2 midPoint(PuntoR2 p1, PuntoR2 p2){
        int x = (p1.getPx()+p2.getPx())/2;
        int y = (p1.getPy()+p2.getPy())/2;
        PuntoR2 midPoint = new PuntoR2(x,y);
        return midPoint;
    }

    @Override
    public String toString(){
        return "("+x+","+y+")";
    }

}
