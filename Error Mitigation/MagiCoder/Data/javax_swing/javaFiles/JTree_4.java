import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;

public class JTree_4 {
    public static void main(String[] args) {
        // Create a tree node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child1);
        root.add(child2);

        // Create a tree
        JTree tree = new JTree(root);

        // Create a custom cell renderer
        TreeCellRenderer customRenderer = new CustomTreeCellRenderer();

        // Set the custom cell renderer
        tree.setCellRenderer(customRenderer);

        // Create a frame and add the tree to it
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JScrollPane(tree));
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
