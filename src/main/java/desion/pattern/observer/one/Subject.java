package desion.pattern.observer.one;

import java.util.concurrent.CopyOnWriteArrayList;

//抽象主题
public abstract class Subject {

    private CopyOnWriteArrayList<Observer> obs = new CopyOnWriteArrayList();

    public void addObserver(Observer obs){
        this.obs.add(obs);
    }
    public void delObserver(Observer obs){
        this.obs.remove(obs);
    }
    protected void notifyObserver(){
        for(Observer o: obs){
            o.update();
        }
    }
    public abstract void doSomething();


}
