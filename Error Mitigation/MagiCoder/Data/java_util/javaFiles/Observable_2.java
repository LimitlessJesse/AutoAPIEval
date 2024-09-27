import java.util.Observable;
import java.util.Observer;

public class Observable_2 {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        MyObserver observer = new MyObserver();

        observable.addObserver(observer);
        observable.setChanged();
        observable.notifyObservers();

        observable.deleteObserver(observer);
    }
}

class MyObservable extends Observable {
    public void changeData() {
        setChanged();
        notifyObservers();
    }
}

class MyObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Data has been changed!");
    }
}
