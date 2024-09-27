import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class TreePath_4 {
    public static void main(String[] args) {
        // Create a tree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child1);
        root.add(child2);

        // Create a TreePath
        TreePath path = new TreePath(new Object[] {root, child1});

        // Get the path
        Object[] pathArray = path.getPath();

        // Print the path
        for (Object node : pathArray) {
            System.out.println(node);
        }
    }
}
