import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.FixedHeightLayoutCache;
import javax.swing.tree.TreePath;

public class FixedHeightLayoutCache_4 {
    public static void main(String[] args) {
        // Create a tree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child1);
        root.add(child2);

        // Create a FixedHeightLayoutCache
        FixedHeightLayoutCache cache = new FixedHeightLayoutCache(root);

        // Get the TreePath for a row
        int row = 0;  // The row number
        TreePath path = cache.getPathForRow(row);

        // Print the TreePath
        System.out.println(path);
    }
}
