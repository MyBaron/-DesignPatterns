package desion.pattern.observer.one;

public class Test {

    public static void main(String[] args) {
        //建被观察者对象
        ConcreteSubject concreteSubject = new ConcreteSubject();
        //建立两个观察者
        concreteSubject.addObserver(new ConcreteObserver1());
        concreteSubject.addObserver(new ConcreteObserver2());
        //被观察者执行业务
        concreteSubject.doSomething();
    }
}
