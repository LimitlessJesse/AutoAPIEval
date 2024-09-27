import java.util.TreeSet;

public class TreeSet_5 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Element1");
        treeSet.add("Element2");
        treeSet.add("Element3");

        System.out.println("Original TreeSet: " + treeSet);

        treeSet.clear();

        System.out.println("After clear(): " + treeSet);
    }
}
