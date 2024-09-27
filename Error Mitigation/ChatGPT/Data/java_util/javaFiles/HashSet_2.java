import java.util.HashSet;

public class HashSet_2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Hello");
        set.add("World");
        
        System.out.println("Set before removal: " + set);
        
        boolean isRemoved = set.remove("Hello");
        
        System.out.println("Element 'Hello' removed: " + isRemoved);
        System.out.println("Set after removal: " + set);
    }
}
