package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mustafa on 12/9/2017.
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState(){
        return  state;
    }
    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }
    public void attach(Observer observer){
        this.observers.add(observer);
    }
    public void notifyAllObservers(){
        for(Observer observer : observers){
            observer.update();
        }
    }
}
