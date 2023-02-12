package person;

public class Driver extends Person{

    public Driver(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void work() {
        System.out.println("The driver drives the car");
    }
}
