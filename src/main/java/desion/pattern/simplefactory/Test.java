package desion.pattern.simplefactory;

import java.util.jar.JarEntry;

public class Test {

    public static void main(String[] args) {
        Car audi = CarFactory.carFactory(AudiCar.class);
        Car benz = CarFactory.carFactory(BenzCar.class);
        Car bwm = CarFactory.carFactory(BWMCar.class);
        audi.dirver();
        benz.dirver();
        bwm.dirver();
    }
}
