import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSet_4 {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        
        NavigableSet<Integer> tailSet = set.tailSet(2, true);
        
        System.out.println("Original Set: " + set);
        System.out.println("Tail Set: " + tailSet);
    }
}
