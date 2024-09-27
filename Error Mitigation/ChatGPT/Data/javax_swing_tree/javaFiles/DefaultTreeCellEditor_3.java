import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellEditor;

public class DefaultTreeCellEditor_3 {
    public static void main(String[] args) {
        DefaultTreeCellEditor treeCellEditor = new DefaultTreeCellEditor(new JTree());
        treeCellEditor.setTree(new JTree());
    }
}
