import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue_5 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
        queue.add("Hello");
        try {
            String element = queue.take();
            System.out.println(element);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
