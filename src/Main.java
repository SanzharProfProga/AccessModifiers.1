import person.Builder;
import person.Driver;
import person.Person;
import person.Programmer;

public class Main {
    public static void main(String[] args)
    {
        Programmer programmer = new Programmer("Sanzhar",19);
        Builder builder = new Builder("Ron",31);
        Driver driver = new Driver("Stan",27);
        Person [] people = {programmer,builder,driver};
        for (Person p:people) {
            System.out.println(p.toString());
            p.work();
        }
    }
}