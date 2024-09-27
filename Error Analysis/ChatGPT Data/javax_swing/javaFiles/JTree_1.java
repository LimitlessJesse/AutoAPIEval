import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

public class JTree_1 {
    public static void main(String[] args) {
        // Create a sample JTree with some nodes
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child1);
        root.add(child2);
        JTree tree = new JTree(root);

        // Expand the row at index 0 (the root node)
        expandRow(tree, 0);
    }

    public static void expandRow(JTree tree, int row) {
        TreeNode node = (TreeNode) tree.getModel().getRoot();
        if (node != null && row >= 0 && row < tree.getRowCount()) {
            tree.expandRow(row);
        }
    }
}
