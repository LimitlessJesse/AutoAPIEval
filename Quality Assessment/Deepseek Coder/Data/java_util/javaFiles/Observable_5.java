import java.util.Observable;
import java.util.Observer;

public class Observable_5 {
    public static void main(String[] args) {
        Observable observable = new Observable() {
            // Override the method to provide custom logic
            @Override
            public synchronized void addObserver(Observer o) {
                if (o == null)
                    throw new NullPointerException();
                if (!l.contains(o)) {
                    l.add(o);
                }
            }
        };

        // Add observers
        observable.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("Observer 1 received update: " + arg);
            }
        });

        observable.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("Observer 2 received update: " + arg);
            }
        });

        // Count observers
        int count = observable.countObservers();
        System.out.println("Number of observers: " + count);

        // Notify observers
        observable.notifyObservers("Hello, observers!");
    }
}
