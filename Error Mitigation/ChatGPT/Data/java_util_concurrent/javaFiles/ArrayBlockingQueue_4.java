import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue_4 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        System.out.println("Remaining Capacity: " + queue.remainingCapacity());
        queue.add(1);
        System.out.println("Remaining Capacity after adding 1 element: " + queue.remainingCapacity());
    }
}
