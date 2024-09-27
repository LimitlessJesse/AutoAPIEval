import java.util.TreeSet;
import java.util.Arrays;

public class TreeSet_2 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Hello");
        treeSet.add("World");

        TreeSet<String> newTreeSet = new TreeSet<>(Arrays.asList("Java", "Python"));
        treeSet.addAll(newTreeSet);

        System.out.println(treeSet);
    }
}
