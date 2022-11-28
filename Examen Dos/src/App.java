import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void printStore(ArrayList<Animal> animals){
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
    
    public static void defaultAnimals(ArrayList<Animal> animals){
        animals.add(new Cat("Garfield", 100, 5));
        animals.add(new Cat("Tom", 150, 15));
        animals.add(new Dog("Snoopy", 200, true , 2));
        animals.add(new Dog("Bolt", 250, false, 1));
        animals.add(new Dog("Rocky", 400, true, 6));
    }

    public static void update(ArrayList<Animal> animals, Scanner sc){
        for(Animal animal : animals){
            if (animal instanceof Dog){
                System.out.println("My name is " + animal.getName() + " and my price is " + animal.getPrice());
                ((Dog) animal).sterilizer();    
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
        defaultAnimals(animals);
        printStore(animals);
        update(animals, sc);
    }
}
