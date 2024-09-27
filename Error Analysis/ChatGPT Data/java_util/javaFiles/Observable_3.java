import java.util.Observable;
import java.util.Observer;

public class Observable_3 {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        MyObserver observer1 = new MyObserver("Observer 1");
        MyObserver observer2 = new MyObserver("Observer 2");

        observable.addObserver(observer1);
        observable.addObserver(observer2);

        observable.setChanged();
        observable.notifyObservers("Hello");
    }

    static class MyObservable extends Observable {
        @Override
        public void notifyObservers(Object arg) {
            setChanged();
            super.notifyObservers(arg);
        }
    }

    static class MyObserver implements Observer {
        private String name;

        public MyObserver(String name) {
            this.name = name;
        }

        @Override
        public void update(Observable o, Object arg) {
            System.out.println(name + " received: " + arg);
        }
    }
}
