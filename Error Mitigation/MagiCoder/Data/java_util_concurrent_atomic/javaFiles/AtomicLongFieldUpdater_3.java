import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class AtomicLongFieldUpdater_3 {
    private static class Test {
        volatile long id;
    }

    public static void main(String[] args) {
        AtomicLongFieldUpdater<Test> updater = AtomicLongFieldUpdater.newUpdater(Test.class, "id");
        Test test = new Test();
        test.id = 10;
        System.out.println(updater.get(test)); // Output: 10
    }
}
