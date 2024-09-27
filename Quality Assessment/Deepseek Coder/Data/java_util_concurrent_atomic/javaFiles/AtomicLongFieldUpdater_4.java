import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class AtomicLongFieldUpdater_4 {
    private volatile long myLong;

    public static void main(String[] args) {
        AtomicLongFieldUpdater<AtomicLongFieldUpdater_4> updater = AtomicLongFieldUpdater.newUpdater(AtomicLongFieldUpdater_4.class, "myLong");

        AtomicLongFieldUpdater_4 obj = new AtomicLongFieldUpdater_4();
        boolean success = updater.weakCompareAndSet(obj, 0, 1);
        System.out.println("Update Successful: " + success);
        System.out.println("myLong: " + obj.myLong);
    }
}
