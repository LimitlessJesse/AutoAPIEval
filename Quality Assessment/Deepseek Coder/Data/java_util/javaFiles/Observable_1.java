import java.util.Observable;
import java.util.Observer;

class MyObservable extends Observable {
    private String data;

    public void setData(String data) {
        this.data = data;
        setChanged();
        notifyObservers(data);
    }

    public String getData() {
        return this.data;
    }
}

class MyObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof MyObservable) {
            System.out.println("Data has been updated: " + ((MyObservable) o).getData());
        }
    }
}

public class Observable_1 {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        MyObserver observer = new MyObserver();

        observable.addObserver(observer);

        observable.setData("Hello, World!");
    }
}
