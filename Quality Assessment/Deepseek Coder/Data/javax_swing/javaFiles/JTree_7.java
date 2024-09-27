import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTree_7 {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("JTree Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        // Create child nodes
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");

        // Add child nodes to root
        root.add(child1);
        root.add(child2);

        // Create a JTree with the root node
        JTree tree = new JTree(root);

        // Set the root node to be visible
        tree.setRootVisible(true);

        // Add the JTree to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(tree);

        // Add the JScrollPane to the JFrame
        frame.getContentPane().add(scrollPane);

        // Set the size and make the JFrame visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
