import java.util.Observable;
import java.util.Observer;

class MyObservable extends Observable {
    private String data;

    public void setData(String data) {
        this.data = data;
        setChanged();
        notifyObservers();
    }

    public String getData() {
        return this.data;
    }
}

class MyObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        MyObservable observable = (MyObservable) o;
        System.out.println("Data has been changed to: " + observable.getData());
    }
}

public class Observable_3 {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        MyObserver observer = new MyObserver();

        observable.addObserver(observer);

        observable.setData("Hello, World!");
    }
}
