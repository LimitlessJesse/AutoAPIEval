import java.util.concurrent.CountDownLatch;

public class CountDownLatch_5 {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);
        System.out.println(latch.toString());
    }
}
