import java.util.Observable;
import java.util.Observer;

public class Observable_1 {
    public static void main(String[] args) {
        MyObservableObject observable = new MyObservableObject();
        MyObserver observer1 = new MyObserver();
        MyObserver observer2 = new MyObserver();
        
        observable.addObserver(observer1);
        observable.addObserver(observer2);
    }
}

class MyObservableObject extends Observable {
    // Your implementation here
}

class MyObserver implements Observer {
    // Your implementation here
}
