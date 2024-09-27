import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSet_1 {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        
        System.out.println("Ceiling for 2: " + set.ceiling(2));
        System.out.println("Ceiling for 3: " + set.ceiling(3));
        System.out.println("Ceiling for 6: " + set.ceiling(6));
    }
}
