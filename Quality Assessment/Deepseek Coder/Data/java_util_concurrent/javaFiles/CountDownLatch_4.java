import java.util.concurrent.CountDownLatch;

public class CountDownLatch_4 {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);
        System.out.println("Initial count: " + latch.getCount());

        latch.countDown();
        System.out.println("Count after first countDown(): " + latch.getCount());

        latch.countDown();
        System.out.println("Count after second countDown(): " + latch.getCount());

        latch.countDown();
        System.out.println("Count after third countDown(): " + latch.getCount());
    }
}
