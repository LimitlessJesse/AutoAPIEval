import javax.swing.tree.DefaultTreeCellEditor;
import java.awt.Color;

public class DefaultTreeCellEditor_5 {
    public static void main(String[] args) {
        DefaultTreeCellEditor editor = new DefaultTreeCellEditor(null, null);
        editor.setBorderSelectionColor(Color.RED);
    }
}
