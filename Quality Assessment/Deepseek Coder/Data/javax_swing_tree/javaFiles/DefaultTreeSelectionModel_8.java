import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultTreeSelectionModel;

public class DefaultTreeSelectionModel_8 {
    public static void main(String[] args) {
        // Create a tree model
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultTreeModel treeModel = new DefaultTreeModel(root);

        // Create a tree selection model
        DefaultTreeSelectionModel selectionModel = new DefaultTreeSelectionModel();

        // Set the tree model
        selectionModel.setModel(treeModel);

        // Clear the selection
        selectionModel.clearSelection();
    }
}
