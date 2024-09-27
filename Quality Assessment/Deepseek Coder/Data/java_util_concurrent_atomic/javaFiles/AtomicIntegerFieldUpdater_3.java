import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class AtomicIntegerFieldUpdater_3 {
    private volatile int myValue;

    public static void main(String[] args) {
        AtomicIntegerFieldUpdater<AtomicIntegerFieldUpdater_3> updater = AtomicIntegerFieldUpdater.newUpdater(AtomicIntegerFieldUpdater_3.class, "myValue");
        AtomicIntegerFieldUpdater_3 obj = new AtomicIntegerFieldUpdater_3();
        updater.lazySet(obj, 10);
        System.out.println(obj.myValue);
    }
}
