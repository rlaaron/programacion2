public class CoffeeMaker {
    private double ammountMax;
    private double ammount;


    // Simple constructor.
    public CoffeeMaker(){
        ammountMax = 100;
        ammount = 0;
    }

    // param construcctor.
    public CoffeeMaker(double ammountMax){
        this.ammountMax = ammountMax;
        ammount = ammountMax;
    }

    // param construcctor.
    public CoffeeMaker(double ammountMax, double ammount){
        this.ammountMax = ammountMax;
        if(ammount>ammountMax){
            ammount = ammountMax;
        }else{
            this.ammount = ammount;
        }
    }

    // getters.
    // Getting the ammountMax and ammount.
    public double getAmmountMax() {
        return ammountMax;
    }

    public double getAmmount() {
        return ammount;
    }

    // setters.
    // Setting the ammountMax and ammount variables.
    public void setAmmountMax(double ammountMax) {
        this.ammountMax = ammountMax;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }

    // This function takes in a double amount and adds it to the ammount.
    public String fillCoffee(){
        // return ammount = ammountMax;
        ammount = ammountMax;
        return "CoffeeMaker is full whit " + ammountMax + " ml\n";
    }
    


    /**
     * This function takes in an integer and returns a string
     * 
     * @param cup the amount of coffee to serve
     * @return The ammount of coffee left in the coffee maker.
     */
    public String serveCoffe(int cup){
        if (ammount<cup){
            ammount = 0;
            return "CoffeeMaker is empty the rest was served\n"; 
        }
        
        return "CoffeeMaker has " + ammount + " ml\n";
    }

    /**
     * This function adds coffee to the coffee maker
     * 
     * @param cup the amount of coffee to add to the coffee maker, in ml
     * @return The ammount of coffee in the coffee maker.
     */
    public double addCoffe(int cup){
        if(cup>ammount){
            System.out.println("CoffeeMaker cannot receive as much coffee\n");
        }else{
            ammount += cup;
        }
        return ammount;

    }

    /**
     * This function is called when the coffee maker is empty. It prints a message to the console and
     * returns the amount of coffee in the coffee maker to 0
     * 
     * @return The ammount of coffee in the coffee maker.
     */
    public double emptyCoffe(){
        System.out.println("Coffee Maker is empty\n");
        return ammount = 0;
    }
    
    public String toString(){
        return "Coffe Maker [ammount Max = " + ammountMax + ",ammount = " + ammount + "]\n";
    }
}
