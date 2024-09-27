import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.TreeCellEditor;
import javax.swing.JTree;
import java.awt.Component;

public class DefaultTreeCellEditor_5 {
    public static void main(String[] args) {
        JTree tree = new JTree();
        TreeCellEditor editor = new DefaultTreeCellEditor(tree);
        Component component = editor.getTreeCellEditorComponent(tree, "Hello", true, true, true, 0);
        System.out.println(component);
    }
}
