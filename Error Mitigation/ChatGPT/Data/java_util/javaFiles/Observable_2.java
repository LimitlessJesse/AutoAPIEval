import java.util.Observable;
import java.util.Observer;

public class Observable_2 {
    public static void main(String[] args) {
        Observable observable = new Observable();
        Observer observer = new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("Observer updated");
            }
        };
        
        observable.addObserver(observer);
        observable.deleteObserver(observer);
    }
}
