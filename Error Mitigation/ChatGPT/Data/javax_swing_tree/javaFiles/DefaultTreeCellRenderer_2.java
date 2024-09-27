import javax.swing.Icon;
import javax.swing.tree.DefaultTreeCellRenderer;

public class DefaultTreeCellRenderer_2 {
    public static void main(String[] args) {
        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
        Icon closedIcon = renderer.getClosedIcon();
        System.out.println("Closed Icon: " + closedIcon);
    }
}
