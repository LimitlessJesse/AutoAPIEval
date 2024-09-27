import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySet_3 {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        set.add(1);
        set.add(2);
        set.add(3);
    
        CopyOnWriteArraySet<Integer> otherSet = new CopyOnWriteArraySet<>();
        otherSet.add(2);
        otherSet.add(3);
        
        boolean removed = set.removeAll(otherSet);
        System.out.println("Elements removed: " + removed);
        System.out.println("Remaining elements: " + set);
    }
}
