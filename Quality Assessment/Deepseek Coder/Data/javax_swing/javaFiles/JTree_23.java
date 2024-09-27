import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTree_23 {
    public static void main(String[] args) {
        // Create a tree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child1);
        root.add(child2);
        JTree tree = new JTree(root);

        // Create a frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Add the tree to a scroll pane
        JScrollPane scrollPane = new JScrollPane(tree);
        frame.add(scrollPane);

        // Make the frame visible
        frame.setVisible(true);

        // Select the second row
        tree.setSelectionRow(1);
    }
}
