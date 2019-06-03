package desion.pattern.observer.one;


//具体主题
public class ConcreteSubject extends Subject {


    @Override
    public void doSomething() {
        System.out.println("被观察者事件反生");
        this.notifyObserver();  //通知观察者
    }
}
