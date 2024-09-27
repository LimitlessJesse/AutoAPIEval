import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class AtomicLongFieldUpdater_5 {
    private static class Test {
        volatile long field;
    }

    public static void main(String[] args) {
        AtomicLongFieldUpdater<Test> updater = AtomicLongFieldUpdater.newUpdater(Test.class, "field");
        Test test = new Test();

        // Set the field to 10
        updater.set(test, 10);

        // Atomically set the field to 20 if it is currently 10
        boolean result = updater.weakCompareAndSet(test, 10, 20);

        System.out.println("Result: " + result);
        System.out.println("Field: " + test.field);
    }
}
