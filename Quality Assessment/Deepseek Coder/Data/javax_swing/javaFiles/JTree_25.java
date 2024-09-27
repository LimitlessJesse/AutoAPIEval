import javax.swing.*;
import javax.swing.tree.*;

public class JTree_25 {
    public static void main(String[] args) {
        // Create a tree model
        DefaultTreeModel model = new DefaultTreeModel(new DefaultMutableTreeNode("Root"));

        // Create a tree
        JTree tree = new JTree(model);

        // Create a tree selection model
        TreeSelectionModel selectionModel = new DefaultTreeSelectionModel();

        // Set the tree's selection model
        tree.setSelectionModel(selectionModel);

        // Add a listener to the tree
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                // Get the selected nodes
                TreePath[] selectedPaths = e.getPaths();

                // Print the selected nodes
                for (TreePath selectedPath : selectedPaths) {
                    System.out.println(selectedPath.getLastPathComponent());
                }
            }
        });

        // Create a frame
        JFrame frame = new JFrame("Tree Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the tree to the frame
        frame.add(tree);

        // Set the frame size and make it visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
