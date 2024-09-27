import java.util.TreeSet;

public class TreeSet_2 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Hello");
        treeSet.add("World");
        System.out.println("Original TreeSet: " + treeSet);

        boolean isRemoved = treeSet.remove("World");
        System.out.println("Is 'World' removed? " + isRemoved);
        System.out.println("TreeSet after removal: " + treeSet);
    }
}
