import java.util.Observable;

public class Observable_5 {
    public static void main(String[] args) {
        CustomObservable observable = new CustomObservable();
        CustomObserver observer1 = new CustomObserver();
        CustomObserver observer2 = new CustomObserver();

        observable.addObserver(observer1);
        observable.addObserver(observer2);

        observable.deleteObservers();

        observable.notifyObservers("Data has been updated");
    }
}

class CustomObservable extends Observable {
    // CustomObservable class
}

class CustomObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Observer notified: " + arg);
    }
}
