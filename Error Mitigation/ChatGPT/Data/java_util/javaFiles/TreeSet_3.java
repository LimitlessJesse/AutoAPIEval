import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSet_3 {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        
        NavigableSet<Integer> headSet = set.headSet(3, true);
        
        System.out.println("Head set elements: " + headSet);
    }
}
