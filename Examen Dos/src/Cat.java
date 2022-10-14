public class Cat extends Animal {
    private int lives;

    public Cat(String name, double price) {
        super(name, price);
        this.lives = 7;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void kill(){
        if (this.lives > 0){
            this.lives--;
            discount();
        }else{
            System.out.println("The cat is already dead");
        }
    }

    public void discount(){
        if (this.lives == 0){
            this.setPrice(0);
        }else{
            this.setPrice(this.getPrice() - (this.getPrice() * 0.10));
        }
    }

    @Override
    public void sound() {
        System.out.print("Miau");
    }

    @Override
    public String toString(){
        return " Im " + getName() + " a CAT and i have " + lives + " lives and my price is " + getPrice();
    }
}
