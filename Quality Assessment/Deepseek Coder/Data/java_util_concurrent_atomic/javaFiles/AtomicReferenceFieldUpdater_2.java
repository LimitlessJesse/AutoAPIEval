import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class AtomicReferenceFieldUpdater_2 {
    public static class TestClass {
        volatile int value;
    }

    public static void main(String[] args) {
        TestClass test = new TestClass();
        AtomicReferenceFieldUpdater<TestClass, Integer> updater = AtomicReferenceFieldUpdater.newUpdater(TestClass.class, int.class, "value");

        boolean result = updater.compareAndSet(test, 0, 1);
        System.out.println(result);  // true
        System.out.println(test.value);  // 1

        result = updater.compareAndSet(test, 1, 2);
        System.out.println(result);  // true
        System.out.println(test.value);  // 2

        result = updater.compareAndSet(test, 0, 3);
        System.out.println(result);  // false
        System.out.println(test.value);  // 2
    }
}
