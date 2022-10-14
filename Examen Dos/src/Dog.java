public class Dog extends Animal {
    private boolean sterilized;

    public Dog(String name, int age, double price, boolean sterilized) {
        super(name, age, price);
        this.sterilized = sterilized;
    }

    public boolean isSterilized() {
        return sterilized;
    }

    public void setSterilized(boolean sterilized) {
        this.sterilized = sterilized;
    }

    @Override
    public void sound() {
        System.out.println("Guau");
    }
}
