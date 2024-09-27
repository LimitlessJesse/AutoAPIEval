import java.util.HashSet;

public class HashSet_3 {
    public static void main(String[] args) {
        // Create a new HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements to the set
        set.add("Hello");
        set.add("World");

        // Check if the set contains a specific element
        boolean containsHello = set.contains("Hello");
        boolean containsJava = set.contains("Java");

        // Print the results
        System.out.println("Contains 'Hello': " + containsHello);
        System.out.println("Contains 'Java': " + containsJava);
    }
}
