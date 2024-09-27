import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet_4 {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();
        
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(4);
        
        System.out.println("Original Set: " + set);
        
        SortedSet<Integer> tailSet = ((TreeSet<Integer>) set).tailSet(2);
        
        System.out.println("Tail Set starting from element 2: " + tailSet);
    }
}
