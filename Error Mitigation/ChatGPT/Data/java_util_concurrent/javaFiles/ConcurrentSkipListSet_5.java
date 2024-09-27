import java.util.concurrent.ConcurrentSkipListSet;
import java.util.NavigableSet;

public class ConcurrentSkipListSet_5 {
    public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();
        set.add(3);
        set.add(1);
        set.add(2);
        
        NavigableSet<Integer> descendingSet = set.descendingSet();
        
        System.out.println("Original set: " + set);
        System.out.println("Descending set: " + descendingSet);
    }
}
