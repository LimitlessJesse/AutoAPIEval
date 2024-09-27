import javax.swing.*;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.*;

public class DefaultTreeCellRenderer_1 {
    public static void main(String[] args) {
        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
        JTree tree = new JTree();
        Object value = tree.getModel().getRoot();
        boolean selected = true;
        boolean expanded = true;
        boolean leaf = false;
        int row = 0;
        boolean hasFocus = true;

        Component component = renderer.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);
        System.out.println(component);
    }
}
