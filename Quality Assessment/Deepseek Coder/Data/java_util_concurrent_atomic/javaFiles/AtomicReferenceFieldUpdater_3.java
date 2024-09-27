import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class AtomicReferenceFieldUpdater_3 {
    public static class Test {
        volatile String value;
    }

    public static void main(String[] args) {
        AtomicReferenceFieldUpdater<Test, String> updater =
                AtomicReferenceFieldUpdater.newUpdater(Test.class, String.class, "value");

        Test test = new Test();
        updater.lazySet(test, "Hello");

        System.out.println(test.value);
    }
}
