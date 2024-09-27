import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;

public class JTree_11 {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("JTree Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a new DefaultTreeModel
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultTreeModel model = new DefaultTreeModel(root);

        // Create a new JTree
        JTree tree = new JTree(model);

        // Create a custom TreeCellRenderer
        TreeCellRenderer renderer = new DefaultTreeCellRenderer() {
            @Override
            public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
                super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);
                setText("Custom Renderer: " + value.toString());
                return this;
            }
        };

        // Set the custom TreeCellRenderer
        tree.setCellRenderer(renderer);

        // Add the JTree to the JFrame
        frame.add(new JScrollPane(tree), BorderLayout.CENTER);

        // Set the size and make the JFrame visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
