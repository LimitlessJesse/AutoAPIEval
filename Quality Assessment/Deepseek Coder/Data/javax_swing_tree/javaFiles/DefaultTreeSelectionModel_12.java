import javax.swing.tree.DefaultTreeSelectionModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class DefaultTreeSelectionModel_12 {
    public static void main(String[] args) {
        // Create a tree model
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child1);
        root.add(child2);

        // Create a tree selection model
        DefaultTreeSelectionModel selectionModel = new DefaultTreeSelectionModel();
        selectionModel.setSelectionPath(new TreePath(new int[] {0}));

        // Get the selected rows
        int[] selectedRows = selectionModel.getSelectionRows();

        // Print the selected rows
        for (int row : selectedRows) {
            System.out.println("Selected row: " + row);
        }
    }
}
