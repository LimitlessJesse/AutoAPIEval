import java.util.Observable;

public class Observable_4 {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        System.out.println(observable.hasChanged()); // false
        observable.setChanged();
        System.out.println(observable.hasChanged()); // true
        observable.clearChanged();
        System.out.println(observable.hasChanged()); // false
    }
}

class MyObservable extends Observable {
    // Some other methods...
}
