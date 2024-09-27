import java.util.concurrent.CyclicBarrier;

public class CyclicBarrier_2 {
    public static void main(String[] args) {
        int parties = 3;
        CyclicBarrier barrier = new CyclicBarrier(parties);
        System.out.println("Number of parties: " + barrier.getParties());
    }
}
