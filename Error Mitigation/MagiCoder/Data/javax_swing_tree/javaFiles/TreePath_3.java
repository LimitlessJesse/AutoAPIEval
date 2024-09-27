import javax.swing.tree.TreePath;

public class TreePath_3 {
    public static void main(String[] args) {
        TreePath treePath = new TreePath(new Object[] {1, 2, 3});
        int pathCount = treePath.getPathCount();
        System.out.println("Number of elements in the path: " + pathCount);
    }
}
