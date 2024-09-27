import javax.swing.tree.TreePath;

public class TreePath_1 {
    public static void main(String[] args) {
        Object[] path = { "root", "parent", "child" };
        TreePath treePath = new TreePath(path);
        
        Object lastPathComponent = treePath.getLastPathComponent();
        System.out.println("Last component: " + lastPathComponent);
    }
}
