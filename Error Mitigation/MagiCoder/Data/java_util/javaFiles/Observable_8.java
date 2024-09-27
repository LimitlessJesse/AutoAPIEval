import java.util.Observable;

public class Observable_8 {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        observable.setChanged();
    }
}

class MyObservable extends Observable {
    public void setChanged() {
        super.setChanged();
    }
}
