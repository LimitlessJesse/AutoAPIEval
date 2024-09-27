import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.TreePath;
import java.awt.event.MouseEvent;

public class DefaultTreeCellEditor_2 {
    public static void main(String[] args) {
        DefaultTreeCellEditor editor = new DefaultTreeCellEditor();
        MouseEvent event = new MouseEvent(null, 0, 0, 0, 0, 0, 0, false);
        TreePath path = new TreePath(new Object[]{"root"});
        editor.setPath(path);
        System.out.println(editor.isCellEditable(event));
    }
}
