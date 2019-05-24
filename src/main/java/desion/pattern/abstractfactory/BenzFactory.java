package desion.pattern.abstractfactory;

public class BenzFactory implements IFactory {
    @Override
    public Car createBTCar() {
        return new BenzBTCar();
    }

    @Override
    public Car createGWCar() {
        return new BenzGWCar();
    }
}
