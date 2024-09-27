import java.util.TreeSet;

public class TreeSet_4 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Hello");
        treeSet.add("World");

        System.out.println(treeSet.contains("Hello"));  // Outputs: true
        System.out.println(treeSet.contains("Java"));  // Outputs: false
    }
}
