import java.util.concurrent.CyclicBarrier;

public class CyclicBarrier_1 {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3);
        int parties = barrier.getParties();
        System.out.println("Number of parties required to trip the barrier: " + parties);
    }
}
