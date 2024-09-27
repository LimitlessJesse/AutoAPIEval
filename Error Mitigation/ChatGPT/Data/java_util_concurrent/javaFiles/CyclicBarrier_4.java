import java.util.concurrent.CyclicBarrier;

public class CyclicBarrier_4 {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3);
        boolean broken = barrier.isBroken();
        System.out.println("Is barrier broken? " + broken);
    }
}
