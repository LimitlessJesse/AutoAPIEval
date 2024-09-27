import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class JTree_21 {
    public static void main(String[] args) {
        // Create a tree model
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child1);
        root.add(child2);

        // Create a tree
        JTree tree = new JTree(root);

        // Create a frame
        JFrame frame = new JFrame("JTree Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the tree to a scroll pane
        JScrollPane scrollPane = new JScrollPane(tree);
        frame.getContentPane().add(scrollPane);

        // Set the frame size
        frame.setSize(300, 200);

        // Make the frame visible
        frame.setVisible(true);

        // Create a tree path
        TreePath path = new TreePath(new Object[] {root, child1});

        // Set the selection path
        tree.setSelectionPath(path);
    }
}
