package trafficlight.Observer;

import trafficlight.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> list = new ArrayList<>();

    public void addObserver(Observer observer){
        this.list.add(observer);
    }
    public void removeObserver(Observer observer){
        this.list.remove(observer);
    }
    public void notifyObservers(){
        for(Observer observer : this.list){
            observer.update();
        }
    }
}
