import java.util.HashSet;

public class HashSet_2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Hello");
        set.add("World");
        System.out.println("Before clear: " + set);
        set.clear();
        System.out.println("After clear: " + set);
    }
}
