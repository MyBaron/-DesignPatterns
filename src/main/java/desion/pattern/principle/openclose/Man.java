package desion.pattern.principle.openclose;

public class Man implements Person {
    private int age;


    @Override
    public void eat() {
        System.out.println("每天都要吃饭");
    }
}
