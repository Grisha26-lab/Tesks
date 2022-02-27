package animals;

public class Gull extends Animal {
    public Gull(String name, String disease) {
        super(name, disease);
    }

    @Override
    public void hello() {
        System.out.println("Squawk " + getName());
    }

    @Override
    public void describeDisease() {
        System.out.println(getDisease());

    }
}
