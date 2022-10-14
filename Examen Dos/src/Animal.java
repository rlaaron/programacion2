public class Animal implements Sound {
    private String name;
    private double price;

    public Animal(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // public abstract void sound();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                " price=" + price +
                '}';
    }


}