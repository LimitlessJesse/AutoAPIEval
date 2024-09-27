import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatch_4 {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(1);
        
        try {
            boolean result = latch.await(5, TimeUnit.SECONDS);
            System.out.println("Count reached zero: " + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
