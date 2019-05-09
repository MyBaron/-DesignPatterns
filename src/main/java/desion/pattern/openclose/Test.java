package desion.pattern.openclose;

public class Test {

    public static void main(String[] args) {
        Person person = new Man();
        if (person instanceof Man) {
            ((Man) person).washinghands();
            person.eat();
        }
    }
}
