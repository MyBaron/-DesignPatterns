package desion.pattern.factorymodel;

public class BWMFactory extends CarFactory {
    @Override
    public Car getCar() {
        return new BWMCar();
    }
}
