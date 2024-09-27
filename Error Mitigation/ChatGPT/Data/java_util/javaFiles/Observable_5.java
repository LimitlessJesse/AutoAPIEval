import java.util.Observable;

public class Observable_5 {
    public static void main(String[] args) {
        Observable observable = new Observable();
        observable.addObserver((o, arg) -> {
            // do something when observer is notified
        });
        
        int numObservers = observable.countObservers();
        System.out.println("Number of observers: " + numObservers);
    }
}
