import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class AtomicIntegerFieldUpdater_3 {
    private static class Test {
        volatile int value;
    }

    public static void main(String[] args) {
        AtomicIntegerFieldUpdater<Test> updater = AtomicIntegerFieldUpdater.newUpdater(Test.class, "value");
        Test test = new Test();
        test.value = 10;
        System.out.println(updater.get(test)); // Output: 10
    }
}
