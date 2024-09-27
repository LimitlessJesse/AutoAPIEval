import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue_5 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        
        System.out.println("Size of the queue: " + queue.size());
    }
}
