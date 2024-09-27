import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue_4 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
        queue.add("Hello");
        queue.add("World");
        System.out.println(queue.poll()); // Output: Hello
        System.out.println(queue.poll()); // Output: World
        System.out.println(queue.poll()); // Output: null
    }
}
