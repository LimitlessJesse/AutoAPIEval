import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.Color;

public class DefaultTreeCellRenderer_3 {
    public static void main(String[] args) {
        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
        renderer.setBackgroundSelectionColor(Color.RED);
        renderer.setForegroundSelectionColor(Color.BLACK);
    }
}
