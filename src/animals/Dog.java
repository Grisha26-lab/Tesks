package animals;

public class Dog extends Animal  {


    public Dog(String name, String disease) {
        super(name, disease);
    }

    @Override
    public void hello() {
        System.out.println("Bark "+getName());

    }

    @Override
    public void describeDisease() {
        System.out.println(getDisease());
    }
}
