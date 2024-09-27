import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySet_2 {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        
        System.out.println("Before removal: " + set);
        
        boolean removed = set.remove(2);
        
        System.out.println("After removal: " + set);
        System.out.println("Element 2 removed: " + removed);
    }
}
