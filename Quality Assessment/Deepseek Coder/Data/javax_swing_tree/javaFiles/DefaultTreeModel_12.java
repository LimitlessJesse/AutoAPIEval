import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class DefaultTreeModel_12 {
    public static void main(String[] args) {
        // Create a tree model
        DefaultTreeModel model = new DefaultTreeModel(new DefaultMutableTreeNode("Root"));

        // Create a tree model listener
        TreeModelListener listener = new TreeModelListener() {
            @Override
            public void treeNodesChanged(TreeModelEvent e) {
                System.out.println("Tree nodes changed");
            }

            @Override
            public void treeNodesInserted(TreeModelEvent e) {
                System.out.println("Tree nodes inserted");
            }

            @Override
            public void treeNodesRemoved(TreeModelEvent e) {
                System.out.println("Tree nodes removed");
            }

            @Override
            public void treeStructureChanged(TreeModelEvent e) {
                System.out.println("Tree structure changed");
            }
        };

        // Add the listener to the tree model
        model.addTreeModelListener(listener);

        // Add a new node to the tree model
        DefaultMutableTreeNode newNode = new DefaultMutableTreeNode("New Node");
        model.insertNodeInto(newNode, null, 0);
    }
}
