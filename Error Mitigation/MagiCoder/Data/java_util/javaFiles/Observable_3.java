import java.util.Observable;

public class Observable_3 {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        observable.addObserver(new MyObserver());
        observable.deleteObservers();
    }
}

class MyObservable extends Observable {
    public void changeData() {
        setChanged();
        notifyObservers();
    }
}

class MyObserver implements java.util.Observer {
    public void update(Observable o, Object arg) {
        System.out.println("Data has changed!");
    }
}
