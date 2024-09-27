import java.util.concurrent.SynchronousQueue;

public class SynchronousQueue_5 {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        System.out.println("Remaining Capacity: " + queue.remainingCapacity());
    }
}
