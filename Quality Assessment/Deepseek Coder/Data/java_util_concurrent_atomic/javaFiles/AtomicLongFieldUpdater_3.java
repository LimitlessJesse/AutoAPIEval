import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class AtomicLongFieldUpdater_3 {
    public static class Test {
        public volatile long value;
    }

    public static void main(String[] args) {
        AtomicLongFieldUpdater<Test> updater = AtomicLongFieldUpdater.newUpdater(Test.class, "value");
        Test test = new Test();
        updater.lazySet(test, 10);
        System.out.println(test.value);
    }
}
