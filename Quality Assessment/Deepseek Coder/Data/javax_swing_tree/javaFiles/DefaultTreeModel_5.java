import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class DefaultTreeModel_5 {
    public static void main(String[] args) {
        // Create a root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        // Create a tree model
        DefaultTreeModel model = new DefaultTreeModel(root);

        // Add a listener to the tree model
        model.addTreeModelListener(new TreeModelListener() {
            @Override
            public void treeNodesChanged(TreeModelEvent e) {
                // This method is called when the nodes in the tree change
                System.out.println("Tree nodes changed");
            }

            @Override
            public void treeNodesInserted(TreeModelEvent e) {
                // This method is called when nodes are inserted into the tree
                System.out.println("Tree nodes inserted");
            }

            @Override
            public void treeNodesRemoved(TreeModelEvent e) {
                // This method is called when nodes are removed from the tree
                System.out.println("Tree nodes removed");
            }

            @Override
            public void treeStructureChanged(TreeModelEvent e) {
                // This method is called when the structure of the tree changes
                System.out.println("Tree structure changed");
            }
        });

        // Create a new node
        DefaultMutableTreeNode node = new DefaultMutableTreeNode("Node");

        // Add the new node to the tree
        model.insertNodeInto(node, root, 0);

        // Create a tree path
        TreePath path = new TreePath(new int[] {0});

        // Change the value of the node at the specified path
        model.valueForPathChanged(path, "New Node");
    }
}
