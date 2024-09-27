import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueue_1 {
    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>(5);
        
        System.out.println(queue.offer(1)); // true
        System.out.println(queue.offer(2)); // true
        System.out.println(queue.offer(3)); // true
        System.out.println(queue.offer(4)); // true
        System.out.println(queue.offer(5)); // true
        System.out.println(queue.offer(6)); // false
    }
}
