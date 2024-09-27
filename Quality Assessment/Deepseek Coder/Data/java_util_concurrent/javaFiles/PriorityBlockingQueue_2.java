import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue_2 {
    public static void main(String[] args) throws InterruptedException {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();

        queue.add(10);
        queue.add(20);
        queue.add(15);

        System.out.println(queue.take()); // It will remove and return the smallest element, which is 10
    }
}
