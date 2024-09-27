import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSet_4 {
    public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        
        System.out.println("Initial set: " + set);
        
        Integer lastElement = set.pollLast();
        
        System.out.println("Last element removed: " + lastElement);
        System.out.println("Set after removal: " + set);
    }
}
