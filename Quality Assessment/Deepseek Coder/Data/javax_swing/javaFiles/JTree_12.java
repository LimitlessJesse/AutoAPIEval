import javax.swing.*;
import javax.swing.tree.*;

public class JTree_12 {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("TreeCellRenderer Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a new DefaultMutableTreeNode
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        // Create a new JTree with the root node
        JTree tree = new JTree(root);

        // Get the default cell renderer
        TreeCellRenderer renderer = tree.getCellRenderer();

        // Set the cell renderer for the tree
        tree.setCellRenderer(renderer);

        // Add some child nodes
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child1);
        root.add(child2);

        // Add the tree to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(tree);

        // Add the scroll pane to the frame
        frame.getContentPane().add(scrollPane);

        // Set the size and make the frame visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
