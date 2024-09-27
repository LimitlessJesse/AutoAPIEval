import java.util.Observable;
import java.util.Observer;

public class Observable_3 {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        MyObserver observer = new MyObserver();

        observable.addObserver(observer);
        observable.setChanged();
        observable.notifyObservers();
    }

    static class MyObservable extends Observable {
        public void setChanged() {
            super.setChanged();
        }
    }

    static class MyObserver implements Observer {
        @Override
        public void update(Observable o, Object arg) {
            System.out.println("Object has changed");
        }
    }
}
