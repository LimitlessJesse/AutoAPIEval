import java.util.HashSet;

public class HashSet_5 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Hello");
        set.add("World");
        System.out.println("Before removal: " + set);

        boolean isRemoved = set.remove("Hello");
        System.out.println("After removal: " + set);
        System.out.println("Is removed? " + isRemoved);
    }
}
