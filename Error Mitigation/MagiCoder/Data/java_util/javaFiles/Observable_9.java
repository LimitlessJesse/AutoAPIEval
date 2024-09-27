import java.util.Observable;

public class Observable_9 {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        observable.addObserver((o, arg) -> System.out.println("Data has changed!"));
        observable.setChanged();
        observable.notifyObservers();
        observable.clearChanged();
    }
}

class MyObservable extends Observable {
    public void setChanged() {
        super.setChanged();
    }
}
