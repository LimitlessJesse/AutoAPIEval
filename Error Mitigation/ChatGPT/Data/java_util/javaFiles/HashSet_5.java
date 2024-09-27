import java.util.HashSet;

public class HashSet_5 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Hello");
        set.add("World");
        
        System.out.println("Set before clear: " + set);
        
        set.clear();
        
        System.out.println("Set after clear: " + set);
    }
}
