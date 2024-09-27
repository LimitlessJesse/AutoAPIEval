import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.TreeSelectionModel;

public class DefaultTreeCellEditor_3 {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child1);
        root.add(child2);

        JTree tree = new JTree(root);
        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);

        DefaultTreeCellEditor editor = new DefaultTreeCellEditor(tree);
        tree.setCellEditor(editor);

        tree.addTreeSelectionListener(e -> {
            if (tree.getEditingPath()!= null) {
                editor.cancelCellEditing();
            }
        });

        JFrame frame = new JFrame();
        frame.add(new JScrollPane(tree));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
