import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class AtomicLongFieldUpdater_2 {
    private volatile long myLong;

    public static void main(String[] args) {
        AtomicLongFieldUpdater<AtomicLongFieldUpdater_2> updater = AtomicLongFieldUpdater.newUpdater(AtomicLongFieldUpdater_2.class, "myLong");

        AtomicLongFieldUpdater_2 main = new AtomicLongFieldUpdater_2();
        boolean wasSuccessful = updater.compareAndSet(main, 0, 1);

        System.out.println("Was the update successful? " + wasSuccessful);
        System.out.println("New value of myLong: " + main.myLong);
    }
}
