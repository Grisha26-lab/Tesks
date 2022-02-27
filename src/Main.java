import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Gull;
import doctor.PetDoctor;

public class Main {
    public static void main(String[] args) {


        Animal[] animals = {
                new Cat("Tom","My leg is broken"),
                new Cat("Sam","I twisted my leg"),
                new Cat("Ken","I want to sleep  "),
                new Dog("Sit","I itch all over"),
                new Dog("Dem","I have worms"),
                new Dog("Soul","I have fleas"),
                new Gull("Gektor","I'm flying too low"),
                new Gull("Salomon","The sea is storming me"),
                new Gull("Zeus","And they just promised me fish if I come here")};


        for (Animal animal : animals) {
            new PetDoctor().hello();
            animal.hello();
            animal.describeDisease();

        }

    }
}
