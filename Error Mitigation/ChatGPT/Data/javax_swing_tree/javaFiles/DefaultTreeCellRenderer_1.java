import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.Component;

public class DefaultTreeCellRenderer_1 {
    public static void main(String[] args) {
        JTree tree = new JTree();
        Object value = "Node";
        boolean selected = true;
        boolean expanded = true;
        boolean leaf = false;
        int row = 0;
        boolean hasFocus = true;

        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
        Component component = renderer.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);

        // Use the component for rendering
    }
}
