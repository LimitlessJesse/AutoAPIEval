import java.util.Observable;
import java.util.Observer;

class MyObservable extends Observable {
    private String data;

    public void setData(String data) {
        this.data = data;
        setChanged();
        notifyObservers(data);
    }
}

class MyObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Data changed to: " + arg);
    }
}

public class Observable_4 {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        MyObserver observer = new MyObserver();
        observable.addObserver(observer);

        observable.setData("Hello, World!");
    }
}
