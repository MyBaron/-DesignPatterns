package desion.pattern.factorymodel;

public class Test {

    public static void main(String[] args) {
        Car audi = new AudiFactory().getCar();
        Car benz = new BenzFactory().getCar();
        Car bwm = new BWMFactory().getCar();
        audi.dirver();
        benz.dirver();
        bwm.dirver();
    }
}
