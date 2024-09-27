import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.TreePath;
import java.util.Arrays;

public class DefaultTreeSelectionModel_14 {
    public static void main(String[] args) {
        // Create a tree model
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultTreeModel treeModel = new DefaultTreeModel(root);

        // Create a tree selection model
        DefaultTreeSelectionModel selectionModel = new DefaultTreeSelectionModel();
        selectionModel.setSelectionModel(treeModel);

        // Create some tree nodes
        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Node 1");
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Node 2");
        DefaultMutableTreeNode node3 = new DefaultMutableTreeNode("Node 3");

        // Add nodes to the tree
        root.add(node1);
        root.add(node2);
        node1.add(node3);

        // Select nodes
        selectionModel.addSelectionPath(new TreePath(Arrays.asList(root, node1)));
        selectionModel.addSelectionPath(new TreePath(Arrays.asList(root, node2)));

        // Get the selected paths
        TreePath[] selectedPaths = selectionModel.getSelectionPaths();

        // Print the selected paths
        for (TreePath path : selectedPaths) {
            System.out.println(Arrays.toString(path.getPath()));
        }
    }
}
