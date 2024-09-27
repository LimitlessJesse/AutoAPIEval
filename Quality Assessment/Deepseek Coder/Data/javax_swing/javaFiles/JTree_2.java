import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;

public class JTree_2 {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("JTree Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        // Create child nodes
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");

        // Add child nodes to root node
        root.add(child1);
        root.add(child2);

        // Create a JTree with the root node
        JTree tree = new JTree(root);

        // Get the TreeModel from the JTree
        TreeModel model = tree.getModel();

        // Add the JTree to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(tree);
        frame.getContentPane().add(scrollPane);

        // Set the size and make the frame visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
