import java.util.concurrent.CyclicBarrier;

public class CyclicBarrier_5 {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3);
        boolean isBroken = barrier.isBroken();
        System.out.println("Barrier is broken: " + isBroken);
    }
}
