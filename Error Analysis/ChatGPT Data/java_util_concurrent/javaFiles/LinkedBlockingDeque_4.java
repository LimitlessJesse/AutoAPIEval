import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_4 {
    public static void main(String[] args) {
        LinkedBlockingDeque<Integer> deque = new LinkedBlockingDeque<>(10);

        deque.add(1);
        deque.add(2);
        deque.add(3);

        System.out.println("Remaining capacity: " + deque.remainingCapacity());
    }
}
