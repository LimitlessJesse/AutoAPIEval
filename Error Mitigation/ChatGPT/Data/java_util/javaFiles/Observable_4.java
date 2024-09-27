import java.util.Observable;
import java.util.Observer;

public class Observable_4 {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        MyObserver observer = new MyObserver();

        observable.addObserver(observer);
        observable.notifyObservers("Hello World");
    }

    static class MyObservable extends Observable {
        public void notifyObservers(Object arg) {
            setChanged();
            super.notifyObservers(arg);
            clearChanged();
        }
    }

    static class MyObserver implements Observer {
        public void update(Observable o, Object arg) {
            System.out.println("Received update: " + arg);
        }
    }
}
