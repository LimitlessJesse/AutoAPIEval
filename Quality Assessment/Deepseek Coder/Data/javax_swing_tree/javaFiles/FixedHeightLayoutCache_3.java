import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.FixedHeightLayoutCache;
import javax.swing.tree.TreePath;

public class FixedHeightLayoutCache_3 {
    public static void main(String[] args) {
        // Create a tree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child1);
        root.add(child2);

        // Create a FixedHeightLayoutCache
        FixedHeightLayoutCache layoutCache = new FixedHeightLayoutCache();

        // Add the root node to the layout cache
        layoutCache.add(root);

        // Create a TreePath
        TreePath path = new TreePath(new int[] {0});

        // Get the row for the path
        int row = layoutCache.getRowForPath(path);

        // Print the row
        System.out.println("Row for path: " + row);
    }
}
