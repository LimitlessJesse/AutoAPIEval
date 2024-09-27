import java.util.Observable;

public class Observable_4 {
    public static void main(String[] args) {
        Observable observable = new Observable();
        System.out.println("Number of observers: " + observable.countObservers());
    }
}
