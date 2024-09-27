import javax.swing.Icon;
import javax.swing.tree.DefaultTreeCellRenderer;

public class DefaultTreeCellRenderer_4 {
    public static void main(String[] args) {
        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
        Icon openIcon = renderer.getOpenIcon();
        System.out.println("Open icon: " + openIcon);
    }
}
