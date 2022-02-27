package animals;

public class Cat extends Animal {

    public Cat(String name, String disease) {
        super(name, disease);
    }

    @Override
    public void hello() {
        System.out.println("Meow " + getName());
    }


    @Override
    public void describeDisease() {
        System.out.println(getDisease());
    }
}
