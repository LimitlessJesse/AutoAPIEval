import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class AtomicLongFieldUpdater_2 {
    private static class Test {
        volatile long field;
    }

    public static void main(String[] args) {
        AtomicLongFieldUpdater<Test> updater = AtomicLongFieldUpdater.newUpdater(Test.class, "field");
        Test test = new Test();

        // Atomic update
        boolean result = updater.compareAndSet(test, 0, 10);
        System.out.println("Update successful: " + result);
        System.out.println("Updated field value: " + test.field);
    }
}
