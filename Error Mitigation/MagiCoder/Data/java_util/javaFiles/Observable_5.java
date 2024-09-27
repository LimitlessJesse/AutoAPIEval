import java.util.Observable;

public class Observable_5 {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        System.out.println(observable.countObservers());
    }
}

class MyObservable extends Observable {
    public void change() {
        setChanged();
        notifyObservers();
    }
}
