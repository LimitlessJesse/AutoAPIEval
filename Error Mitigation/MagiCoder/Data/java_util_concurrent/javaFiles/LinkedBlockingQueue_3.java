import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueue_3 {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>(2);
        System.out.println(queue.offer("Hello")); // true
        System.out.println(queue.offer("World")); // true
        System.out.println(queue.offer("Java")); // false, queue is full
    }
}
