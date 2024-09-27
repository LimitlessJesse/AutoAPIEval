import javax.swing.DefaultCellEditor;
import java.awt.Component;

public class DefaultCellEditor_2 {
    public static void main(String[] args) {
        DefaultCellEditor editor = new DefaultCellEditor();
        Component component = editor.getComponent();
        System.out.println("Editor Component: " + component);
    }
}
