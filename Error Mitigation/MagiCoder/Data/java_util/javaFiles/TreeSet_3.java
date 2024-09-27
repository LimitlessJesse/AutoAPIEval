import java.util.TreeSet;

public class TreeSet_3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Hello");
        treeSet.add("World");
        System.out.println("Before clear: " + treeSet);

        treeSet.clear();
        System.out.println("After clear: " + treeSet);
    }
}
