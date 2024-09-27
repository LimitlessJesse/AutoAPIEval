import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_3 {
    public static void main(String[] args) {
        LinkedBlockingDeque<Integer> deque = new LinkedBlockingDeque<>(5);
        
        System.out.println("Offering element 1: " + deque.offer(1));
        System.out.println("Offering element 2: " + deque.offer(2));
        System.out.println("Offering element 3: " + deque.offer(3));
        System.out.println("Offering element 4: " + deque.offer(4));
        System.out.println("Offering element 5: " + deque.offer(5));
        System.out.println("Offering element 6: " + deque.offer(6));
    }
}
