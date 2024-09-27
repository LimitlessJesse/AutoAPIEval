import java.util.TreeSet;

public class TreeSet_5 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(8);

        System.out.println("TreeSet before pollFirst(): " + treeSet);

        Integer firstElement = treeSet.pollFirst();

        System.out.println("First element removed: " + firstElement);
        System.out.println("TreeSet after pollFirst(): " + treeSet);
    }
}
