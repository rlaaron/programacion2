public abstract class Animal implements Sound {
    private String name;
    private int age;
    private double price;

    public Animal(String name, int age, double price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // public void sound() {
    //     System.out.println("Sound");
    // }

    public abstract void sound();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }


}