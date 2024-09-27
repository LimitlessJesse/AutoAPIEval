import java.util.concurrent.CountDownLatch;

public class CountDownLatch_3 {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(1);
        System.out.println("Current count: " + latch.getCount());
    }
}
