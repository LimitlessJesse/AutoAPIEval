import javax.swing.Icon;
import javax.swing.tree.DefaultTreeCellRenderer;

public class DefaultTreeCellRenderer_4 {
    public static void main(String[] args) {
        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
        Icon icon = new javax.swing.ImageIcon(DefaultTreeCellRenderer_4.class.getResource("/path/to/your/icon.png"));
        renderer.setClosedIcon(icon);
    }
}
