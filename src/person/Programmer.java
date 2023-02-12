package person;

public class Programmer extends Person{


    public Programmer(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void work() {
        System.out.println("The programmer writes the code");
    }
}
