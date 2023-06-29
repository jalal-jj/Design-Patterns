package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractObservable {
    private List<IObserver> observerList;

    public AbstractObservable() {
        this.observerList = new ArrayList<>();
    }

    public void addObserver(IObserver observer) {
        observerList.add(observer);
    }

    public void removeObserver(IObserver observer) {
        observerList.remove(observer);
    }
    public void sendNotification(){
        for (IObserver observer:observerList){
            observer.getNotification(this);
        }
    }

}
