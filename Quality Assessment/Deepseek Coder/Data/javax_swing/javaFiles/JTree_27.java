import javax.swing.*;
import javax.swing.tree.*;

public class JTree_27 {
    public static void main(String[] args) {
        // Create a tree model
        DefaultTreeModel model = new DefaultTreeModel(new DefaultMutableTreeNode("Root"));

        // Create a tree
        JTree tree = new JTree(model);

        // Create a tree cell editor
        DefaultCellEditor editor = new DefaultCellEditor(new JTextField());

        // Set the tree cell editor
        tree.setCellEditor(editor);

        // Add the tree to a frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new JScrollPane(tree));
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
