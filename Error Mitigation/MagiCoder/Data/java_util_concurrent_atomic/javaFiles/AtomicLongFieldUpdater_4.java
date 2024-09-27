import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class AtomicLongFieldUpdater_4 {
    private static class Test {
        volatile long id;
    }

    public static void main(String[] args) {
        AtomicLongFieldUpdater<Test> updater = AtomicLongFieldUpdater.newUpdater(Test.class, "id");
        Test test = new Test();
        updater.lazySet(test, 10);
        System.out.println(test.id);
    }
}
