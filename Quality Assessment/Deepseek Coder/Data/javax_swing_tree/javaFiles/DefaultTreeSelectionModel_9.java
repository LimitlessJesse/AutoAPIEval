import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreePath;

public class DefaultTreeSelectionModel_9 {
    public static void main(String[] args) {
        // Create a tree model
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultTreeModel treeModel = new DefaultTreeModel(root);

        // Create a tree selection model
        DefaultTreeSelectionModel selectionModel = new DefaultTreeSelectionModel();
        selectionModel.setSelectionModel(treeModel);

        // Create a tree path
        TreePath treePath = new TreePath(new int[] {0});

        // Set the tree path
        selectionModel.setSelectionPath(treePath);

        // Check if the path is selected
        boolean isSelected = selectionModel.isPathSelected(treePath);
        System.out.println("Is path selected? " + isSelected);
    }
}
