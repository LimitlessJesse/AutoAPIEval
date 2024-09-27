import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;

public class DefaultTreeSelectionModel_6 {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Tree Selection Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a new DefaultTreeModel
        DefaultTreeModel model = new DefaultTreeModel(new DefaultMutableTreeNode("Root"));

        // Create a new JTree
        JTree tree = new JTree(model);

        // Get the DefaultTreeSelectionModel
        DefaultTreeSelectionModel selectionModel = (DefaultTreeSelectionModel) tree.getSelectionModel();

        // Add a TreeSelectionListener
        selectionModel.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                // Print a message when a node is selected
                System.out.println("A node is selected.");
            }
        });

        // Add the JTree to the JFrame
        frame.add(new JScrollPane(tree));

        // Set the size and make the JFrame visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
