package animals;

public abstract class Animal implements PetsInterface {
    private String name;
    private String disease;

    public String getDisease() {
        return disease;
    }

    public String getName() {
        return name;
    }

    public Animal(String name, String disease) {
        this.name = name;
        this.disease = disease;

    }
}
