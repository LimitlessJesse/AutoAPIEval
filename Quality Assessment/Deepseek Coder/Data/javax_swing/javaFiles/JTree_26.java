import javax.swing.*;
import javax.swing.tree.*;

public class JTree_26 {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Tree Selection Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JTree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child1);
        root.add(child2);
        JTree tree = new JTree(root);

        // Get the TreeSelectionModel
        TreeSelectionModel selectionModel = tree.getSelectionModel();

        // Add a TreeSelectionListener
        selectionModel.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                TreePath[] paths = e.getNewLeadSelectionPath().getPath();
                for (TreePath path : paths) {
                    System.out.println(path.getLastPathComponent());
                }
            }
        });

        // Add the JTree to the JFrame
        frame.add(tree);

        // Set the size and make the JFrame visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
