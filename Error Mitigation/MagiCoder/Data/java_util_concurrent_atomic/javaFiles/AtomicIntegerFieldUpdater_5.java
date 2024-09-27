import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class AtomicIntegerFieldUpdater_5 {
    private static class Test {
        volatile int value;
    }

    public static void main(String[] args) {
        AtomicIntegerFieldUpdater<Test> updater = AtomicIntegerFieldUpdater.newUpdater(Test.class, "value");
        Test test = new Test();
        int oldValue = updater.getAndSet(test, 10);
        System.out.println("Old value: " + oldValue);
        System.out.println("New value: " + test.value);
    }
}
