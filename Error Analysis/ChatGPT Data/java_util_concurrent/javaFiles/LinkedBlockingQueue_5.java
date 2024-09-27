import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueue_5 {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();
        queue.add("Element 1");
        queue.add("Element 2");

        System.out.println("Queue before removal: " + queue);

        boolean removed = queue.remove("Element 1");

        System.out.println("Removed: " + removed);
        System.out.println("Queue after removal: " + queue);
    }
}
