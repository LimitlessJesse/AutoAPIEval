import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.Dimension;

public class DefaultTreeCellRenderer_2 {
    public static void main(String[] args) {
        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
        Dimension preferredSize = renderer.getPreferredSize();
        System.out.println("Preferred Size: " + preferredSize);
    }
}
