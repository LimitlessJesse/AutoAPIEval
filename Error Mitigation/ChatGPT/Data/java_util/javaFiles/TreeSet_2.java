import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSet_2 {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        
        System.out.println("Floor of 2: " + set.floor(2)); // Output: 1
        System.out.println("Floor of 4: " + set.floor(4)); // Output: 3
        System.out.println("Floor of 6: " + set.floor(6)); // Output: 5
    }
}
