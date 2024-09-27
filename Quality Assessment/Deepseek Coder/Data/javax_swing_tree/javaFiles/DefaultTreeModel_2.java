import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class DefaultTreeModel_2 {
    public static void main(String[] args) {
        // Create a root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        // Create a tree model
        DefaultTreeModel model = new DefaultTreeModel(root);

        // Add child nodes
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        model.insertNodeInto(child1, root, 0);
        model.insertNodeInto(child2, root, 1);

        // Get a child node using getChild(Object parent, int index)
        DefaultMutableTreeNode child = (DefaultMutableTreeNode) model.getChild(root, 0);
        System.out.println(child.toString());
    }
}
