import java.util.HashSet;

public class HashSet_1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        boolean added = set.add("Hello");
        System.out.println("Element added successfully: " + added);
    }
}
