import javax.swing.*;
import javax.swing.tree.*;

public class JTree_28 {
    public static void main(String[] args) {
        // Create a tree model
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultTreeModel model = new DefaultTreeModel(root);

        // Create a tree
        JTree tree = new JTree(model);

        // Get the cell editor for the first row and column
        TreeCellEditor editor = tree.getCellEditor(0, 0);

        // Set the editor for the first row and column
        tree.setCellEditor(editor);

        // Show the tree
        JFrame frame = new JFrame("TreeCellEditor Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new JScrollPane(tree));
        frame.pack();
        frame.setVisible(true);
    }
}
