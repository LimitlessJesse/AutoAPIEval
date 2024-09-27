import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSet_5 {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(1);
        set.add(2);
        
        System.out.println("Set before pollFirst: " + set);
        
        Integer firstElement = set.pollFirst();
        
        System.out.println("First element removed: " + firstElement);
        System.out.println("Set after pollFirst: " + set);
    }
}
