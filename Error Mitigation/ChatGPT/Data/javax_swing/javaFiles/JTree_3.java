import javax.swing.JTree;
import javax.swing.tree.TreePath;

public class JTree_3 {
    public static void main(String[] args) {
        JTree tree = new JTree();
        TreePath path = tree.getPathForRow(0);
        System.out.println("TreePath for row 0: " + path);
    }
}
