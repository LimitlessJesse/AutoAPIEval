import javax.swing.tree.TreePath;

public class TreePath_2 {
    public static void main(String[] args) {
        TreePath path = new TreePath(new Object[]{"root", "child1", "child2"});
        int count = path.getPathCount();
        System.out.println("Number of elements in the path: " + count);
    }
}
