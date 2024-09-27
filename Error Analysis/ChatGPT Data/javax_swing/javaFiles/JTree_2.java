import javax.swing.tree.TreePath;
import javax.swing.JTree;

public class JTree_2 {
    public static void main(String[] args) {
        JTree tree = new JTree();
        TreePath leadPath = tree.getLeadSelectionPath();
        System.out.println("Lead selection path: " + leadPath);
    }
}
