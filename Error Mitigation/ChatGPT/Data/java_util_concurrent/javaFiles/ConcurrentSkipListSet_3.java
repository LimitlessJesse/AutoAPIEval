import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSet_3 {
    public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        
        System.out.println("Initial set: " + set);
        
        Integer firstElement = set.pollFirst();
        
        System.out.println("First element removed: " + firstElement);
        System.out.println("Set after removal: " + set);
    }
}
