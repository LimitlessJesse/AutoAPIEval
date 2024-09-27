import java.util.HashSet;

public class HashSet_5 {
    public static void main(String[] args) {
        // Create a new HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements to the set
        set.add("Element 1");
        set.add("Element 2");
        set.add("Element 3");

        // Display the set
        System.out.println("Original HashSet: " + set);

        // Remove an element
        boolean isRemoved = set.remove("Element 2");

        // Display the result of the remove operation
        System.out.println("Is 'Element 2' removed? " + isRemoved);

        // Display the set after the remove operation
        System.out.println("HashSet after remove: " + set);
    }
}
