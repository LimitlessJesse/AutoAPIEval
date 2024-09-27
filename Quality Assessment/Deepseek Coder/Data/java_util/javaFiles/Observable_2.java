import java.util.Observable;
import java.util.Observer;

class MyObservable extends Observable {
    public void changeState() {
        setChanged();
        notifyObservers();
    }
}

class MyObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("State has changed");
    }
}

public class Observable_2 {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        MyObserver observer = new MyObserver();

        observable.addObserver(observer);
        observable.changeState();

        observable.deleteObserver(observer);
        observable.changeState();
    }
}
