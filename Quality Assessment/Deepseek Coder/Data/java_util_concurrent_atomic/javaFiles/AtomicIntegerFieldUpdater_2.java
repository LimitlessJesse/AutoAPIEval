import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class AtomicIntegerFieldUpdater_2 {
    private volatile int myField;

    public static void main(String[] args) {
        AtomicIntegerFieldUpdater_2 main = new AtomicIntegerFieldUpdater_2();
        AtomicIntegerFieldUpdater<AtomicIntegerFieldUpdater_2> updater = AtomicIntegerFieldUpdater.newUpdater(AtomicIntegerFieldUpdater_2.class, "myField");
        boolean result = updater.compareAndSet(main, 0, 1);
        System.out.println(result); // prints: true
        System.out.println(main.myField); // prints: 1
    }
}
