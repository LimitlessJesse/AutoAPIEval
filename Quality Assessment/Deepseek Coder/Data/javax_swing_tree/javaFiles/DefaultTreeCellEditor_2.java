import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.TreeCellEditor;
import javax.swing.tree.TreePath;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DefaultTreeCellEditor_2 {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child1);
        root.add(child2);

        JTree tree = new JTree(root);
        JScrollPane scrollPane = new JScrollPane(tree);

        tree.addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent e) {
                TreePath path = tree.getPathForLocation(e.getX(), e.getY());
                if (path!= null) {
                    tree.setSelectionPath(path);
                    TreeCellEditor editor = new DefaultTreeCellEditor(tree);
                    tree.setCellEditor(editor);
                    editor.getTreeCellEditorComponent(tree, path.getLastPathComponent(), true, false, false, 0);
                }
            }
        });

        JFrame frame = new JFrame("Tree Cell Editor Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(scrollPane);
        frame.pack();
        frame.setVisible(true);
    }
}
