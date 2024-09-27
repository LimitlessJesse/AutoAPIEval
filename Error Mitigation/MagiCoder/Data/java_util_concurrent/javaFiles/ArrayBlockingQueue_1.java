import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue_1 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
        try {
            queue.add("Hello");
            System.out.println(queue);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
