import java.util.concurrent.CyclicBarrier;

public class CyclicBarrier_3 {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3);
        int numberWaiting = barrier.getNumberWaiting();
        System.out.println("Number of parties currently waiting at the barrier: " + numberWaiting);
    }
}
