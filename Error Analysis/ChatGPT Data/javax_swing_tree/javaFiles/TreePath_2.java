import javax.swing.tree.TreePath;

public class TreePath_2 {
    public static void main(String[] args) {
        Object[] path = { "parent", "child1", "child2" };
        TreePath treePath = new TreePath(path);
        System.out.println("Path Count: " + treePath.getPathCount());
    }
}
