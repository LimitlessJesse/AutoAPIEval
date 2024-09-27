import java.util.TreeSet;

public class TreeSet_5 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Hello");
        treeSet.add("World");
        System.out.println("Before removal: " + treeSet);

        boolean isRemoved = treeSet.remove("Hello");
        System.out.println("After removal: " + treeSet);
        System.out.println("Is removed? " + isRemoved);
    }
}
