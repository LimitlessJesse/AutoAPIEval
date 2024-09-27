import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueue_4 {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>(5);
        
        try {
            queue.put("Java");
            queue.put("Python");
            queue.put("C++");
            System.out.println("Elements in queue: " + queue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
