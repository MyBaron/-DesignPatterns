package desion.pattern.factorymodel;

public class AudiFactory extends CarFactory {
    @Override
    public Car getCar() {
        return new AudiCar();
    }
}
