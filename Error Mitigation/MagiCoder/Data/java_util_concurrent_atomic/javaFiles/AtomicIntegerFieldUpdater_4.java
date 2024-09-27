import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class AtomicIntegerFieldUpdater_4 {
    private static class Test {
        volatile int value;
    }

    public static void main(String[] args) {
        AtomicIntegerFieldUpdater<Test> updater = AtomicIntegerFieldUpdater.newUpdater(Test.class, "value");
        Test test = new Test();
        int previousValue = updater.getAndAdd(test, 10);
        System.out.println("Previous value: " + previousValue);
        System.out.println("Current value: " + test.value);
    }
}
