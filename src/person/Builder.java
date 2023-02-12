package person;

public class Builder extends Person{

    public Builder(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void work() {
        System.out.println("The foreman is building a building");
    }
}
