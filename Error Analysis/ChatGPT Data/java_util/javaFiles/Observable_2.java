import java.util.Observable;
import java.util.Observer;

public class Observable_2 {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        MyObserver observer = new MyObserver();

        observable.addObserver(observer);
        observable.deleteObserver(observer);
    }

    static class MyObservable extends Observable {
    }

    static class MyObserver implements Observer {
        @Override
        public void update(Observable o, Object arg) {
            System.out.println("Observer notified");
        }
    }
}
