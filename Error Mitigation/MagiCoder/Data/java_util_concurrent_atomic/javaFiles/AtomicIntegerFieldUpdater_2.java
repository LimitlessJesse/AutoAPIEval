import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class AtomicIntegerFieldUpdater_2 {
    private static class Test {
        volatile int value;
    }

    public static void main(String[] args) {
        AtomicIntegerFieldUpdater<Test> updater = AtomicIntegerFieldUpdater.newUpdater(Test.class, "value");
        Test test = new Test();

        // Atomic update
        boolean result = updater.compareAndSet(test, 0, 10);
        System.out.println("Update result: " + result);
        System.out.println("Updated value: " + test.value);
    }
}
