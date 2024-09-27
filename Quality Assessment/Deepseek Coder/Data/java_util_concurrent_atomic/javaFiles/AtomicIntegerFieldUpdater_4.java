import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class AtomicIntegerFieldUpdater_4 {
    public static class Test {
        public volatile int value;
    }

    public static void main(String[] args) {
        AtomicIntegerFieldUpdater<Test> updater = AtomicIntegerFieldUpdater.newUpdater(Test.class, "value");
        Test test = new Test();
        int result = updater.getAndIncrement(test);
        System.out.println("Result: " + result);
        System.out.println("Updated value: " + test.value);
    }
}
