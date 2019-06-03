package desion.pattern.observer.two;

import desion.pattern.prototype.Concrete;

public class Test {

    public static void main(String[] args) {
        ConcreteObservable concreteObservable = new ConcreteObservable();
        for (int i = 0; i < 10; i++) {
            ConcreteObserver concreteObserver = new ConcreteObserver(i);
            concreteObservable.addObserver(concreteObserver);
        }
        concreteObservable.show();
    }
}
