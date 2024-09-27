import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSet_2 {
    public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();
        set.add(5);

        System.out.println("Initial Set: " + set);

        // Using E ceiling(E e) method
        Integer ceilingValue = set.ceiling(3);
        System.out.println("Ceiling value of 3: " + ceilingValue);
    }
}
