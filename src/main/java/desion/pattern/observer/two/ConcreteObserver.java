package desion.pattern.observer.two;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {
    private int number;

    public ConcreteObserver(int number) {
        this.number = number;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(String.format("观众%s鼓掌", number));
    }
}
