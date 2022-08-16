public class CoffeeMaker {
    private double ammountMax;
    private double ammount;

    public CoffeeMaker(){
        ammountMax = 100;
        ammount = 0;
    }
    public CoffeeMaker(double ammountMax){
        this.ammountMax = ammountMax;
        ammount = ammountMax;
    }

    public CoffeeMaker(double ammountMax, double ammount){
        this.ammountMax = ammountMax;
        this.ammount = ammount;
        if(ammount>ammountMax){
            ammountMax = ammount;
        }
    }

    public double fillCoffee(){
        return ammount = ammountMax;
    }
    

    public double serveCoffe(int cup){
        if (ammount<cup){

           return cup -= ammount; 
        }// retornar 0 checar
        return ammount;
    }

    public double addCoffe(int cup){
        ammount += cup;
        return ammount = ammountMax;
    }

    public double emptyCoffe(){
        return ammount = 0;
    }
    
    public String toString(){
        return "Coffe Maker [ammount Max = " + ammountMax + ",ammount = " + ammount + "]";
    }
}
