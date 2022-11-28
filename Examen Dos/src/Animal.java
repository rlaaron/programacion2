//esta clase manda un error pero si compila... lo dejo como me lo habia comentado
// para que no de error es especificarle que es abstract asi:
// public abstract class Animal implements Sound

public class Animal implements Sound {
    private String name;
    private double price;
    private int age;

    public Animal(String name, double price, int age) {
        this.name = name;
        this.price = price;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // public abstract void sound();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                " price=" + price +
                " age=" + age +
                '}';
    }


}