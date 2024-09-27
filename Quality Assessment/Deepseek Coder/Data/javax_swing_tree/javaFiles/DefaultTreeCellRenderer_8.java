import javax.swing.*;
import javax.swing.tree.*;

public class DefaultTreeCellRenderer_8 {
    public static void main(String[] args) {
        // Create a tree model
        DefaultTreeModel model = new DefaultTreeModel(new DefaultMutableTreeNode("Root"));

        // Create a tree
        JTree tree = new JTree(model);

        // Create a tree cell renderer
        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();

        // Set a closed icon
        renderer.setClosedIcon(UIManager.getIcon("Tree.closedIcon"));

        // Set the tree cell renderer
        tree.setCellRenderer(renderer);

        // Add the tree to a frame
        JFrame frame = new JFrame();
        frame.add(tree);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
