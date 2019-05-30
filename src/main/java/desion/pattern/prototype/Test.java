package desion.pattern.prototype;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p = new Concrete();
        for (int i = 0; i < 10; i++) {
            Prototype newObj = p.clone();
            ((Concrete)newObj).show();
            System.out.println(((Concrete) newObj).toString());
        }
    }
}
