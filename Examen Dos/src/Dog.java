public class Dog extends Animal {
    private boolean sterilized;

    public Dog(String name, double price, boolean sterilized) {
        super(name, price);
        this.sterilized = sterilized;
    }

    public boolean isSterilized() {
        return sterilized;
    }

    public void setSterilized(boolean sterilized) {
        this.sterilized = sterilized;
    }

    public void sterilizer(){
        if (this.sterilized == false){
            this.sterilized = true;
        }else{
            System.out.println("The dog is already sterilized");
        }
    }

    @Override
    public void sound() {
        System.out.print("Guau");
    }

    @Override
    public String toString(){
        String children = sterilized ? " i can have puppys" : "i cant have puppys";
        return " Im " + getName() + " a DOG and " + children + " and my price is " + getPrice();
    }
}
