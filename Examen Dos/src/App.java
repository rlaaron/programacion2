import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void update(ArrayList<Animal> animals, Scanner sc){
        for(Animal animal : animals){
            if (animal instanceof Dog){
                System.out.println("My name is " + animal.getName() + " and my price is " + animal.getPrice());
                if(!((Dog) animal).isSterilized()){
                    ((Dog) animal).sterilizer();
                    System.out.println("sterilizing " + animal.getName());
                }
            }else if (animal instanceof Cat){
                System.out.println("My name is " + animal.getName() + " and my price is " + animal.getPrice());
                System.out.println("Has  " + animal.getName() + " the cat lost any life?");
                String answer = sc.nextLine(); 
                if(answer.equals("yes")){
                    ((Cat) animal).kill();
                    System.out.println("My price is now: " + animal.getPrice());
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<Animal>();
        Cat cat = new Cat("Garfield", 100);
        Cat cat2 = new Cat("Tom", 150);
        Dog dog = new Dog("Snoopy", 200, false);
        Dog dog2 = new Dog("Bolt", 250, false);
        Dog dog3 = new Dog("Rocky", 400, false);
        animals.add(cat);
        animals.add(cat2);
        animals.add(dog);
        animals.add(dog2);
        animals.add(dog3);
        for (Animal animal : animals) {
            animal.sound();
            System.out.println(animal);
        }
        update(animals, sc);
    }
}
