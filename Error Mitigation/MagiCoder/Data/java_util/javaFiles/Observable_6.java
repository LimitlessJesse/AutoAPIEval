import java.util.Observable;
import java.util.Observer;

public class Observable_6 {
    public static void main(String[] args) {
        Observable observable = new Observable() {
            @Override
            protected synchronized void setChanged() {
                super.setChanged();
            }
        };

        Observer observer = new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("Data has changed!");
            }
        };

        observable.addObserver(observer);
        observable.setChanged();
        observable.notifyObservers();
    }
}
