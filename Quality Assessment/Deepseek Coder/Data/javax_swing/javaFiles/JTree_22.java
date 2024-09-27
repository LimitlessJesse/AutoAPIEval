import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class JTree_22 {
    public static void main(String[] args) {
        // Create a tree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child1);
        root.add(child2);
        JTree tree = new JTree(root);

        // Create a frame to hold the tree
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JScrollPane(tree));
        frame.setSize(300, 200);
        frame.setVisible(true);

        // Select a node
        tree.getSelectionModel().setSelectionPath(new TreePath(new Object[] {root, child1}));

        // Get the selected path
        TreePath selectedPath = tree.getSelectionModel().getSelectionPath();
        System.out.println("Selected path: " + selectedPath);
    }
}
