package desion.pattern.observer.two;

import java.util.Observable;


//被观察者
public class ConcreteObservable extends Observable {

    public void show(){
        System.out.println("表演一个舞蹈");
        this.setChanged();
        this.notifyObservers();
    }
}
