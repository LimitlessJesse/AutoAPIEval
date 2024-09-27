import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class DefaultTreeModel_3 {
    public static void main(String[] args) {
        // Create a root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        // Create a tree model
        DefaultTreeModel model = new DefaultTreeModel(root);

        // Add child nodes
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        DefaultMutableTreeNode child3 = new DefaultMutableTreeNode("Child 3");

        root.add(child1);
        root.add(child2);
        child2.add(child3);

        // Get the count of child nodes of root
        int count = model.getChildCount(root);
        System.out.println("Number of child nodes under root: " + count);
    }
}
