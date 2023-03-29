import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Animal animal = new Animal("animal", "big", 100); // error
        Dog dog = new Dog("Wolf", "big", 24);
        System.out.println(dog);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepard", "big", 150));
        animals.add(new Fish("Goldfish", "small", 1));
        animals.add(new Fish("Barracuda", "big", 75));
        animals.add(new Dog("Pug", "small", 20));

        animals.add(new Horse("Clydesdale", "large", 1000));

        for (Animal animal : animals) {
            doAnimalStuff(animal);

            if (animal instanceof Mammal currentMammal) {
                currentMammal.shedHair();
            }

            System.out.println("-".repeat(30));
        }

    }

    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");
    }
}