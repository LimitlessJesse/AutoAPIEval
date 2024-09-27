import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTree_32 {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        JTree tree = new JTree(root);

        // Add child nodes
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        root.add(child1);
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child2);

        // Print the state of getShowsRootHandles()
        System.out.println("getShowsRootHandles(): " + tree.getShowsRootHandles());
    }
}
