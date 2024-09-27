import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class AtomicReferenceFieldUpdater_4 {
    private static class TestClass {
        volatile int value;
    }

    public static void main(String[] args) {
        AtomicReferenceFieldUpdater<TestClass, Integer> updater =
                AtomicReferenceFieldUpdater.newUpdater(TestClass.class, int.class, "value");

        TestClass testObj = new TestClass();
        System.out.println("Initial value: " + testObj.value);

        boolean success = updater.weakCompareAndSet(testObj, 0, 1);
        System.out.println("Update successful: " + success);
        System.out.println("Updated value: " + testObj.value);
    }
}
