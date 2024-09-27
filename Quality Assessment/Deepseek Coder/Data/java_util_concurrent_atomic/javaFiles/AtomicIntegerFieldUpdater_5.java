import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class AtomicIntegerFieldUpdater_5 {
    public static class Test {
        public volatile int value;
    }

    public static void main(String[] args) {
        AtomicIntegerFieldUpdater<Test> updater = AtomicIntegerFieldUpdater.newUpdater(Test.class, "value");
        Test test = new Test();
        test.value = 5;

        int result = updater.getAndDecrement(test);
        System.out.println("Result: " + result);
        System.out.println("Updated value: " + test.value);
    }
}
