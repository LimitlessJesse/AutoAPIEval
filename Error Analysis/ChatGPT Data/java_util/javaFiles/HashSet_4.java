import java.util.HashSet;

public class HashSet_4 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Hello");
        
        // Using contains() method
        boolean containsElement = set.contains("Hello");
        
        System.out.println("Contains 'Hello': " + containsElement);
    }
}
