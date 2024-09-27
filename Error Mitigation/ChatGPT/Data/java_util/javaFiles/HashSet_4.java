import java.util.HashSet;

public class HashSet_4 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Hello");
        
        boolean containsElement = set.contains("Hello");
        System.out.println("Set contains 'Hello': " + containsElement);
    }
}
