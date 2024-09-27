import java.util.Observable;
import java.util.Observer;

public class Observable_1 {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        MyObserver observer = new MyObserver();
        
        observable.addObserver(observer);
        
        observable.notifyObservers("Hello");
    }
}

class MyObservable extends Observable {
    
}

class MyObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Received: " + arg);
    }
}
