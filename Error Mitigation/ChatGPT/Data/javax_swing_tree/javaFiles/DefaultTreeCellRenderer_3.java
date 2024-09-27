import javax.swing.Icon;
import javax.swing.tree.DefaultTreeCellRenderer;

public class DefaultTreeCellRenderer_3 {
    public static void main(String[] args) {
        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
        Icon leafIcon = renderer.getLeafIcon();
        System.out.println("Icon for leaf nodes: " + leafIcon);
    }
}
