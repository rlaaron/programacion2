public class Cat extends Animal {
    private int lives;

    public Cat(String name, int age, double price) {
        super(name, age, price);
        this.lives = 7;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    @Override
    public void sound() {
        System.out.println("Miau");
    }
}
