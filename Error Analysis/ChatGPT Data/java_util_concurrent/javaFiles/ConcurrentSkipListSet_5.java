import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSet_5 {
    public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();
        
        set.add(1);
        set.add(2);
        set.add(3);
        
        System.out.println("Initial Set: " + set);
        
        Integer lastElement = set.pollLast();
        
        System.out.println("Removed Last Element: " + lastElement);
        System.out.println("Final Set: " + set);
    }
}
