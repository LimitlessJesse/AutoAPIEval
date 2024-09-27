import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueue_5 {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        queue.add("Element1");
        queue.add("Element2");
        queue.add("Element3");

        System.out.println("Original Queue: " + queue);

        boolean isRemoved = queue.remove("Element2");

        System.out.println("Is 'Element2' removed? " + isRemoved);
        System.out.println("Updated Queue: " + queue);
    }
}
