public class Dog extends Animal {
    private boolean sterilized;

    public Dog(String name, double price, boolean sterilized, int age) {
        super(name, price, age);
        this.sterilized = sterilized;
    }

    public boolean isSterilized() {
        return sterilized;
    }

    public void setSterilized(boolean sterilized) {
        this.sterilized = sterilized;
    }

    public void sterilizer(){
        if (!this.sterilized){
            System.out.println("sterilizing " + getName());
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
        return " Im " + getName() + " a DOG and " + children + " and my price is " + getPrice() + " Im : " + getAge() + " years old";
    }
}
