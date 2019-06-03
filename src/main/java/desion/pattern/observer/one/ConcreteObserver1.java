package desion.pattern.observer.one;

public class ConcreteObserver1 implements Observer {
    @Override
    public void update() {
        System.out.println("观察者1收到信息，并进行处理。");
    }
}
