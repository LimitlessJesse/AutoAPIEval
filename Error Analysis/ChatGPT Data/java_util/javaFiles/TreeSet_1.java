import java.util.TreeSet;

public class TreeSet_1 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);

        System.out.println(treeSet.ceiling(15)); // Output: 20
    }
}
