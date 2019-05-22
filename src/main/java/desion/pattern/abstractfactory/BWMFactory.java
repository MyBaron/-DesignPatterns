package desion.pattern.abstractfactory;

public class BWMFactory implements IBWMFactory {

    @Override
    public Car createBTCar() {
        return new BTCar();
    }

    @Override
    public Car createGWCar() {
        return new GWCar();
    }
}
