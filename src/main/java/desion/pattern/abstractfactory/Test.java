package desion.pattern.abstractfactory;

public class Test {

    public static void main(String[] args) {
        IBWMFactory ibwmFactory = new BWMFactory();
        ibwmFactory.createBTCar().show();
        ibwmFactory.createGWCar().show();
    }
}
