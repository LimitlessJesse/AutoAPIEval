import java.util.HashSet;

public class HashSet_2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Hello");
        
        // Remove "Hello" from the HashSet
        boolean removed = set.remove("Hello");
        
        System.out.println("Element removed: " + removed);
        System.out.println("Updated HashSet: " + set);
    }
}
