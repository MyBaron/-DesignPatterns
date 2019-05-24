package desion.pattern.abstractfactory;

public class Test {

    public static void main(String[] args) {
        IFactory ibwmFactory = new BWMFactory();
        ibwmFactory.createBTCar().show();
        ibwmFactory.createGWCar().show();
        IFactory benz = new BenzFactory();
        benz.createBTCar().show();
        benz.createGWCar().show();
    }
}
