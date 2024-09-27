import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTree_3 {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");

        root.add(child1);
        root.add(child2);

        JTree tree = new JTree(root);
        tree.setShowsRootHandles(true);
    }
}
