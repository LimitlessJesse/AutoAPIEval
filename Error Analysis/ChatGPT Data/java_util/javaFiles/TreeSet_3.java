import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet_3 {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(1);
        set.add(2);
        
        System.out.println("Set elements: " + set);
        
        System.out.println("Elements less than 2 (headSet): " + set.headSet(2));
    }
}
