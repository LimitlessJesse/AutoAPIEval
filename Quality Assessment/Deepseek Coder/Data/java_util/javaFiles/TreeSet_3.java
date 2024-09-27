import java.util.TreeSet;

public class TreeSet_3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Hello");
        treeSet.add("World");

        boolean containsHello = treeSet.contains("Hello");
        boolean containsJava = treeSet.contains("Java");

        System.out.println("Contains 'Hello': " + containsHello);
        System.out.println("Contains 'Java': " + containsJava);
    }
}
