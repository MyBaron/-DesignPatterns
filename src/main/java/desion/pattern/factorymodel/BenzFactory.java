package desion.pattern.factorymodel;

public  class BenzFactory extends CarFactory {
    @Override
    public Car getCar() {
        return new BenzCar();
    }
}
